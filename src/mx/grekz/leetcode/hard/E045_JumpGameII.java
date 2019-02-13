package mx.grekz.leetcode.hard;

/**
 * @author grekz
 */
public class E045_JumpGameII {
    public int jump(int[] nums) {
        int counts = 0, end = 0, far = 0, n = nums.length - 1;
        for ( int i = 0; i < n; i++ ) {
            far = Math.max(far, i + nums[i]);
            if ( i == end ) {
                counts++;
                end = far;
            }
        }
        return counts;
    }
}