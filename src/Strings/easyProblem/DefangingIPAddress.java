package Strings.easyProblem;

public class DefangingIPAddress {
    public static void main(String[] args) {

        System.out.println(Math.abs (((double)2)/ (double) 6));
       String address = "1.1.1.1";
       StringBuilder out = new StringBuilder();

       for(Character c:address.toCharArray()){
           if(! Character.isDigit(c)){
               if(c == '.'){
                   out.append("[.]");
               }
           }else{
               out.append(c);
           }
       }
        System.out.println(out);
    }
}
