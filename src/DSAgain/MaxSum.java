package DSAgain;

public class MaxSum {
    public static void main(String[] args) {
        int n[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int val = maxSubArray(n);
        System.out.println(val);
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int curr_sum = 0;
        for(int n : nums){
            curr_sum += n;
            maxSum = Math.max(curr_sum, maxSum);
            if(curr_sum < 0){
                curr_sum = 0;
            }
        }
        return maxSum;
    }
}
