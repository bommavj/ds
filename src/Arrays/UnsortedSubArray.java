package Arrays;

public class UnsortedSubArray {

    public static void main(String[] args) {
        findUnsortedSubarray(new int[]{});
    }

    public static int findUnsortedSubarray(int[] nums) {
        // Initialize the pointers
        int left = 0;
        int right = nums.length - 1;
        // Iterate through the array from the left and right sides, updating the pointers as you go
        while (left < right && nums[left] <= nums[left + 1]) {
            left++;
        }
        while (right > left && nums[right] >= nums[right - 1]) {
            right--;
        }
        // Return the length of the subarray between the pointers
        return right - left + 1;
    }

}
