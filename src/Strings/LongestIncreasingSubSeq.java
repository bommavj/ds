package Strings;

public class LongestIncreasingSubSeq {

    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }

    public static int lengthOfLIS(int[] nums) {
        int result = 0;
        int anchor = 0;

        for(int i=0; i<nums.length; i++){
            if(i > 0 && nums[i-1] >= nums[i]) {
                anchor = i;
                System.out.println("Acnhor " + anchor);
            }

            result = Math.max(result, i-anchor+1);
        }
        return result;
    }
}
