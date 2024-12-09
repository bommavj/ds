package ArraysStrings;

public class CountMaxConsequetive1s {
    public static void main(String[] args) {
        int[] ar = new int[]{1, 1, 1, 0, 1, 1, 0,1,1,0,1,1,1,1,1,1,1};
        int ma = countMaxConsequetive1s(ar);
        System.out.println(ma);
    }

    private static int countMaxConsequetive1s(int[] ar) {
        int runn = 0;
        int maxCount = Integer.MIN_VALUE;
        for(int i=0; i<ar.length; i++){
            if(ar[i] == 1){
                runn++;
            }else{
                maxCount = Math.max(maxCount, runn);
                runn = 0;
            }
        }
        return Math.max(maxCount, runn);
    }
}
