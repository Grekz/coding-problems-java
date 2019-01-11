package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E896_MonotonicArray {
    public boolean isMonotonic(int[] A) {
        boolean a = true, b = true;
        for (int i = 1; i < A.length; i++) {
            a = a && A[i - 1] <= A[i];
            b = b && A[i - 1] >= A[i];
        }
        return a || b;
    }
}