package ArraysStrings;

public class PlusOne {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4};
        int val = doPlusOne(arr);
        System.out.println(val);
    }

    private static int doPlusOne(int[] arr) {
        //1 * 100 + 2 * 10 + 3 * 1;
        int cond = 1;
        for(int i=0; i<arr.length-1; i++){
            cond *= 10;
        }

        int sum = 0;
        for(int n : arr){
            sum += n * cond;
            cond = cond / 10;
        }

        return sum + 1;
    }
}
