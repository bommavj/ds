package Strings.easyProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramPatternMatching {

    public static void main(String[] args) {
        String s = "bcdcbabacd";
        String pattern = "abc";
        List<int[]> ll = anagramPatternMatchingIndexes(s,pattern);
        System.out.println(ll);

        boolean isPatMatching = anagramPatternMatching(s, pattern);
        System.out.println(isPatMatching);


    }

    private static boolean anagramPatternMatching(String s, String pattern) {
        Map<Character, Integer> hm = new HashMap<>();
        for(int i=0;i <pattern.length(); i++){
            hm.put(pattern.charAt(i), hm.getOrDefault(pattern.charAt(i), 0)+1);
        }

        int matchedeElements = 0;
        int start = 0;

        for(int i=0; i<s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), hm.get(s.charAt(i))-1);
                if(hm.get(s.charAt(i)) == 0){
                    matchedeElements++;
                }
            }
            if (matchedeElements == hm.size())
                return true;


            // String s = "bcdcbaba";
            if (i >= pattern.length() - 1){
                char startOne = s.charAt(start++);
                if(hm.containsKey(startOne)){
                    if(hm.get(startOne) == 0){
                        matchedeElements --;
                    }
                    hm.put(startOne, hm.get(startOne)+1);
                }
            }
        }
        return false;
    }


    private static List<int[]> anagramPatternMatchingIndexes(String s, String pattern) {
        List<int[]> l = new ArrayList<>();
        Map<Character, Integer> hm = new HashMap<>();
        for(int i=0;i <pattern.length(); i++){
            hm.put(pattern.charAt(i), hm.getOrDefault(pattern.charAt(i), 0)+1);
        }

        int matchedeElements = 0;
        int start = 0;

        for(int i=0; i<s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), hm.get(s.charAt(i))-1);
                if(hm.get(s.charAt(i)) == 0){
                    matchedeElements++;
                }
            }
            if (matchedeElements == hm.size())
                l.add(new int[]{start, i});


            // String s = "bcdcbaba";
            if (i >= pattern.length() - 1){
                char startOne = s.charAt(start++);
                if(hm.containsKey(startOne)){
                    if(hm.get(startOne) == 0){
                        matchedeElements --;
                    }
                    hm.put(startOne, hm.get(startOne)+1);
                }
            }
        }
        return l;
    }
}
