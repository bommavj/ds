package Strings;

import java.util.*;

public class SockPairs {

    public static void main(String[] args) {

        int val = sockMerchant(9, Arrays.asList(10, 20, 20 ,10 ,10 ,30 ,50 ,10 ,20));
        System.out.println(val);

        int val2 = sockMerchant2(9, Arrays.asList(10, 20, 20 ,10 ,10 ,30 ,50 ,10 ,20));
        System.out.println(val2);
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Map<Integer, Integer> pairs = new HashMap<>();
        for(int i=0; i<n; i++){
            if(pairs.containsKey(ar.get(i))){
                int t = pairs.get(ar.get(i));
                pairs.put(ar.get(i), ++t);
            }else{
                pairs.put(ar.get(i), 1);
            }
        }
        int totalPairs = 0;
        for(Integer a : pairs.keySet()){
            if(pairs.get(a) >= 2){
                totalPairs += pairs.get(a) / 2;
            }
        }
        return totalPairs;
    }

    public static int sockMerchant2(int n, List<Integer> ar) {
        // Write your code here
        Set<Integer> pairs = new HashSet<>();
        int numPairs = 0;
        for(int i=0; i<n; i++){
            if(pairs.contains(ar.get(i))){
                numPairs++;
                pairs.remove(ar.get(i));
            }else{
                pairs.add(ar.get(i));
            }
        }
        return numPairs;
    }

}
