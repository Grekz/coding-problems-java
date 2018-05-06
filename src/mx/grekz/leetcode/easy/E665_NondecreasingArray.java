package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E665_NondecreasingArray {
    public boolean checkPossibility(int[] nums) {
        int n = nums.length;
        boolean exists = false;
        for ( int i = 1; i < n; i++ ) {
            if ( nums[i] < nums[i-1] ) {
                if ( exists ) {
                    return false;
                }
                exists = true;
                if ( i > 1 && nums[i] < nums[i-2] ) {
                    nums[i] = nums[i-1];
                }
            }
        }
        return true;
    }
}