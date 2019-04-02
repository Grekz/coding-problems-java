package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E1017_ConverttoBase2 {
    public String baseNeg2(int N) {
        String res = "";
        while ( N != 0 ) {
            res = String.valueOf(N & 1) + res;
            N = -(N >> 1);
        }
        return res == "" ? "0" : res;
    }
}