package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E883_ProjectionAreaof3DShapes {
    public int projectionArea(int[][] grid) {
        int res = 0, n = grid.length;
        for ( int i = 0; i < n; i++ ) {
            int row = 0, col = 0;
            for ( int j = 0; j < n; j++ ) {
                if ( grid[i][j] > 0 ) res++;
                row = Math.max(row, grid[i][j]);
                col = Math.max(col, grid[j][i]);
            }
            res += row + col;
        }
        return res;
    }
}