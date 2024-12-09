package Strings;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "       yoda   is a jedi    ";

        String word = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' '){
                word += s.charAt(i);
            }
        }


        int st = 0;
        int len = s.length();
        char val[] = s.toCharArray();
        while ((st < len) && (val[st] <= ' ')) {
            st++;
        }

        while ((st < len) && (val[len - 1] <= ' ')) {
            len--;
        }

        System.out.println(st + "" + len);

        //s = s.trim();

        /*while ((st < len) && (val[st] <= ' ')) {
            st++;
        }
        while ((st < len) && (val[len - 1] <= ' ')) {
            len--;
        }
        return ((st > 0) || (len < value.length)) ? substring(st, len) : this;*/

        System.out.println(s);
        //String s1 = reverseWords(s);
        //System.out.println(s1);

        StringBuilder revWord = new StringBuilder();
        String finalRev = "";
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) != ' ')
                revWord.append(s.charAt(i));

            if(s.charAt(i) == ' ') {
                finalRev += revWord.reverse().append(" ");
                revWord = new StringBuilder();
            }else if(i == 0){
                finalRev += revWord.reverse();
            }
        }
        System.out.println(finalRev);
    }


    /*static String reverseWords(String s) {
        int numOfWords = 1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                numOfWords++;
            }
        }
        String[] allWords = new  String[numOfWords];
        String currentWord = "";
        int index = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                allWords[index++] = currentWord;
                currentWord = "";
            } else {
                currentWord += s.charAt(i);
            }
        }
        allWords[index++] = currentWord;
        String ans = "";
        for(int i = index - 1; i > 0; i--) {
            ans += allWords[i];
            ans += ' ';
        }
        ans += allWords[0];
        return ans;
    }*/
}
