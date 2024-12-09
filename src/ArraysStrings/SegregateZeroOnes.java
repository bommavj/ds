package ArraysStrings;

public class SegregateZeroOnes {

    public static void main(String[] args) {

        int[] arr = new int[] {1,0,1,1,0,1,0,0,1,1,0,1};
        int[] finalArr = segments2(arr);
        System.out.println(finalArr);
    }

    private static int[] segments(int[] arr) {
        int pointer = 0;
        //int[] finalArr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0) {
                arr[i] = 0;
                pointer++;
            }
        }

        /*for(int i=arr.length-1; i>=pointer-1; i--){
            arr[i] = 1;
        }*/

        for(int i=pointer-1; i<arr.length; i++){
            arr[i] = 1;
        }

        return arr;
    }

    private static int[] segments2(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
           if(arr[left] == 1 && arr[right] == 0){
               arr[left] = 0;
               arr[right] = 1;
           }else if(arr[left] == 1){
               right--;
           }else if(arr[right] == 0){
               left++;
           }else if(arr[left] == 0){
               left++;
           }else if(arr[right] == 1){
               right--;
           }
        }
        return arr;
    }
}
