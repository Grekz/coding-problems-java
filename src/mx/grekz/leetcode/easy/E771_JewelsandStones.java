package mx.grekz.leetcode.easy;

/**
 * @author grekz
 *
 */
public class E771_JewelsandStones {
    public int numJewelsInStones(String J, String S) {
        return S.replaceAll("[^" + J + "]","").length();
    }
}