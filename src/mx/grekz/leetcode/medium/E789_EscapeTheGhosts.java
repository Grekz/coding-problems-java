package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E789_EscapeTheGhosts {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int t0 = target[0], t1 = target[1];
        int dest = Math.abs(t1) + Math.abs(t0);
        for ( int[] g : ghosts ) {
            int cur = Math.abs(g[1]-t1) + Math.abs(g[0]-t0);
            if ( cur <= dest )
                return false;
        }
        return true;
    }
}