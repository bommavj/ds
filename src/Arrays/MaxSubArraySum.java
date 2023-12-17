package Arrays;

public class MaxSubArraySum {

    public static void main(String[] args) {
        int[] arr = new int[] {100,200,300,400};
        int size =2;
        int maxsubSum = maxSumSubArr(arr, size);
        System.out.println(maxsubSum);
    }

    private static int maxSumSubArr(int[] arr, int k) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0 ;i<arr.length; i++){
            currentSum += arr[i];
            if(i >= k-1 && currentSum > maxSum){
                maxSum = Math.max(currentSum, maxSum);
                currentSum -= arr[i - (k-1)];  // iter 1 :: i=2, k-1= 3-1=2
            }
        }
        return maxSum;
    }

    //first window = i - (k-1) -> 2 - (3-1) -> 2 - 2 = 0
    //second window = 3 - (3-1) -> 3 - 2 = 1
    //third window = 4 - 2 = 2
    // fourth window = 5 - 2 = 3
}
