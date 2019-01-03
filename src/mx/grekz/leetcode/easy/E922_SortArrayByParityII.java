package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E922_SortArrayByParityII {
    public int[] sortArrayByParityII(int[] A) {
        int i = 0, j = 1, res[] = new int[A.length];
        for (int x : A) {
            if ((x & 1) == 0) {
                res[i++] = x;
                i++;
            } else {
                res[j++] = x;
                j++;
            }
        }
        return res;
    }
}