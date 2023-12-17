package dp;

public class PrefixSum {

    public static void main(String[] args) {
        int[] a = { 3, 6, 2, 8, 9, 2 };
        int res[] = new int[a.length];
        prefixSum(a, res);
        for(int i=0; i< res.length; i++){
            System.out.print(res[i] + " ");
        }
    }

    private static void prefixSum(int[] a, int[] res) {
        res[0] = a[0];
        for(int i=1; i<a.length; i++){
            res[i] = res[i-1] + a[i];
        }
    }
}
