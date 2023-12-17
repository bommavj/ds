package Arrays;

public interface Example {

    void add();

    static void hello(String... args) {
        Example e = () -> System.out.println("ADD");
        System.out.println("EP8");
        e.add();
    }

    default void add2(){
        System.out.println("ADD2");
    }
}
