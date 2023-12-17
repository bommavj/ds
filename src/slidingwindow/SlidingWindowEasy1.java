package slidingwindow;

public class SlidingWindowEasy1 {

    public static void main(String[] args) {

        int arr [] = new int[]{1,3,5,4,7,9,11,13};
        int res = findLongestContiniousIncreasingSubseq(arr);
        System.out.println(res);
    }

    private static int findLongestContiniousIncreasingSubseq(int[] arr) {

        int result = 0;
        int anchor = 0;

        for(int i=0; i<arr.length; i++){
            if(i > 0 && arr[i-1] >= arr[i]) anchor = i;
            result = Math.max(result, i - anchor  + 1);
        }

        return result;
    }


}
