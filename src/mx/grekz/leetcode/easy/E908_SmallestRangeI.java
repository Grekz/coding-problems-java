package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E908_SmallestRangeI {
    public int smallestRangeI(int[] A, int K) {
        if (A.length < 1)
            return 0;
        int a = A[0];
        int b = a;
        for (int y : A) {
            if (y > a)
                a = y;
            if (y < b)
                b = y;
        }
        int c = b + K;
        int d = a - K;
        if (c >= d)
            return 0;
        return d - c;
    }
}