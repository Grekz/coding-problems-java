package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E526_BeautifulArrangement {

    public int countArrangement(int N) {
        return permutate(N, 1, 0, new boolean[N+1]);
    }
    private int permutate(int n, int pos, int count, boolean[] v) {
        if ( pos > n ) return count + 1;
        for ( int i = 1; i <= n; i++ )
            if ( !v[i] && ( i % pos == 0 || pos % i == 0 ) ) {
                v[i] = true;
                count = permutate(n, pos + 1, count, v);
                v[i] = false;
            }
        return count;
    }
}