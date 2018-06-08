package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E733_FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if ( image[sr][sc] == newColor ) return image;
        dfs(image, sr, sc, image[sr][sc], newColor);
        return image;
    }
    private void dfs(int[][] tmp, int a, int b, int c, int d) {
        if ( a < 0 || b < 0 || a >= tmp.length || b >= tmp[0].length || tmp[a][b] != c )
            return;
        tmp[a][b] = d;
        dfs(tmp, a, b+1, c, d);
        dfs(tmp, a, b-1, c, d);
        dfs(tmp, a+1, b, c, d);
        dfs(tmp, a-1, b, c, d);
    }
}