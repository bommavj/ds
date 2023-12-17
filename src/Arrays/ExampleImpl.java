package Arrays;

public class ExampleImpl implements Example{
    public void add() {
        System.out.println("Some Blah");
    }

    public static void main(String[] args) {
        Example e = new ExampleImpl();
        e.add();
        Example.hello("abc");
        e.add2();
    }
}
