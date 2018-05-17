package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E695_MaxAreaofIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int n = grid.length;
        int m = grid[0].length;
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < m; j++ ) {
                if ( grid[i][j] == 1 ) {
                    maxArea = Math.max( maxArea, doit(grid, i, j));
                }
            }
        }
        return maxArea;
    }
    private int doit(int[][] grid, int row, int col){
        if ( row < 0 || row > grid.length - 1 || col < 0 || col > grid[0].length - 1 || grid[row][col] != 1){
            return 0;
        }
        grid[row][col] = 0;
        return 1 + doit(grid, row+1, col) + doit(grid, row-1, col) + doit(grid, row, col+1) + doit(grid, row, col-1);
    }
}