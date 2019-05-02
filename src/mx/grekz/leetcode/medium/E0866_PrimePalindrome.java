package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E0866_PrimePalindrome {
    public int primePalindrome(int N) {
        while ( true ) {
            if ( N == reverse(N) && isPrime(N) )
                return N;
            ++N;
            if ( 10_000_000 < N && N < 100_000_000 )
                N = 100_000_000;
        }
    }
    private int reverse(int n) {
        int res = 0;
        while ( n > 0 ) {
            res = 10 * res + n % 10;
            n /= 10;
        }
        return res;
    } 
    private boolean isPrime(int n) {
        if ( n < 2 ) return false;
        int r = (int) Math.sqrt(n);
        for ( int i = 2; i <= r; ++i )
            if ( n % i == 0 )
                return false;
        return true;
    }
}