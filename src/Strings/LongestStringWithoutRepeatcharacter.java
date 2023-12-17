package Strings;

import java.util.HashSet;
import java.util.Set;

public class LongestStringWithoutRepeatcharacter {

    public static void main(String[] args) {
        //String s = "abcabcbb";
        String ss = "pwwkew";
        /*String s = "aab";
        int le = findLongestSubStrWithoutRepeatChar(s);
        System.out.println(le);*/

        int i = lengthOfLongestSubstring("aab");
        System.out.println(i);

        int j = trying("aab");
        System.out.println(j);
    }

    private static int trying(String s){
        int maxCount = 0;
        int count = 0;
        char prev = 0;
        Set<Character> sc = new HashSet<>();
        for(char c:s.toCharArray()){
            if(prev != 0 && prev !=c && !sc.contains(c)){
                sc.add(c);
                prev = c;
                count++;
            }else{
                if(sc.contains(c)){
                    sc = new HashSet<>();
                    maxCount = Integer.max(maxCount, count);
                }
                count = 1;
                prev = c;
                sc.add(c);
            }
            maxCount = Integer.max(maxCount, count);
        }
        return maxCount;
    }
    private static int findLongestSubStrWithoutRepeatChar(String s)
    {
        int tot = s.length();
        String finalStr = "";
        String subs = "";
        char prev = ' ';
        for (char curr : s.toCharArray()) {
            if (curr != prev) {
                if (!subs.contains(curr + "")) {
                    subs += curr;
                    prev = curr;
                    if(tot == subs.length())
                        finalStr = subs;
                }
                else {
                    finalStr = subs;
                    subs = "";
                    subs += curr;
                    prev = curr;
                }
            } else {
                if(finalStr.length() < subs.length()) {
                    finalStr = subs;
                    subs = "";
                    subs += curr;
                }
            }
        }
        return finalStr.length();
    }

    public static int lengthOfLongestSubstring(String s) {
        int maxCount = 0;
        int count = 0;
        char[] each = s.toCharArray();
        char prevChar = 0;
        Set<Character> rp = new HashSet<>();
        for (char c : each) {
            if (prevChar != 0 && prevChar != c &&
                    !rp.contains(c)) {
                // new character
                prevChar = c;
                rp.add(c);
                count++;
            } else {
                // if exists , create new set and count = 1;
                if (rp.contains(c)) {
                    rp = new HashSet<>();
                    maxCount = Integer.max(maxCount, count);
                }
                prevChar = c;
                count = 1;
                rp.add(c);
            }
        }
        maxCount = Integer.max(maxCount, count);
        return maxCount;
    }
}
