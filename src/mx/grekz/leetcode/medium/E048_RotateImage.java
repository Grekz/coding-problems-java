package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E048_RotateImage {

    public void rotate(int[][] m) {
        for ( int i = 0; i < m.length; i++ )
            for ( int j = i; j < m.length; j++ ){
                int x = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = x;
            }
        for ( int i = 0; i < m.length; i++ )
            for ( int j = 0; j < m.length/2; j++ ) {
                int x = m[i][j];
                m[i][j] = m[i][m.length - 1 - j ];
                m[i][m.length - 1 - j ] = x;
            }
    }
}