import java.util.Arrays;

public class CoinChange {

    public int coinChange(int[] coins, int amount) {

        int[] rs = new int[amount+1];
        Arrays.fill(rs,amount+1);

        rs[0] = 0;

        for(int i = 0; i < rs.length; i++){
            for(int j = 0; j < coins.length; j++){
                if(coins[j] <= i)
                    rs[i] = Math.min(rs[i], rs[i - coins[j]] + 1);
            }
        }
        System.out.printf(Arrays.toString(rs));
        return rs[amount];

    }
}
