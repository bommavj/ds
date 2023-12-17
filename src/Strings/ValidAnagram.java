package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "aacc", t = "aaccc";
        System.out.println(isValidAnagram(s, t));
    }

    private static boolean isValidAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;

        Map<Character, Integer> sb = new HashMap<>();
        for(char c : s.toCharArray()){
            if(sb.containsKey(c)){
                sb.put(c, sb.get(c)+1);
            }else{
                sb.put(c, 1);
            }
        }

        for(char c : t.toCharArray()){
            if(sb.containsKey(c)){
                sb.put(c, sb.get(c)-1);
            }
        }

        for(Character ss: sb.keySet()){
            if(sb.get(ss) != 0){
                return false;
            }
        }
        return true;
    }
}
