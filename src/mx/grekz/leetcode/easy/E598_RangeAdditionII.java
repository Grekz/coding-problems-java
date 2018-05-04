package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E598_RangeAdditionII {
    public int maxCount(int m, int n, int[][] ops) {
        int a = m, b = n;
        for ( int[] x : ops ){
            a = Math.min(a, x[0]);
            b = Math.min(b, x[1]);
        }
        return a * b;
    }
}