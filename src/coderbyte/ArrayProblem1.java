package coderbyte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayProblem1 {

    public static void main(String[] args) {
        int[] nums = new int[]{7, 3, 5, 2, -4, 8, 11};
        int firstEle = nums[0];
        Arrays.sort(nums);
        //-4,2,3,5,7,8,11
        String pairs = findPairs(firstEle, nums);
        System.out.println(pairs);
        /*String pairsTwo = findPairs(nums);
        System.out.println(pairsTwo);*/
    }

    private static String findPairs(int firstEle, int[] arr) {
        List<String> list = new ArrayList<>();
        int sum = 0;
        int low=0;
        int high=arr.length-1;
        while(low < high){
                if (arr[low] + arr[high] == firstEle) {
                    list.add(arr[low] + "," + arr[high]);
                    low++;
                    high--;
                }else if(arr[low] + arr[high] > firstEle){
                    high--;
                }else if(arr[low] + arr[high] < firstEle){
                    low++;
                }
        }
        return String.join(" ", list);
    }

    private static String findPairs(int[] nums){
        List<String> list = new ArrayList<>();
        int sum = 0;
        int index = 1;
        for(int i=1; i<nums.length; i++){
            sum += nums[i];
            if(sum == nums[0]){
                list.add(nums[i-1]+","+nums[i]);
                sum -= nums[index];
                index++;
            }
            if(sum > nums[0]){
                sum -= nums[index];
                index++;
            }else if(sum < nums[0]){
                i = index;
            }
            /*else if(sum <= 0){
                sum = nums[i];
            }*/
        }
        //5,2 -4,11
        return String.join(" ", list);
    }
}
