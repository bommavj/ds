package DSAgain;

public class TwoSum {

    public static void main(String[] args) {
        int arr[] = new int[]{3,2,4};
        int[] aa = twoSum(arr, 6);
        System.out.println(aa);
    }

    public static int[] twoSum(int[] nums, int target) {
        int runSum = nums[0];
        int pointer = 0;
        for (int i = 1; i <= nums.length; i++) {
            runSum += nums[i];
            if (runSum < target) {
                runSum -= nums[pointer];
            } else if (runSum > target) {
                runSum -= nums[pointer];
            } else if (runSum == target) {
                return new int[]{pointer, i};
            }
            pointer++;
        }

        return new int[]{};
    }
}
