package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E985_SumofEvenNumbersAfterQueries {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int cur = 0;
        for ( int x : A ) {
            cur += (x & 1) == 0 ? x : 0;
        }
        int[] res = new int[A.length];
        int i = 0;
        for ( int[] x : queries ) {
            int idx = x[1], val = x[0];
            if ( (A[idx] & 1) == 0 ) cur -= A[idx];
            A[idx] += val;
            if ( (A[idx] & 1) == 0 ) cur += A[idx];
            res[i++] = cur;
        }
        return res;
    }
}