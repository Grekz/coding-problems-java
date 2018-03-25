package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E367_ValidPerfectSquare {
    public boolean isPerfectSquare(int n) {
        long r = n;
        while ( r * r > n ) {
            r = ( r + n / r ) / 2;
        }
        return r * r == n;
     }
}