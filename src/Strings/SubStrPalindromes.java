package Strings;

public class SubStrPalindromes {

    public static void main(String[] args) {
        String s = "malayalam";
        countSubstrings(s);
    }

    public static int countSubstrings(String s) {
        int n = s.length();
        int count = s.length();

        /*for(int i=0; i<n; i++){
            if(s.charAt(i) == s.charAt(i++)){
                count++;
            }
        }*/

        String temp = "";
        for(int k=0; k<n; k++) {
            for (int i = k; i < n; i++) {
                temp += s.charAt(i);
                if (temp.length() >= 2) {
                    if (isPalindrom(temp)) {
                        count++;
                    }
                }
            }
            temp = "";
        }

        return count;


    }

    private static boolean isPalindrom(String temp) {
       int l = 0;
       int r = temp.length()-1;
       while(l < r){
           if(temp.charAt(l) != temp.charAt(r)){
               return false;
           }
           l++;
           r--;
       }
       return true;
    }
}
