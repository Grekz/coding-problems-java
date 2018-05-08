package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E717_1bitand2bitCharacters {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length -1;
        if ( n < 1 ) { return true; }
        for ( int i = n - 1; i >= 0; i--) {
            if ( bits[i] == 0 ) {
                return ( n - i ) % 2 != 0;
            }
        }   
        return ( n - 1 ) % 2 != 0;
    }
}