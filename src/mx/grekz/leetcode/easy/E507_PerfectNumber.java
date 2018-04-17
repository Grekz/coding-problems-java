package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E507_PerfectNumber {
    public boolean checkPerfectNumber(int n) {
        if ( n < 2 ) return false;
        if (n == 6 || n == 28 || n == 496 ) return true;
        int res = 1, sqrt = (int)Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++ )
            if ( n % i == 0 )
                res += i + n / i;
        return n == res;
    }
}