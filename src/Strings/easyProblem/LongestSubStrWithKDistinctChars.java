package Strings.easyProblem;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStrWithKDistinctChars {

    public static void main(String[] args) {

        //String s = "aaabb";
        String s = "ababbc";
        int k = 2;

        LongestSubstringALeastKRepeating(s, k);

        String s1 = "bccbababd";
        int k1 =2;
        int len = findLongestLen(s1, k1);
        System.out.println(len);

        String ss = "bcdcbababd";
        // b,0 ..c,1.. d,2.., c,2..,
        // start = 2
        // end = 3
    }

    //String s = "bccbababd";
    private static int findLongestLen(String s, int k) {
        Map<Character, Integer> mp = new HashMap<>();
        int max_len = 0;
        for(int start=0, end = 0; end<s.length(); end++){
            mp.put(s.charAt(end), mp.getOrDefault(s.charAt(end), 0) + 1);
            while(mp.size() > k){
                mp.put(s.charAt(start), mp.get(s.charAt(start)) - 1);
                if(mp.get(s.charAt(start)) == 0){
                    mp.remove(s.charAt(start));
                }
                start++;
            }
            max_len = Math.max(max_len, (end-start) + 1);
        }
        return max_len;
    }

    private static int LongestSubstringALeastKRepeating(String s, int k){
        Map<Character, Integer> mp = new HashMap<>();
        int max_len = 0;
        for(int end = 0; end < s.length(); end++){
            mp.put(s.charAt(end), mp.getOrDefault(s.charAt(end), 0) +1);
        }
        for(Character kk : mp.keySet()){
            if(mp.get(kk) >= k){
                max_len += mp.get(kk);
            }
        }
        return max_len;
    }
}
