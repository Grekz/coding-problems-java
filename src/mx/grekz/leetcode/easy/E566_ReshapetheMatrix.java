package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E566_ReshapetheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int n = nums.length;
        int m = nums[0].length;
        if ( n * m != r * c ) {
            return nums;
        }
        int res[][] = new int[r][c];
        int i = 0;
        for ( int[] curArr : nums ) {
            for ( int cur : curArr ) {
                res[i/c][i++%c] = cur;
            }
        }
        return res;
    }
}