public class MaxProfit {
//    public int maxProfit(int[] prices) {
//        int profit = 0;
//        int j = 0, i = 0;
//        while (i < prices.length && j < prices.length){
//            j = i + 1;
//            while (j < prices.length && prices[j] > prices[j-1]){
//                j++;
//            }
//            profit += prices[j-1] - prices[i];
//            i = j;
//        }
//        System.out.printf(String.valueOf(profit));
//        return profit;
//    }

    public int maxProfit(int[] prices) {
        int by = 0;
        int sale = 0;
        int max = 0;
        for(int i = 0; i < prices.length; i++){
            if(i < prices.length-1 && prices[i] < prices[by]){
                by = i;
                sale = i;
            }else if(prices[i] > prices[sale]){
                sale = i;
            }
            max = Math.max(prices[sale] - prices[by], max);
        }
        return max;
    }
}
