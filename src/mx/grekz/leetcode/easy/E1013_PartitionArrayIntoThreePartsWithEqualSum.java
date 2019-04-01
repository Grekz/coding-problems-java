package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E1013_PartitionArrayIntoThreePartsWithEqualSum {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for ( int x : A ) sum += x;
        if ( sum % 3 != 0 ) return false;
        sum /= 3;
        int cnt = 0, tmp = 0;
        for ( int x : A ) {
            tmp += x;
            if ( sum == tmp ) {
                cnt++;
                tmp = 0;
            }
        }
        return cnt == 3;
    }
}