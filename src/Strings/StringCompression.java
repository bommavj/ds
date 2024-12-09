package Strings;

public class StringCompression {

    public static void main(String[] args) {
        String a = "aabbcccccaaaaaaa";
        String compressedStr = compress(a);
        System.out.println(compressedStr);
    }

    public static String compress(String s) {
        // write your code here
        StringBuilder sb = new StringBuilder();
        int count = 1;
        int w = 0;
        for(int i=0; i<s.length()-1; ){
            if(s.charAt(i) == s.charAt(++i)){
                count++;
            }else {
                sb.append(s.charAt(w)+""+count);
                count = 1;
                w = i;
            }
        }
        sb.append(s.charAt(w)+""+count);
        return sb.toString();
    }
}

