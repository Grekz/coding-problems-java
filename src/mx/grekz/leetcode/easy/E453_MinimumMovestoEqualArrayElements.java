package mx.grekz.leetcode.easy;

import java.util.Arrays;

/**
 * @author grekz
 */
public class E453_MinimumMovestoEqualArrayElements {
    public int minMoves(int[] n) {
        if ( n == null || n.length < 2 ) return 0;
        int min = Arrays.stream(n).min().getAsInt(), res = 0;
        for(int x : n) res += x - min;
        return res;
    }
}