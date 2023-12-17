package Strings;

public class Find3RepeatConsecquetiveCharsAndRemove {

    public static void main(String[] args)
    {

        String input = "ABCCCCBBA";

        for (int i = 0; i < input.length(); i++) {
            int j = i;
            while (j < input.length() && input.charAt(j) == input.charAt(i))
                j++;
            if (j - i > 3) {
                input = input.substring(0, i) + input.substring(j);
                System.out.println(input);
                i = 0;
            }
        }

        System.out.println("Final string : " + input);

    }
}


