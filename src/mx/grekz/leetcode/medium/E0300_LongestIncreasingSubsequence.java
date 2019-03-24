package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E0300_LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if ( n < 1 ) {
            return 0;
        }
        int dp[] = new int[n], res = 1;
        dp[0] = 1;
        for ( int i = 1; i < n; i++ ) {
            int val = 0;
            for ( int j = 0; i > j; j++ ) {
                if ( nums[i] > nums[j] ) {
                    val = Math.max(val, dp[j]);
                }
            }
            dp[i] = val + 1;
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}