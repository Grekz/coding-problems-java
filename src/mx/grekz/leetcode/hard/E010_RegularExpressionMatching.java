package mx.grekz.leetcode.hard;

/**
 * @author grekz
 */
public class E010_RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        int tN = s.length(), pN = p.length();
        boolean dp[][] = new boolean[tN + 1][pN + 1];
        dp[tN][pN] = true;
        for ( int i = tN; i >= 0; i-- ) {
            for ( int j = pN - 1; j >= 0; j-- ) {
                boolean fMatch = ( i < tN && ( s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') );
                if ( j + 1 < pN && p.charAt(j + 1) == '*' ) {
                    dp[i][j] = dp[i][j + 2] || fMatch && dp[i+1][j];
                }else{
                    dp[i][j] = fMatch && dp[i+1][j+1];
                }
            }
        }
        return dp[0][0];
    }
}