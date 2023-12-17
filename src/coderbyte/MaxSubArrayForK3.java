package coderbyte;

public class MaxSubArrayForK3 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,9,31,-4,21,7};
        int k = 3;
        int maxSum = findMaxSubArrayForK3(nums, k);
        System.out.println(maxSum);

        int maxSum2 = findMaxSubArrayForK3With2pointers(nums, k);
        System.out.println(maxSum);
    }

    private static int findMaxSubArrayForK3(int[] nums, int k) {
        int maxSum = 0;
        int windowSum = 0;
        for(int i=0; i<nums.length; i++){
            windowSum += nums[i];
            if(i >= k - 1){
                maxSum = Math.max(windowSum, maxSum);
                windowSum -= nums[i-k+1];
            }
        }
        return maxSum;
    }

    private static int findMaxSubArrayForK3With2pointers(int[] nums, int k) {
        int maxSum = 0;
        int windowSum = 0;
        int windowStart = 0;
        for(int i=0; i<nums.length; i++){
            windowSum += nums[i];
            if(i >= k - 1){
                maxSum = Math.max(windowSum, maxSum);
                windowSum -= nums[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }
}
