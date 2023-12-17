package Strings;

import java.util.*;

public class Anagram {

    public static void main(String[] args) {
        String[] s1 =  {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = groupedAnagrams(s1);
        System.out.println(lists);
    }

    public static List<List<String>> groupedAnagrams(String[] s){
        List<List<String>> groupedAna = new ArrayList<>();
        Map<String, List<String>> groupMap = new HashMap<>();

        for(String cr : s){
            char[] cur = cr.toCharArray();
            Arrays.sort(cur);
            String sortedStr = new String(cur);
            if(groupMap.containsKey(sortedStr)){
                groupMap.get(sortedStr).add(cr);
            }else{
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(cr);
                groupMap.put(sortedStr, arrayList);
            }
        }
        System.out.println(groupMap);
        for(String a : groupMap.keySet()){
            groupedAna.add(groupMap.get(a));
        }
        return groupedAna;
    }
}
