package eNova;

import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {
        int[] a = {10, 300, 400, 300,414, 420};
        int max = findMaxSumPair(a);
        System.out.println(max);
    }

    private static int findMaxSumPair(int[] a) {
        Arrays.sort(a);

        int max_sum = 0;
        for(int i=0; i<a.length; i++){

            int end = 0;

            while(end < a.length-1){
                int sum = a[i]+a[end+1];
                String s1 = a[i] +"";
                if(s1.length() > 2){
                    s1 = s1.charAt(0) + "" + s1.charAt(s1.length()-1);
                }
                String s2 = a[end+1] +"";
                if(s2.length() > 2){
                    s2 = s2.charAt(0) + "" + s2.charAt(s1.length()-1);
                }

                if(s1.equals(s2)){
                    max_sum = Math.max(max_sum, sum);
                    break;
                }
                end++;
            }
        }
        return max_sum;
    }
}
