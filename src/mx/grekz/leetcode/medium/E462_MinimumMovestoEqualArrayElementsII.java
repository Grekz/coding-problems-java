package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E462_MinimumMovestoEqualArrayElementsII {

    public int minMoves2(int[] n) {
        Arrays.sort(n);
        int i = 0, j = n.length - 1, res = 0;
        while (i < j)
            res += n[j--] - n[i++];
        return res;
    }
}