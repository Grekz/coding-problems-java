package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E0714_BestTimetoBuyandSellStockwithTransactionFee {
    public int maxProfit(int[] prices, int fee) {
        int a = 0, b = -2147483648, c;
        for ( int x : prices ) {
            c = a;
            a = Math.max(a, b + x);
            b = Math.max(b, c - x - fee);
        }
        return a;
    }
}