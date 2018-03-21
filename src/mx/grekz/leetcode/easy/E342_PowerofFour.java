package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E342_PowerofFour {
    public boolean isPowerOfFour(int n) {
        if( n < 1) return false;
        while(n % 4 == 0) n/= 4;
        return n == 1;
    }
}