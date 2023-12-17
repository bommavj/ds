package Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int v = removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
        System.out.println(v);
    }

    public static int removeDuplicates(int[] nums) {
        int i = 1;
        for(int j=1; j<nums.length; j++){
            if(nums[j] != nums[j-1]){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
