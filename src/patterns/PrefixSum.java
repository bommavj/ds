package patterns;

public class PrefixSum {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        int result[] = findPrefixSum(arr);
        for(int n:result){
            System.out.print(n +" ");
        }

        int[] arr2 = new int[]{-2,-3,4,-1,-2,1,5,-3};
        int maxSum = findSubArraySum(arr2);
        System.out.println("max sum = "+ maxSum);
    }

    private static int findSubArraySum(int[] arr2) {
        int maxSum = arr2[0];
        int curr_sum = arr2[0];
        for(int i=1; i<arr2.length; i++){
            curr_sum = Integer.max(arr2[i], curr_sum + arr2[i]);
            maxSum = Integer.max(maxSum, curr_sum);
        }
        return maxSum;
    }

    public static int[] findPrefixSum(int[] arr){
        //int[] res = new int[arr.length];
        for(int i=1; i<arr.length; i++) {
            arr[i] = arr[i] + arr[i-1];
            System.out.println(arr[i]);
        }
        return arr;
    }

}
