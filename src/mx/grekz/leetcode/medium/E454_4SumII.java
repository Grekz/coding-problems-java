package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E454_4SumII {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        java.util.Map<Integer, Integer> m = new java.util.HashMap<>();
        int res = 0;
        for ( int a : A )
            for ( int b : B )
                m.put(a+b, m.getOrDefault(a+b, 0) + 1 );
        for ( int a : C )
            for ( int b : D )
                res += m.getOrDefault(-(a+b), 0);
        return res;
    }
}