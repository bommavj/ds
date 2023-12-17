package Strings;

import java.util.LinkedList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        List<String>  ls = generateParenthesis(3);
        System.out.println(ls);
    }
    public static List<String> generateParenthesis(int n) {
        List<String> ls = new LinkedList<>();
        if(n <= 0) return ls;

        dfs(n, 0, "", ls);
        return ls;
    }

    public static void dfs(int left, int right, String res, List<String> ls){
        if(left == 0 && right == 0){
            ls.add(res);
            return;
        }
        if(left > 0) dfs(left-1, right+1, res+"(", ls);
        if(right > 0) dfs(left, right-1, res+")", ls);
    }
}
