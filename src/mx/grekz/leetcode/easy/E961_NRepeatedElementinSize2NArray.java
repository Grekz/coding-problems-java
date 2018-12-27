package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E961_NRepeatedElementinSize2NArray {
    public int repeatedNTimes(int[] A) {
        Map<Integer, Boolean> c = new HashMap<>();
        for( int x : A ) {
            if ( c.getOrDefault(x, Boolean.FALSE))
                return x;
            c.put(x, Boolean.TRUE);
        }
        return -1;
    }
}