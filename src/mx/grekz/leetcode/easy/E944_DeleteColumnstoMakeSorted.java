package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E944_DeleteColumnstoMakeSorted {
    public int minDeletionSize(String[] A) {
        if (A.length < 1)
            return 0;
        int res = 0;
        int lenA = A.length;
        int lenW = A[0].length();
        for (int i = 0; i < lenW; i++)
            for (int j = 0; j < lenA - 1; j++)
                if (A[j].charAt(i) > A[j + 1].charAt(i)) {
                    res++;
                    j = lenA;
                }
        return res;
    }
}