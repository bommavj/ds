package Arrays;

public class PrintAllSubArrays {

    public static void main(String[] args) {
        int[] arr = new int[] {2, 3, 1, 2, 4 , 3};
        printAll(arr);
    }

    private static void printAll(int[] arr) {
        for(int i=0;i<arr.length; i++){
            for(int j=i;j<arr.length; j++){
                for(int k=i;k<=j; k++){
                    System.out.print(arr[k] + " ");
                }
            }
            System.out.println();
        }
    }

}
