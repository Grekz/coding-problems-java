package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E1029_TwoCityScheduling {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort( costs, (a,b) -> { return a[0] - a[1] - (b[0] - b[1]) ;});
        int res = 0;
        for ( int i = 0; i < costs.length / 2; i++)
            res += costs[i][0] + costs[i+costs.length / 2][1];
        return res;
    }
}