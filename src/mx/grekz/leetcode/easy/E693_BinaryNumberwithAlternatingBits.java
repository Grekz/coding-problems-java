package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E693_BinaryNumberwithAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        String b = Integer.toString(n,2);
        return !b.contains("11") && !b.contains("00");
    }
}