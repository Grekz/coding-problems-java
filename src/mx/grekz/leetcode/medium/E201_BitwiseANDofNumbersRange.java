package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E201_BitwiseANDofNumbersRange {
    public int rangeBitwiseAnd(int m, int n) {
        while ( m < n ) n &= n-1;
        return n;
    }
}