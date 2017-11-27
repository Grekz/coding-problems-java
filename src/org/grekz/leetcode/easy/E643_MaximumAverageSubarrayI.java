package org.grekz.leetcode.easy;
/**
 * https://leetcode.com/problems/maximum-average-subarray-i/description/
 * @author grekz
 *
 */
public class E643_MaximumAverageSubarrayI {
	public double findMaxAverage(int[] nums, int k) {
        double ini = 0, res = 0;
        for (int i = 0; i < k; i++ ) {
            ini += nums[i];
        }
        res = ini;
        for(int i = k; i < nums.length; i++){
            ini += nums[i] - nums[i-k];
            res = Math.max(res, ini);
        }
        return res/k;
    }
}
