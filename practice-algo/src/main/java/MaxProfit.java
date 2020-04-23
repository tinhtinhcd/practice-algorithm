public class MaxProfit {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int i = 0;
        while (i < prices.length){
            int j = i + 1;
            while (j < prices.length && prices[j] > prices[j-1]){
                j++;
            }
            profit += prices[j-1] - prices[i];
            i = j;
            if(j >= prices.length)
                break;
        }
        System.out.printf(String.valueOf(profit));
        return profit;
    }
}
