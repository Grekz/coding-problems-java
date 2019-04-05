package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E0941_ValidMountainArray {
    public boolean validMountainArray(int[] A) {
        int n = A.length, i = 0;
        while ( i + 1 < n && A[i] < A[i + 1] ) i++; 
        if ( i== 0 || i == n - 1 ) return false;
        while ( i + 1 < n && A[i] > A[i + 1] ) i++;
        return i == n - 1;
    }
}