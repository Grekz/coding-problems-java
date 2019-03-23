package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E0139_WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length() + 1;
        boolean[] f = new boolean[n];
        f[0] = true;
        for ( int i = 1; i < n; i++ ) {
            for ( int j = 0; j < i; j++ ) {
                if ( f[j] && wordDict.contains(s.substring(j,i)) ) {
                    f[i] = true;
                    break;
                }
            }
        }
        return f[n - 1];
    }
}