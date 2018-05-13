package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E832_FlippinganImage {

    public int[][] flipAndInvertImage(int[][] A) {
        int an = A.length;
        for ( int a = 0; a < an; a++ ) {
            int[] x = A[a];
            int j = x.length-1;
            int i = 0;
            while ( i <= j) {
                int tmp = x[i];
                x[i++] = x[j] ^ 1;
                x[j--] = tmp ^ 1;
            }
        }
        return A;
    }
}