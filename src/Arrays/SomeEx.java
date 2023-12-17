package Arrays;


import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;
/*
Write a method to determine the number of times a given word appears in a given book. What if the method was to be run multiple times?


Notes:
  - The input book will be represented as a large block of text only, no images
  - The target word can be any distinct sequence of letters in the English alphabet, so proper nouns like “Kenobi”, “Vonnegut”, “iPhone”, etc are valid
  - The target word must be an exact, case-insensitive match
      - Example: If target word == “Apple”, then “apple” and “APPLE” are both matches, but “Apples” is not
      - Example: If target word == “Berry”, then “Berry”, “BERRY”, and “berry” are all matches, but “Strawberry”, “Blueberry”, “Blackberry” are not matches
*/


public class SomeEx {



    public static void main(String[] args) {

        String book = "apple is a good fruit to eat and apple are fine fruit and fruits are so many GOOD and some FRUIT are not distinct and Good Fruit is a good to eat";

        Map<String, Integer> counts = countAllWords(book);
        for(String k : counts.keySet()){
            System.out.println("Key " +k + ", value " + counts.get(k) );
        }

    }

    private static Map<String, Integer> countAllWords(String book){
        Map<String, Integer> wordCountMap = new HashMap<>();
        if(book.isEmpty()){
            return null;
        }

        String words[] = book.split("\\ ");
        System.out.println(words);
        for(String s : words){
            s = s.toLowerCase();
            if(! wordCountMap.containsKey(s)){
                Integer num = wordCountMap.get(s);
                wordCountMap.put(s, num++);
            }else{
                wordCountMap.put(s, 1);
            }
        }

        return wordCountMap;
    }
}