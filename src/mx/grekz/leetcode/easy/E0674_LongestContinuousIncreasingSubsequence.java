package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E0674_LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        int res = 0;
        int count = 0;
        int n = nums.length;
        for ( int i = 0; i < n; i++ ) {
            if ( i < 1 || nums[i-1] < nums[i] ) 
                res = Math.max(res, ++count);
            else
                count = 1;
        }
        return res;
    }
}