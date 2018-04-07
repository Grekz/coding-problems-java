package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E441_ArrangingCoins {
    public int arrangeCoins(int n) {
        return (int)( ( Math.sqrt( 1 + 8L * n ) - 1 ) / 2 );
    }
}