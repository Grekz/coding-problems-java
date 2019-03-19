package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E1012_ComplementofBase10Integer {
    public int bitwiseComplement(int N) {
        int a = 1;
        while ( a < N ) a = a * 2 + 1;
        return a - N;
    }
}