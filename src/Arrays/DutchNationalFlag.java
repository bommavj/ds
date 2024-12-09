package Arrays;

public class DutchNationalFlag {

    public static void main(String[] args) {
        int[] arr = {2,0,1,0,2,2,1,1,0,1,2};
        int sol[] = dutchNa(arr);
        System.out.println(sol);
    }

    private static int[] dutchNa(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        int mid = 0;

        while(low < high){
            /*if(arr[low] == arr[mid]){
                mid--;
            }else if(arr[mid] == arr[high]){
                high--;
            }
            else*/ if(arr[low] > arr[mid]){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid--;
            }else if(arr[mid] > arr[high]){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                mid++;
                high--;
            }
            low++;
            high--;
        }
        return arr;
    }
}
