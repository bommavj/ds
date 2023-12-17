package Arrays;

import java.util.ArrayList;

public class BuyAndSell {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(prices);
        System.out.println("Max profit: " + maxProfit);  // Output: 5

        int maxProfitDp = maxProfitDP(prices);
        System.out.println("Max profit: " + maxProfitDp);  // Output: 5

        int arr[] = new int[]{100, 180, 260, 310, 40, 535, 695};
        stockBuySell(arr, arr.length);
    }

    private static ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n) {
        // code here

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {

            if (A[i] < A[i + 1]) {
                ArrayList<Integer> res = new ArrayList<>();
                res.add(A[i]);
                res.add(A[i + 1]);
                ans.add(res);
            }
        }
        return ans;
    }

    private static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;
        for (int k : prices) {
            if (k < min) {
                min = k;
            } else if (k - min > maxProfit) {
                maxProfit = k - min;
            }
        }
        return maxProfit;
    }

    /*private static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }else if(prices[i] - min > maxProfit){
                maxProfit = prices[i] - min;
            }
        }
        return maxProfit;
    }*/

    public static int maxProfitDP(int[] prices) {
        int n = prices.length;
        if (n == 0) {
            return 0;
        }

        int[] dp = new int[n];
        dp[0] = 0;
        int minPrice = prices[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }

        return dp[n - 1];
    }
}
