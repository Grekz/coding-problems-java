package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E983_MinimumCostForTickets {

    public int mincostTickets(int[] days, int[] costs) {
        int last = days[days.length - 1];
        int[] costDays = new int[last + 1];
        for ( int x : days )
            costDays[x] = 2147483647;
        for ( int i = 1; i <= last; i++ ) {
            if ( costDays[i] == 2147483647 ) {
                int minCost = costDays[i - 1] + costs[0];
                minCost = Math.min(minCost, costDays[goz(i, 7)] + costs[1]);
                minCost = Math.min(minCost, costDays[goz(i, 30)] + costs[2]);
                costDays[i] = minCost;
            }else{
                costDays[i] = costDays[i - 1];
            }
        }
        return costDays[last];
    }
    private int goz(int a, int b) {
        if ( a < b )
            return 0;
        return a - b;
    }
}