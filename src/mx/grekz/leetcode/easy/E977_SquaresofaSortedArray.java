package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E977_SquaresofaSortedArray {
    public int[] sortedSquares(int[] A) {
        int n = A.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++)
            A[i] *= A[i];
        for (int i = 0, j = n - 1, k = n - 1; i <= j; k--)
            res[k] = A[A[i] < A[j] ? j-- : i++];
        return res;
    }
}