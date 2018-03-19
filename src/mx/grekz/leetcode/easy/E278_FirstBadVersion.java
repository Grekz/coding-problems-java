package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E278_FirstBadVersion {
	public int firstBadVersion(int n) {
        int l = 1, r = n, m;
        while ( l < r ){
            m = l + ( r - l ) / 2;
            if ( isBadVersion(m) ) r = m;
            else l = ++m;
        }
        return l;
    }
}