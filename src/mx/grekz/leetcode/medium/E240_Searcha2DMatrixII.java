package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E240_Searcha2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        if ( matrix.length < 1 ) return false;
        int r = 0, c = matrix[0].length - 1, rs = matrix.length;
        while ( r < rs && c > -1 ) {
            int cur = matrix[r][c];
            if ( cur == target )
                return true;
            if ( cur > target )
                c--;
            else
                r++;
        }
        return false;
    }
}