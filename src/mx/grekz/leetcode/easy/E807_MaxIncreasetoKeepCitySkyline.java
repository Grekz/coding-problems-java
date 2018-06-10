package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E807_MaxIncreasetoKeepCitySkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length, m = grid[0].length, res = 0;
        int[] c = new int[m], r = new int[n];
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < m; j++ ) {
                if ( c[j] < grid[i][j] ) {
                    c[j] = grid[i][j];
                }
                if ( r[i] < grid[i][j] ) {
                    r[i] = grid[i][j];
                }
            }
        }
        
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < m; j++ ) {
                res += Math.min(c[j], r[i]) - grid[i][j];
            }
        }
        return res;
    }
}