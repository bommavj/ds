package Strings.easyProblem;

public class StrIsSubsequnce {

    public static void main(String[] args) {
        String s = "abc";
        String t = "axbec";
        int s_pointer = 0;

        for(int i=0; i<t.length(); i++){
            if(t.charAt(i) == s.charAt(s_pointer)){
                s_pointer++;
            }
        }

        if(s_pointer == s.length()){
            System.out.println("Its a subsequnce");
        }else{
            System.out.println("Not a subsequnce");
        }

    }
}
