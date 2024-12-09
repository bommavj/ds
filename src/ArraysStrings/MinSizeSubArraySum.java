package ArraysStrings;

public class MinSizeSubArraySum {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,1,2,4,3};
        int target = 7;
        int minSizeArray = minSizeSubArraySum(arr, target);
        System.out.println(minSizeArray);
    }

    private static int minSizeSubArraySum(int[] arr, int target) {
        int L=0, R = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while( R < arr.length ){
            sum += arr[R];
            while(target <= sum){
                min = Math.min(min, R - L + 1);
                sum -= arr[L];
                L++;
            }
            R++;
        }
        return min == Integer.MAX_VALUE ? 0: min;
    }
}
