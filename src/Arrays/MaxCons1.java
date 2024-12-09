package Arrays;

public class MaxCons1 {
    public static void main(String[] args) {
        MaxCons1 cons1 = new MaxCons1();
        int val = cons1.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1});
        int val2 = cons1.findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1});

        findMaxConsecutiveOnesAnother(new int[]{1, 1, 0, 1, 1, 1});
        findMaxConsecutiveOnesThird(new int[]{1, 1, 0, 1, 1, 1});

        System.out.println(val);
        System.out.println(val2);
    }


    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1) {
                max = Integer.max(count, max);
                count = 0;
            }else {
                count++;
            }
        }
        max = Integer.max(count, max);
        return max;
    }

    public static int findMaxConsecutiveOnesAnother(int[] nums) {
        int max=0,j=-1,i=0;
        for(;i<nums.length;i++){
            if(nums[i]==0){
                max=Math.max(max,i-j-1);
                j=i;
            }
        }
        return Math.max(max,i-j-1);
    }

    public static int findMaxConsecutiveOnesThird(int[] nums) {
        int max = 0, secondMax = 0;
        for(int val : nums){
            if(val != 1){
                if(max > secondMax){
                    secondMax = max;
                }
                max = 0;
            }else{
                max++;
            }
        }
        return Math.max(max,secondMax);
    }
}
