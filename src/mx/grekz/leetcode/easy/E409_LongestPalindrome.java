package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E409_LongestPalindrome {
    public int longestPalindrome(String s) {
        int res = 0, c[] = new int[58]; //from A to z
        for( char x : s.toCharArray() )
            if ( c[x - 'A'] == 1 ){
                res += 2;
                c[x - 'A'] = 0;
            }else{
                c[x - 'A'] = 1;
            }
        return (res == s.length() ? 0 : 1) + res;
    }
}