package Strings.easyProblem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubStrWithNoRepeatingChars {

    public static void main(String[] args) {
        //String s = "babccbacd";
        String s = "abcabcbb";
        int len = longestSubStrWithNoRepeatingChars(s);
        System.out.println(len);

        int ll = lengthOfLongestSubstring(s);
        System.out.println(ll);

        int ai = lengthOfLongestSubstringFromAI("pwwkew");
        System.out.println(ai);
    }

    private static int noOfWords(String s){
        int count = 0;
        char[] cc = s.toCharArray();
        for(char c : cc){
            if(c == ' '){
                count++;
            }
        }
        return count;
    }

    //String s = "abcabcbb";
    private static int longestSubStrWithNoRepeatingChars(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        int max_len = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        while(end < s.length()){
            if(hm.containsKey(s.charAt(end))){
                start = Math.max(start, hm.get(s.charAt(end))+1);
            }
            hm.put(s.charAt(end), end);
            max_len = Math.max(max_len, end-start+1);
            end++;
        }
        return max_len;
    }

    public static int lengthOfLongestSubstring(String s) {
        Set hm = new HashSet();
        int max_len = 0;
        int start = 0;
        int end = 0;
        while(end < s.length()){
            while(hm.contains(s.charAt(end))){
                hm.remove(s.charAt(start));
                start++;
            }
            hm.add(s.charAt(end));
            max_len = Math.max(max_len, (end - start)+1);
            end++;
        }
        return max_len;
    }


    //simple solution o(n)
    public static int lengthOfLongestSubstringFromAI(String s) {
        // Initialize the set and the longest length
        Set<Character> set = new HashSet<>();
        int longest = 0;
        // Iterate through the string, adding each character to the set and updating the longest length as you go
        for (int i = 0, j = 0; i < s.length(); i++) {
            // If the character is already in the set, remove all characters before it from the set
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(j++));
            } else {
                // Add the character to the set and update the longest length
                set.add(s.charAt(i));
                longest = Math.max(longest, set.size());
            }
        }
        return longest;
    }
}

