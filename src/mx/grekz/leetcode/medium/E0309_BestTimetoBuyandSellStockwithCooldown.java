package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E0309_BestTimetoBuyandSellStockwithCooldown {
    public int maxProfit(int[] prices) {
        int a = 0, b = 0, c = Integer.MIN_VALUE;
        for (int price : prices) {
            int d = b;
            b = Math.max(b, c + price);
            c = Math.max(c, a - price);
            a = d;
        }
        return b;
    }
}