package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E268_MissingNumber {
    public int missingNumber(int[] n) {
        int res = 0;
        //based in this principle a^b^b = a
        for (int i = 0; i < n.length ; i++)
            res ^= i ^ n[i];
        return res ^ n.length;
    }
}