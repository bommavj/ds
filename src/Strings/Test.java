package Strings;

 class Test {

     public static void main(String[] args) {
         T1 t = new T2();
         t.me();
     }
}

class T1 {
    void me() throws NullPointerException{
        System.out.println("m1");
    }
}

class T2 extends T1 {
    void me() throws RuntimeException{
        System.out.println("m2");
    }
}