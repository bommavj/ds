package ArraysStrings;

import java.util.HashMap;
import java.util.Map;

public class ArraySum {

    public static void main(String[] args) {
        int[] arr = {2,7,8,11,15};
        int targetSum = 19;

        int[] usingMap = findUsingMap(arr, targetSum);
        System.out.println(usingMap);

        int[] twoSum = findTwoSum(arr, targetSum);
        System.out.println(twoSum);

        int[] twoSum_sorting = findTwoSum_Sorting(arr, targetSum);
        System.out.println(twoSum_sorting);

        int[] indexes = findIndexes(arr, targetSum);
        System.out.println(indexes);

        boolean isSubseq = subSequence("ace", "abcde");
        System.out.println(isSubseq);
    }

    private static boolean subSequence(String s, String t) {
        int i = 0;
        int j = 0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    private static int[] findIndexes(int[] arr, int targetSum) {
        //int[] finalIndex = new int[]{0,0};
        int left = 0, right = arr.length - 1;
        for(int i=0; i<arr.length; i++) {
            if (arr[left] + arr[right] == targetSum) {
               return new int[]{left, right};
            } else if (arr[left] + arr[right] < targetSum) {
              left++;
            } else {
              right--;
            }
        }
        return new int[]{0,0};
    }

    private static int[] findTwoSum_Sorting(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            if(nums[left] + nums[right] == target) {
                return new int[] {nums[left], nums[right]};
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }

    private static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[] {};
    }

    // target = 19
    //int[] arr = {2,7,8,11,15};
   static int[] findUsingMap(int[] nums, int target){
        Map<Integer, Integer> m = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(m.containsKey(complement)){
                return new int[]{m.get(complement), i};
            }else{
                m.put(nums[i], i);
            }
        }
        return new int[]{0,0};
    }

}
