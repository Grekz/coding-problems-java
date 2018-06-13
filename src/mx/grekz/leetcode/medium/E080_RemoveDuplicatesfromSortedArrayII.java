package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E080_RemoveDuplicatesfromSortedArrayII {

    public int removeDuplicates(int[] nums) {
        if ( nums.length < 3 ) return nums.length;
        int i = 0;
        for (int n : nums )
            if ( i < 2 || nums[ i - 2 ] < n )
                nums[i++] = n;
        return i;
    }
}