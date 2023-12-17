package blockingqueue;

import java.util.concurrent.ThreadLocalRandom;

class BlockingQueue {

    Object items[] = new Object[100];
    int putptr, getptr, count;
    boolean closed = false;

    public synchronized void put(Object x) throws InterruptedException {
        while (count == items.length) {
            wait();
        }
        items[putptr] = x;
        if (++putptr == items.length)
            putptr = 0;

        ++count;
        notifyAll();
    }

    public synchronized Object take() throws InterruptedException {
        while (count == 0) {
            wait();
        }
        Object x = items[getptr];
        if (++getptr == items.length)
            getptr = 0;
        --count;
        notifyAll();
        return x;
    }

    public synchronized boolean isClosed() {
        return closed;
    }

    public synchronized void setClosed(boolean closed) {
        this.closed = closed;
    }
}

class Producer implements Runnable {

    private final BlockingQueue blockingQueue;

    Producer(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {

        try {
            while (!blockingQueue.isClosed()) {
                blockingQueue.put(produce());
            }
        } catch (Exception e) {

        }
    }

    private Object produce() {
        return new SquareTask(ThreadLocalRandom.current().nextInt(1, 200));
    }
}

class Consumer implements Runnable {
    private final BlockingQueue blockingQueue;

    Consumer(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (!blockingQueue.isClosed()) {
            try {
                consume((SquareTask) blockingQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private void consume(SquareTask x) {
        x.execute();
    }
}

class SquareTask{

    int nextInt;

    public SquareTask(int nextInt) {
        this.nextInt = nextInt;
    }

    public void execute() {
        System.out.println("Executing Square Task " + nextInt);
    }
}

public class ProducerConsumerProblem{

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue boundedBuffer = new BlockingQueue();
        Producer p = new Producer(boundedBuffer);
        Consumer c1 = new Consumer(boundedBuffer);
        Consumer c2 = new Consumer(boundedBuffer);
        new Thread(p).start();
        new Thread(c1).start();
        new Thread(c2).start();
        Thread.sleep(100);
        boundedBuffer.setClosed(true);
    }

}

