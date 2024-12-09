public class StringExample {

    public static void main(String[] args) {
        String pal = "racecar";

        boolean isPalindrome = twoPointers(pal);
        System.out.println(isPalindrome);
    }

    private static boolean twoPointers(String pal) {
        int left = 0;
        int right = pal.length() - 1;

        while(left < right){
            if(pal.charAt(left) != pal.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


}
