package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E868_BinaryGap {

    public int binaryGap(int N) {
        int l = -1, res = 0;
        for ( int i = 0; i < 32; i++ ) {
            if ( ( ( N >> i ) & 1) > 0 ) {
                if ( l >= 0 ) {
                    res = Math.max(res, i - l);
                }
                l = i;
            }
        }
        return res;
    }
}