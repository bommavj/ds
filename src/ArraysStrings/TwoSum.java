package ArraysStrings;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {2,7,8,11,15};
        int targetSum = 19;

        int[] indexes = towSumIndex(arr, targetSum);
        System.out.println(indexes);

        int[] indexes2 = twoSumPointers(arr, targetSum);
        System.out.println(indexes2);
    }

    private static int[] towSumIndex(int[] arr, int targetSum) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int ind = targetSum - arr[i];
            if(map.containsKey(ind)){
                return new int[]{map.get(ind), i};
            }
            map.put(arr[i], i);
        }
        return new int[0];
    }

    private static int[] twoSumPointers(int[] arr, int targetSum){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            if(arr[left] + arr[right] == targetSum){
                return new int[]{left, right};
            }else if(arr[left] + arr[right] < targetSum){
                left++;
            }else{
                right--;
            }
        }
        return new int[0];
    }
}
