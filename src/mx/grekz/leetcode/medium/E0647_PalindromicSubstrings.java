package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E0647_PalindromicSubstrings {
    public int countSubstrings(String s) {
        int n = s.length();
        int max = 2 * n - 1;
        int res = 0;
        
        for ( int i = 0; i <= max; ++i ) {
            int l = i / 2;
            int r = l + i % 2;
            while ( l >= 0 && r < n && s.charAt(l) == s.charAt(r) ) {
                r++; l--; res++;
            }
        }
        
        return res;
    }
}