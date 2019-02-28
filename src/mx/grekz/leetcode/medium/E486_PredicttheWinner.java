package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E486_PredicttheWinner {

    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        for ( int i = n; i >= 0; i-- )
            for ( int j = i + 1; j < n; j++ ) {
                int a = nums[i] - dp[j];
                int b = nums[j] - dp[j - 1];
                dp[j] = Math.max(a, b);
            }
        return dp[n - 1] >= 0;
    }
}