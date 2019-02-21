package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E910_SmallestRangeII {
    public int smallestRangeII(int[] A, int K) {
        Arrays.sort(A);
        int n = A.length - 1;
        int res = A[n] - A[0];
        for ( int i = 0; i < n; i++ ) {
            int a = A[i], b = A[i+1];
            int h = Math.max(A[n] - K, a + K);
            int l = Math.min(A[0] + K, b - K);
            res = Math.min(res, h - l);
        }
        return res;
    }
}