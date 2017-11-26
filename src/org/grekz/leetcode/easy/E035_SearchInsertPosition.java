package org.grekz.leetcode.easy;

public class E035_SearchInsertPosition {
	/**
	 * https://leetcode.com/problems/search-insert-position/description/
	 */
    public int searchInsert(int[] nums, int target) {
        int a = 0, b = nums.length - 1;
        while( a <= b) {
            int m = ( a + b ) / 2;
            if ( nums[m] == target ) return m;
            if ( nums[m] > target )
                b = m - 1;
            else
                a = m + 1;
        }
        return a;
    }
}
