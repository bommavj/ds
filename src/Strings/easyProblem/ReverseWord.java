package Strings.easyProblem;

public class ReverseWord {

    public static void main(String[] args) {
        String s = "the sky is blue";

        String l = reverseIndividualWord(s);
        System.out.println(l);

        String revWords = reverseWords(s);
        System.out.println(revWords);
    }

    private static String reverseIndividualWord(String s) {
        String final_str = "";
        String temp_str = "";

        for(int i=s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            if(c == ' '){
                final_str += temp_str + " ";
                temp_str = "";
            }else{
                temp_str = c + temp_str;
            }
        }
        final_str = final_str + temp_str;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == ' '){
                final_str = final_str + temp_str + " ";
                temp_str = "";
            }else {
                temp_str = c + temp_str;
            }
        }
        final_str = final_str + temp_str;
        return final_str;
    }

    public static String reverseWords(String s) {
        char e[] = s.toCharArray();
        int start = 0;
        int end = e.length;
        int count = e.length - 1;
        String fin = "";
        while (start <= count) {
            if (count == 0 || e[count] == ' ') {
                if(end == e.length)
                    fin += s.substring(count+1, end) + " ";
                else
                    if(count == 0)
                        fin += s.substring(count, end+1);
                    else
                        fin += s.substring(count+1, end+1) + " ";
                count--;
                end = count;
            } else {
                count--;
            }
        }
        return fin;
    }

}