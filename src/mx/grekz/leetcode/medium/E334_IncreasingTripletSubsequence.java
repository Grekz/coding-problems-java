package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E334_IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int a = 2147483647, b = 2147483647;
        for ( int x : nums )
            if ( x <= a )
                a = x;
            else if ( x <= b )
                b = x;
            else
                return true;
        return false;
    }
}