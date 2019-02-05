package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E357_CountNumberswithUniqueDigits {

    public int countNumbersWithUniqueDigits(int n) {
        if ( n == 0 ) return 1;
        if ( n == 1 ) return 10;
        if ( n == 2 ) return 91;
        int res = 10, t = 9;
        n = Math.min(n, 10);
        for ( int i = 1; i < n; i++ ) {
            t *= 10 - i;
            res += t;
        }
        return res;
    }
}