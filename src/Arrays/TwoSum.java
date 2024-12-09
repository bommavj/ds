package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int arr[] = {2,5,7,8,10};
        int target = 17;
        int s[] = findIndexes2Sum(arr, target);
        System.out.println(s[0] + " " + s[1]);
    }

    private static int[] findIndexes2Sum(int[] arr, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(hm.containsKey(target - arr[i])){
                return new int[]{hm.get(target-arr[i]), i};
            }else{
                hm.put(arr[i], i);
            }
        }
        return new int[]{0, 0};
    }
}
