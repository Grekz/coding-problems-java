package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E852_PeakIndexinaMountainArray {

    public int peakIndexInMountainArray(int[] A) {
        int res = 0, m = -2147483648, n = A.length;
        for ( int i = 0; i < n; i++ ) {
            int x = A[i];
            if ( m < x ) {
                m = x;
                res = i;
            }
        }
        return res;
    }
}