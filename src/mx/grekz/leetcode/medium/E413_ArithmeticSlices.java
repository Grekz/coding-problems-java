package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E413_ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] A) {
        int tmp = 0, res = 0, n = A.length;
        for ( int i = 2; i < n; i++ ) {
            if ( A[i] - A[i-1] == A[i-1] - A[i-2] ) {
                tmp++;
                res += tmp;
            }else{
                tmp = 0;
            }
        }
        return res;
    }
}