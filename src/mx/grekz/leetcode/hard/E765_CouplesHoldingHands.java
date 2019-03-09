package mx.grekz.leetcode.hard;

/**
 * @author grekz
 */
public class E765_CouplesHoldingHands {
    public int minSwapsCouples(int[] row) {
        int n = row.length, res = 0;
        int pos[] = new int[n];
        for ( int i = 0; i < n; i++ ) pos[row[i]] = i;
        for ( int i = 0; i < n; i += 2 ) {
            int pair = row[i] ^ 1;
            if ( pair != row[i + 1] ) {
                row[pos[pair]] = row[i + 1];
                pos[row[i + 1]] = pos[pair];
                res++;
            }
        }
        return res;
    }
}