package Strings;

public class MaxSubArray {

    public static void main(String[] args) {
        int[] arr = new int[]{-1,-1};
        int val = maxSubArray(arr);
        System.out.println(val);
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(sum > maxSum){
                maxSum = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }
}
