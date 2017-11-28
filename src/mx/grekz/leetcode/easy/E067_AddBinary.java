package mx.grekz.leetcode.easy;

import java.math.BigInteger;

/**
 * https://leetcode.com/problems/add-binary/description/
 * @author grekz
 *
 */
public class E067_AddBinary {
    public String addBinary(String a, String b) {
        BigInteger res = new BigInteger(a,2).add(new BigInteger(b,2));
        return res.toString(2);
    }
}
