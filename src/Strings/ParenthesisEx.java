package Strings;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ParenthesisEx {

    public static void main(String[] args) {

        String s = "()[]{}";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {
        Stack<Character> ls = new Stack<>();
        for(char e : s.toCharArray()){
            if(e == '(' || e == '{' || e == '['){
                ls.push(e);
            }else if(e == ')' && !ls.isEmpty() && ls.peek() == '('){
                ls.pop();
            }else if(e == '}' && !ls.isEmpty() && ls.peek() == '{'){
                ls.pop();
            }else if(e == ']' && !ls.isEmpty() && ls.peek() == '['){
                ls.pop();
            }
            else{
                return false;
            }
        }
        return ls.isEmpty();
    }
}
