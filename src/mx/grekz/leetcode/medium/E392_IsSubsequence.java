package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E392_IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        char[] sa = s.toCharArray(), ta = t.toCharArray();
        int idx = -1;
        for (char c : sa) {
            idx = findIdx(ta, c, idx + 1);
            if (idx == -1)
                return false;
        }
        return true;
    }

    private int findIdx(char[] arr, char c, int idx) {
        for (int i = idx; i < arr.length; i++)
            if (arr[i] == c)
                return i;
        return -1;
    }
}