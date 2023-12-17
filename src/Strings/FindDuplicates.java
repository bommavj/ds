package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicates {

    public static void main(String[] args) {
        int[] ar = new int[]{1,2,3,1};
        containsDuplicate2(ar);
    }

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
        }
        return false;


       /* Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            }else{
                map.put(nums[i], nums[i]);
            }
        }
        return false;*/
    }

    public static void containsDuplicate2(int[] nums) {

        for(int i=0; i<nums.length; i++){
            if(nums[i] % 10 == nums[i]){

            }
        }

        /*for (int i = 0; i < nums.length; i++) {
            nums[nums[i] % nums.length] = nums[nums[i] % nums.length] + nums.length;
        }
        System.out.println("The repeating elements are : ");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= nums.length * 2) {
                System.out.println(i + " ");
            }
        }*/
    }
}
