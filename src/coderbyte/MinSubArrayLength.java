package coderbyte;

public class MinSubArrayLength {

    public static void main(String[] args) {
        int arr[] = new int[]{2,3,1,2,4,3};
        int target = 7;

        int minSubArrayLen = findMinSubArrayLength(arr, target);
        System.out.println(minSubArrayLen);
    }

    private static int findMinSubArrayLength(int[] arr, int target) {
        int minSize = Integer.MAX_VALUE;
        int wStart = 0;
        int currSum = 0;
        for(int wEnd =0; wEnd< arr.length; wEnd++){
            currSum += arr[wEnd];
            while(currSum >= target){
                minSize = Math.min(minSize, wEnd-wStart+1);
                currSum-=arr[wStart];
                wStart++;
            }
        }
        return minSize == Integer.MAX_VALUE ? 0 : minSize;
    }
}
