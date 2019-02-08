package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E696_CountBinarySubstrings {

    public int countBinarySubstrings(String s) {
        char c[] = s.toCharArray();
        int res = 0, prev = 0, cur = 1, n = s.length();
        for ( int i = 1; i < n; i++ )
            if ( c[i-1] != c[i] ) {
                res += Math.min(prev, cur);
                prev = cur;
                cur = 1;
            }else{
                cur++;
            }
        return res + Math.min(prev, cur);
    }
}