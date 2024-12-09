package ArraysStrings;

import java.util.HashMap;
import java.util.Map;

public class StringParenthesis {
    public static void main(String[] args) {
        String s = "{{}})";
        boolean valid = isValidParenthesis(s);
        System.out.println(valid);
    }

    private static boolean isValidParenthesis(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        for(Character c : s.toCharArray()){
            if(c.equals('{')){
                hm.put(c, hm.getOrDefault(c, 0)+1);
            } else if(c.equals('(')){
                hm.put(c, hm.getOrDefault(c, 0)+1);
            } else if(c.equals('}')){
                hm.put('{',hm.get('{') - 1 );
            } else if(c.equals(')')){
                if(hm.get('(') != null)
                    hm.put('(',hm.get('(') - 1 );
                else
                    hm.put(c, hm.getOrDefault(c, 0)+1);
            }
        }

        for(Character c : hm.keySet()){
            if(hm.get(c) != 0){
                return  false;
            }
        }

        return true;
    }
}
