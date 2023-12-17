package Strings.easyProblem;

public class ReverseString {

    public static void main(String[] args) {

        String s = "coding";
        //rev1(s);
        rev2(s);
    }

    private static void rev1(String s) {
        String rev = "";
        for(int i = s.length()-1; i>=0; i--){
            rev += s.charAt(i);
        }
        System.out.println(rev);
    }

    private static void rev2(String s) {
        char[] e = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while(start < end){
            char t = e[end];
            e[end] = e[start];
            e[start] = t;
            start++;
            end--;
        }
        System.out.println(new String(e));
    }
}
