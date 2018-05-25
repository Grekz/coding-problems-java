package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E062_UniquePaths {
    public int uniquePaths(int m, int n) {
        long res = 1;
        int s = m+n-1;
        for(int i = n; i < s ; i++)
            res = res *  i / (i- n + 1);
        return (int)res;
    }
}