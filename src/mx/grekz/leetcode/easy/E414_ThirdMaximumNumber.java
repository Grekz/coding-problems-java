package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E414_ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        Integer m1 = null, m2 = null, m3 = null;
        for ( Integer x : nums ){
            if ( x.equals(m1) || x.equals(m2) || x.equals(m3) ) continue;
            if ( m1 == null || x > m1 ) {
                m3 = m2;
                m2 = m1;
                m1 = x;
            }else if ( m2 == null || x > m2 ) {
                m3 = m2;
                m2 = x;
            }else if ( m3 == null || x > m3 ) {
                m3 = x;
            }
        }
        return m3 != null ? m3 : m1;
    }
}