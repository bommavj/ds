package Arrays;

public class Rotate90 {

    public static void main(String[] args) {
        int arr[][] = {  {1,2,3}, {4,5,6}, {7,8,9} };
        printMatrix(arr);
        System.out.println();
        printMatrixFlip(arr);
    }

    private static void printMatrix(int[][] arr) {
        for(int i=0;i <arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printMatrixFlip(int[][] arr) {
        for(int i=arr.length-1; i >= 0; i--){
            for(int j=arr[i].length-1; j >= 0; j--){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}