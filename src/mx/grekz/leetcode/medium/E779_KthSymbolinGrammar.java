package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E779_KthSymbolinGrammar {
    public int kthGrammar(int N, int K) {
        int n = 0, k = K - 1;
        while ( k > 0 ) {
            k &= k - 1;
            n += 1;
        }
        return n & 1;
    }
}