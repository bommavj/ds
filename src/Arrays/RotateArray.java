package Arrays;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int arr[]= new int[] {1, 2, 3, 4, 5};
        int rotations = 2;
        int[] ints = rotateArray(arr, rotations);
        for (int a : ints){
            System.out.print(a + " ");
        }
    }

    public static int[] rotateArray(int[] arr, int rotations) {
        // Split the array into two parts
        int n = arr.length;
        int[] first = Arrays.copyOfRange(arr, 0, rotations);
        int[] second = Arrays.copyOfRange(arr, rotations, n);
        // Reverse the first part
        reverse(first);
        // Reverse the second part
        reverse(second);
        // Reverse the entire array
        reverse(arr);
        return arr;
    }

    private static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
