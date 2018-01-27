package mx.grekz.leetcode.easy;

public class E066_PlusOne {
    public int[] plusOne(int[] d) {
        int le = d.length;
        for ( int i = le - 1; i >= 0; i--) {
            int cur = d[i];
            if ( cur < 9 ) {
                d[i] += 1;
                return d;
            }
            d[i] = 0;
        }
        int[] res = new int[ le + 1 ];
        res[0] = 1;
        return res;
    }
}
