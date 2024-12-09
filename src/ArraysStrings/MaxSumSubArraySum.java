package ArraysStrings;

public class MaxSumSubArraySum {

    public static void main(String[] args) {
        int arr[] = new int[] {10,19,4,2,1,7,8,1,2,8,1,9};
        int k  = 2;
        int maxSum = maxSumSubArray(arr, k);
        System.out.println(maxSum);
    }

    private static int maxSumSubArray(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<arr.length; i++){
            currSum += arr[i];
            if(i >= k - 1)
            {
                maxSum = Math.max(maxSum, currSum);
                currSum -= arr[i - (k-1)];
            }
        }
        return maxSum;
    }
}
