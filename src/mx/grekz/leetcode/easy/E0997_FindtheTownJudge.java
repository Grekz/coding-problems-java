package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E0997_FindtheTownJudge {
    public int findJudge(int N, int[][] trust) {
        int[] c = new int[N + 1];
        for ( int[] x : trust ) {
            c[x[0]] -= 1;
            c[x[1]] += 1;
        }
        for ( int i = 1; i <= N; i++ ) {
            if ( c[i] == N - 1 ) {
                return i;
            }
        }
        return -1;
    }
}