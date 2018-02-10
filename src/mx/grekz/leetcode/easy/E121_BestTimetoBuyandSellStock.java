package mx.grekz.leetcode.easy;

public class E121_BestTimetoBuyandSellStock {

    public int maxProfit(int[] prices) {
        if(prices == null || prices.length <= 1)
            return 0;
        int buy = 2147483647; 
        int result = 0;
        for(int stockPrice : prices){
            if(stockPrice < buy){
                buy = stockPrice;
            }else{
                if(result < (stockPrice - buy )){
                    result = stockPrice - buy;
                }
            }
        }
        return result;
    }
}
