package coderbyte;

public class WindowSumToK {

    public static void main(String[] args) {
        int[] nums = new int[]{2,9,31,-4,21,7};
        int k = 3;
        int maxSum = findMaxKValue(k, nums);
        System.out.println(maxSum);
    }

    private static int findMaxKValue(int k, int[] nums) {
        int maxSum = 0;
        int windowSum = 0;
        for(int i=0; i<nums.length; i++){
            windowSum += nums[i];
            if(i >= k-1){
                maxSum = Math.max(windowSum, maxSum);
                windowSum -= nums[i-k+1];
            }
        }
        return maxSum;
    }
}
