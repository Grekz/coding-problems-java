package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E1018_BinaryPrefixDivisibleBy5 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        int tmp = 0;
        List<Boolean> res = new ArrayList<>();
        for ( int x : A ) {
            tmp = ( ( tmp << 1 ) + x ) % 5;
            res.add( tmp == 0 );
        }
        return res;
    }
}