package Arrays;

public class MinimumSumSubArray {

    //Trick:::  see findMinSumSubArray2

    public static void main(String[] args) {
        int[] arr = new int[] {2, 3, 1, 2, 4 , 3};
        //int[] arr = new int[] {1,1,1,1};
        int sum =7;
        int len = findMinSumSubArray(arr, sum);
        System.out.println(len);

        //efficient method
        int len2 = findMinSumSubArray2(arr, sum);
        System.out.println(len2);
    }



    private static int findMinSumSubArray(int[] arr, int sum) {
        int minSize = Integer.MAX_VALUE;
        int runningSum = 0;
        int count = 1;
        int pointer = 0;
        for (int i=0; i<arr.length ; i++){
            runningSum += arr[i];
            if(runningSum >= sum) {
                minSize = Math.min(minSize, count);
                i = pointer++;
                runningSum = 0;
                count = 1;
            }
            else{
                count++;
            }
        }
        return minSize;
    }

    private static int findMinSumSubArray2(int[] arr, int sum) {
        int minSize = Integer.MAX_VALUE;
        int runningSum = 0;
        int left = 0;
        for (int i=0; i<arr.length ; i++){
            runningSum += arr[i];
            while(runningSum >= sum) {
                minSize = Math.min(minSize, i+1-left);
                runningSum -= arr[left];
                left++;
            }
        }
        if(minSize == Integer.MAX_VALUE)
            minSize =  0;
        return minSize;
    }
}
