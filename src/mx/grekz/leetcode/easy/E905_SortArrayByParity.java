package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E905_SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int i = 0, j = A.length - 1;
        while (i < j) {
            if ((A[i] & 1) == 1) {
                int cur = A[i];
                A[i] = A[j];
                A[j] = cur;
                j--;
            } else {
                i++;
            }
        }
        return A;
    }
}