package org.grekz.leetcode.easy;
/**
 * https://leetcode.com/problems/reverse-integer/description/
 * @author grekz
 *
 */
public class E007_ReverseInteger {
    public int reverse(int x) {
        int s = x < 0 ? -1 : 1;
        x = Math.abs(x);
        long res = 0L;
        while(x > 0) {
            res = res * 10 + ( x % 10 );
            x /= 10;
            if ( res > Integer.MAX_VALUE ) return 0;
        }
        return (int)res * s;
    }
}
