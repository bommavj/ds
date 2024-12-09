package ArraysStrings;

import java.util.HashMap;
import java.util.Map;

public class isAnagram {
    public static void main(String[] args) {
        String s = "silent";
        String t = "listen";
        boolean isAna = isAnagrams(s, t);
        System.out.println(isAna);

        boolean isA = isAnagram(s, t);
        System.out.println(isA);
    }

    private static boolean isAnagrams(String s, String t) {
        if(s.length() != t.length())
            return false;
        int firstSum = 0;
        int secondSum = 0;

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) != t.charAt(i)){
                return false;
            }
        }

        for(Character a : s.toCharArray()){
            firstSum += 'z' - a;
        }
        for(Character a : t.toCharArray()){
            secondSum += 'z' - a;
        }
        return firstSum == secondSum ? true : false;
    }

    public static boolean isAnagram(String s, String t) {
        // TODO: Write your code here
        Map<Character, Integer> hm = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }

        for (Character c : t.toCharArray()) {
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) - 1);
            }
        }

        System.out.println(hm);

        for(Character c : hm.keySet()){
            if(hm.get(c) != 0)
                return false;
        }

        return true;
    }
}
