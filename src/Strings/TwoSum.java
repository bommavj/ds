package Strings;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = new int[] {3,2,4};
        int target = 6;

        int[] index = findTwoSum(arr, target);
        System.out.println(index);
    }

    private static int[] findTwoSum(int[] arr, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            if (hm.containsKey(target - arr[i])){
                return new int[]{hm.get(target-arr[i]), i};
            }else{
                hm.put(arr[i], i);
            }
        }
        return new int[]{};
    }
}
