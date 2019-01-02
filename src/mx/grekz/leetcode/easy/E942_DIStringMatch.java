package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E942_DIStringMatch {
    public int[] diStringMatch(String S) {
        int n = S.length();
        int right = n, left = 0;
        int[] res = new int[right + 1];
        for (int i = 0; i < n; i++)
            res[i] = S.charAt(i) == 'I' ? left++ : right--;
        res[res.length - 1] = right;
        return res;
    }
}