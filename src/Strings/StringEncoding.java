package Strings;

import java.util.HashMap;
import java.util.Map;

public class StringEncoding {

    public static void main(String[] args) {
        String str = "aaabbccaazzdddbb";
        Map<Character, Integer> mp = new HashMap<>();
        for(char c:str.toCharArray()){
            mp.put(c, mp.getOrDefault(c, 0)+1);
        }

        char prev = str.charAt(0);
        int count = 0;
        for(char c:str.toCharArray()){
            if(prev != c) {
                //mp.put(c, mp.get(c)-1);
                System.out.print(prev + "" + count);
                prev = c;
                count = 1;
            }else{
                //mp.put(c, mp.get(c)-1);
                //prev = c;
                count++;
            }
        }
        System.out.print(prev + "" + count);
    }
}
