package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E389_FindtheDifference {

    public char findTheDifference(String s, String t) {
        char[] a = s.toCharArray(), b = t.toCharArray();
        for (int i = 0; i < a.length; i++) b[a.length] ^= a[i] ^ b[i];
        return b[a.length];
    }
}