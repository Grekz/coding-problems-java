package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E861_ScoreAfterFlippingMatrix {
    public int matrixScore(int[][] A) {
        int rows = A.length, cols = A[0].length;
        int ans = 0;
        for ( int c = 0; c < cols; c++ ) {
            int col = 0;
            for ( int r = 0; r < rows; r++ ) {
                col += A[r][c] ^ A[r][0];
            }
            ans += Math.max(col, rows - col) * ( 1 << ( cols - c - 1 ) );
        }
        return ans;
    }
}