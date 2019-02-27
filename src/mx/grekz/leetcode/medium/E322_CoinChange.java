package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E322_CoinChange {
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1, n = coins.length;
        int dp[] = new int[max];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for ( int i = 1; i < max; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                if ( coins[j] <= i ) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        if ( dp[amount] <= amount) {
            return dp[amount];
        } 
        return -1;
    }
}