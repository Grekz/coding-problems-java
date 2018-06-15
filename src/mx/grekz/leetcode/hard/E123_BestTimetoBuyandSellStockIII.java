package mx.grekz.leetcode.hard;

/**
 * @author grekz
 */
public class E123_BestTimetoBuyandSellStockIII {

    public int maxProfit(int[] prices) {
        int profitA = 0, buyA = -2147483648;
        int profitB = 0, buyB = buyA;
        int n = prices.length;
        for (int i = 0; i < n; i++ ) {
            int cur = prices[i];
            if ( i > 2 )
                profitB = Math.max(profitB, buyB + cur);
            if ( i > 1 )
                buyB = Math.max(buyB, profitA - cur);
            profitA = Math.max(profitA, buyA + cur);
            buyA = Math.max(buyA, -cur);
        }
        return Math.max(profitA,profitB);
    }
}