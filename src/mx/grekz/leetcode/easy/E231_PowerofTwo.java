package mx.grekz.leetcode.easy;

/**
 * @author grekz
 *
 */
public class E231_PowerofTwo {

    public boolean isPowerOfTwo(int n) {
        if(n < 1 ) return false;
        boolean hasOne = false;
        for(int i = 0 ; i < 32; i++){
            if( (n & 1) == 1 ){
                if(hasOne) return false;
                else hasOne = true;
            }
            n >>= 1;
        }
        return true;
    }
}