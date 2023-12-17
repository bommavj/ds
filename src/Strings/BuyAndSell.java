package Strings;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

public class BuyAndSell {

    public static void main(String[] args) {
        int prices[] = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for(int i=1; i<prices.length; i++){
            if(minPrice > prices[i]){
                minPrice = prices[i];
            }
            else{
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }
        return maxProfit;
    }
}
