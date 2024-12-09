package ArraysStrings;

public class MaxSubArraySum {

    public static void main(String[] args) {
        int arr[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int maxSum = maxSubArraySum(arr);
        System.out.println(maxSum);
    }

    private static int maxSubArraySum(int[] arr) {
        int maxSum = 0;
        int curr_sum = arr[0];
        for(int i=1; i<arr.length; i++){
            curr_sum += arr[i];
            if(curr_sum < 0){
                curr_sum = 0;
            }else{
                maxSum = Math.max(maxSum, curr_sum);
            }
        }
        return maxSum;
    }
}

