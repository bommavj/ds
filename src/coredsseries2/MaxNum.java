package coredsseries2;

import java.util.Arrays;
import java.util.List;

public class MaxNum {
    public static void main(String[] args) {
        int ar[] = new int[]{1,2,3,4,5};
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int maxNum = findMax(list);
        System.out.println(maxNum);
    }

    private static int findMax( List<Integer> list ) {
        int max = -1;
        for(int n : list){
            if(max < n){
                max = n;
            }
        }
        return max;
    }
}
