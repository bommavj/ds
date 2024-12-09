package Heaps;

public class MinHeap {

    int[] heap = new int[0];
    int size;

    MinHeap(int capacity){
        heap = new int[capacity];
        size = 0;
    }

   private boolean isFull(){
        return size == heap.length;
   }

   private boolean isValidIndex(int index){
        return index >= 0 && index < size;
   }

}
