package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupedAnagrams = new ArrayList<>();
        Map<String, List<String>> hm = new HashMap<>();
        for (String s : strs) {
            int count[] = new int[26];
            for(int i=0; i<s.length(); i++){
                count[s.charAt(i) - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int c : count){
                sb.append(c);
                sb.append("#");
            }

            String rep = sb.toString();

            if(hm.containsKey(rep)){
                List<String> l = hm.get(rep);
                l.add(s);
            }else{
                List<String> li = new ArrayList<>();
                li.add(s);
                hm.put(rep, li);
            }
        }
        groupedAnagrams.addAll(hm.values());
        return groupedAnagrams;
    }
}