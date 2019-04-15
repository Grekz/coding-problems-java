package mx.grekz.leetcode.hard;

/**
 * @author grekz
 */
public class E0931_MinimumFallingPathSum {
    public int minFallingPathSum(int[][] A) {
        int n = A.length;
        for ( int i = n - 2 ; i >= 0; i-- ) {
            for ( int j = 0; j < n; j++ ) {
                int b = A[i+1][j];
                if ( j > 0 ) {
                    b = Math.min( b, A[i+1][j-1] );
                }
                if ( j+1 < n )
                    b = Math.min( b, A[i+1][j+1] );
                A[i][j] += b;
            }
        }
        int res = 2147483647;
        for ( int x : A[0] ) {
            res = Math.min(res, x);
        }
        return res;
    }
}