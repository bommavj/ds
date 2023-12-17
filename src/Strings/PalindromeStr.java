package Strings;

import java.util.*;

public class PalindromeStr {

    public static void main(String[] args) {
        String s = "malayalam";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();


        for(char c : s.toCharArray()){
            stack.add(c);
            queue.offer(c);
        }

        while(!stack.isEmpty() && !queue.isEmpty()){
            if(stack.pop() != queue.poll()){
                System.out.println("not palindrome");
            }
        }

        System.out.println(" palindrome");
    }
}
