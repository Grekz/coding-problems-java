package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E796_RotateString {
    public boolean rotateString(String A, String B) {
        return A.length() == B.length() && (A+A).indexOf(B) > -1;
    }
}