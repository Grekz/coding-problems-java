package mx.grekz.leetcode.hard;

/**
 * @author grekz
 */
public class E052_NQueensII {

    public int totalNQueens(int n) {
        boolean[] cols = new boolean[n], d2 = new boolean[2*n], d1 = new boolean[n*2];
        return bt(0, cols, d1, d2, n, 0);
    }
    private int bt(int row, boolean[] cols, boolean[] d1, boolean[] d2, int n, int count) {
        if ( row == n )
            return count + 1;
        for ( int c = 0; c < n; c++ ) {
            int id1 = n + c - row;
            int id2 = c + row;
            if ( !( cols[c] || d1[id1] || d2[id2] ) ) {
                cols[c]=true; d1[id1]=true; d2[id2] = true;
                count = bt(row + 1, cols, d1, d2, n, count);
                cols[c]=false; d1[id1]=false; d2[id2] = false;
            }
        }
        return count;
    }
}