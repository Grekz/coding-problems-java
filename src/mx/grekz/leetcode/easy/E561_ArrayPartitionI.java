package mx.grekz.leetcode.easy;

import java.util.Arrays;

/**
 * @author grekz
 */
public class E561_ArrayPartitionI {
    public int arrayPairSum(int[] n) {
        Arrays.sort(n);
        int res = 0;
        for( int i = 0; i < n.length; i += 2 )
            res += n[i];
        return res;
    }
}