package lc_top_interview_150;

public class _8_122_BestTimeToBuyAndSellStock_II {

    public static int maxProfit(int[] prices) {
        int profit = 0;
        for(int i=1;i<prices.length;i++) {
            if(prices[i] > prices[i-1]) {
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int prices2[] = {1,2,3,4,5};
        int majEle = maxProfit(prices2);
        System.out.println(majEle);
    }
}
