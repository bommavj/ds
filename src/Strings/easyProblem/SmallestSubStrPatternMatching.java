package Strings.easyProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmallestSubStrPatternMatching {

    public static void main(String[] args) {
        String s = "badeaebcaae";
        String pat = "aabc";
        int smallestSubStr = smallestSubStrPatternMatching(s, pat);
        System.out.println(smallestSubStr);
    }

    private static int smallestSubStrPatternMatching(String s, String pat) {
        Map<Character, Integer> hm = new HashMap<>();
        for (char e : pat.toCharArray()) {
            hm.put(e, hm.getOrDefault(e, 0) + 1);
        }

        int start = 0;
        int end = 0;
        int matchedChars = 0;
        int minSubStr = Integer.MAX_VALUE;
        System.out.println(s);
        System.out.println(pat);
        while (start < s.length()) {
            char curr_char = s.charAt(end);
            System.out.print(curr_char + " ");
            if (hm.containsKey(curr_char)) {
                hm.put(curr_char, hm.get(curr_char) - 1);
                if (hm.get(curr_char) == 0) {
                    matchedChars++;
                }
            }

            if (matchedChars == hm.size()) {
                minSubStr = Math.min(minSubStr, (end - start) + 1);
                start++;
                end = start;
                System.out.println("");
                matchedChars = 0;

                char start_char = s.charAt(start);
                if (hm.containsKey(start_char)) {
                    hm.put(start_char, hm.get(start_char) + 1);
                    if (hm.get(start_char) == 0) {
                        matchedChars--;
                    }
                }
            }
            else{
                end++;
            }

            /*if(end >= pat.length()){
                char start_char = s.charAt(start);
                if (hm.containsKey(start_char)) {
                    hm.put(start_char, hm.get(start_char) + 1);
                    if (hm.get(start_char) == 0) {
                        matchedChars--;
                    }
                }
            }*/


        }
        return minSubStr;
    }

}
