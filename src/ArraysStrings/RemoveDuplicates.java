package ArraysStrings;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int arr[] = new int[]{1,1,2,2,2,3,3};
        int afterRemove = removeDuplicates(arr);
        System.out.println(afterRemove);
    }

    private static int removeDuplicates(int[] arr) {
        int newArr[] = new int[arr.length];
        int p = 0;
        int count = 1;
        int ele = arr[0];
        newArr[p] = ele;
        for(int i=1; i<arr.length; i++){
            if(arr[i] != ele){
                newArr[++p] = arr[i];
                count++;
            }
            ele = arr[i];
        }
        return count;
    }


    /*private static int[] removeDuplicates(int[] arr) {
        int[] finVals = new int[arr.length];
        int start = arr[0];
        int pointer = 0;
        finVals[pointer] = start;
        for(int i=1; i<arr.length; i++){
            if(start != arr[i]){
                pointer++;
                finVals[pointer]= arr[i];
            }
            start = arr[i];
        }

        int[] fi = new int[pointer+1];
        for(int i=0; i<=pointer; i++){
            fi[i] = finVals[i];
        }
        return fi;
    }*/
}
