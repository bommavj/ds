package ArraysStrings;

public class RotateArrrayK {
    public static void main(String[] args) {
        //int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        //int k = 3;
/*        reverseArray(arr, 0);
        System.out.println(arr);
        reverseArray(arr, 3);
        //rotate(arr, 3);
        System.out.println(arr);*/
        int arr[] = new int[]{1,2};
        int k = 3;
        //System.out.println(arr % k);

        k = k%arr.length;
        System.out.println(k);
        reverseArrayIndex(arr, 0, arr.length-1);
        reverseArrayIndex(arr, 0, k-1);
        reverseArrayIndex(arr, k, arr.length-1);

        System.out.println(arr);
    }

    private static void reverseArrayIndex(int[] arr, int start, int end){
        for(int i=start; i<end; i++){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static void reverseArray(int[] arr, int k) {
        int left = k;
        int right = arr.length-1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void rotate(int[] nums, int k) {
        int p = nums.length - 1;
        while (k > 0) {
            int ele = nums[p];
            for (int i = nums.length; i >= 2; i--) {
                int lastFirst = nums[i - 2];
                nums[i-1] = lastFirst;
            }
            nums[0] = ele;
            k--;
        }
    }

}