package Arrays;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {
    public static void main(String[] args) {
        int[] arr = new int[]{7 ,5, 2, 11, 2 ,43, 1, 1};
        System.out.println(returnFirstDuplicate(arr));

    }

    private static int returnFirstDuplicate(int[] arr) {
        Set<Integer> hs = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(hs.contains(arr[i])){
                return arr[i];
            }else{
                hs.add(arr[i]);
            }
        }
        return -1;
    }


}
