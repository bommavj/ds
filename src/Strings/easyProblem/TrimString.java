package Strings.easyProblem;

public class TrimString {
    public static void main(String[] args) {
        String str = "   hello    user     vijay  ";
        System.out.println(str.trim());
        String s = trimStr(str);
        System.out.println(s);
        String ss = "a good   example";
        String trimWithSignleSpace = trimWithSingleSpace(ss);
        ss = ss.replaceAll("\\s+", " ");
        System.out.println(ss);
    }

    private static String trimWithSingleSpace(String str) {
        return "";
    }

    private static String trimStr(String str) {
        char e[] = str.toCharArray();
        int start = 0;
        int end = e.length-1;
        while(start < end){
            if(e[start] == ' '){
                start++;
            }else if(e[end] == ' '){
                end--;
            }else{
                break;
            }
        }
       /* String s = "";
        for(int i=start; i<=end; i++){
            s += e[i];
        }*/
        return new String(e, start, end);
    }
}
