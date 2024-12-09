package Arrays;

public class MissingNum {

    public static void main(String[] args) {
        int [] arr = {1,2,4,3,6,8,7};
        int num = findMissingNum(arr);
        System.out.println(num);
    }

    private static int findMissingNum(int[] arr) {
        int currtotal = 0;
        for(int n : arr){
            currtotal += n;
        }
        int n = arr.length + 1;
        int totalSum =  (n * (n + 1)) / 2;
        return totalSum - currtotal;
    }
}
