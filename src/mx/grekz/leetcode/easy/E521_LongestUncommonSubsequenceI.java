package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E521_LongestUncommonSubsequenceI {

    public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());   
    }
}