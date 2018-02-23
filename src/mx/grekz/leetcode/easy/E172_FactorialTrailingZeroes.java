package mx.grekz.leetcode.easy;

public class E172_FactorialTrailingZeroes {

    public int trailingZeroes(int n) {
        int res = 0;
        /* all zeros are factors of 5 * 2 */
        while ( n > 0 ){
            n /= 5;
            res += n;
        }
        return res;
    }
}
