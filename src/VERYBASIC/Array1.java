package VERYBASIC;

public class Array1 {

    public static void main(String[] args) {
        int[] a = new int[]{10,20,30,40,50};
        //insertFirst(a, 5);
        //printArr(a);
        /*System.out.println();
        insertLast(a, 35);
        printArr(a);*/

        insertAt(a, 25, 2);

        //deleteFromEnd(a);
    }

    /*private static int[] deleteFromEnd(int[] a) {
        return 
    }*/

    private static void insertAt(int[] a, int val, int index) {
        for(int i=a.length-1; i>index; i--){
            a[i] = a[i-1];
        }
        a[index]=val;
    }

    private static void printArr(int[] a) {
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + ",");
        }
    }

    private static void insertFirst(int[] a, int val) {
        for(int i=a.length-1; i>0; i--){
           a[i] = a[i-1];
        }
        a[0] = val;
    }

    /*private static void insertLast(int[] a, int val){
        for(int i=0; i<a.length-1; i++){
            a[i] = a[i+1];
        }
        a[a.length-1] = val;
    }*/
}
