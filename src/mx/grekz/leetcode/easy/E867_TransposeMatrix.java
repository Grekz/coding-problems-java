package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E867_TransposeMatrix {
    public int[][] transpose(int[][] A) {
        int n = A.length, m = A[0].length, res[][] = new int[m][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                res[j][i] = A[i][j];
        return res;
    }
}