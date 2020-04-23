public class MaxProfit {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int j = 0, i = 0;
        while (i < prices.length && j < prices.length){
            j = i + 1;
            while (j < prices.length && prices[j] > prices[j-1]){
                j++;
            }
            profit += prices[j-1] - prices[i];
            i = j;
        }
        System.out.printf(String.valueOf(profit));
        return profit;
    }
}
