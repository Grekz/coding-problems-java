package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E1006_ClumsyFactorial {
    public int clumsy(int N) {
        return N + new int[]{1, 2, 2, -1, 0, 0, 3, 3}[ N > 4 ? N % 4 : N + 3 ];
    }
}