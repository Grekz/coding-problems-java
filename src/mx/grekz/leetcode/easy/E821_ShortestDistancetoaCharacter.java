package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E821_ShortestDistancetoaCharacter {
    public int[] shortestToChar(String S, char C) {
        int n = S.length();
        int pos = -n;
        int[] res = new int[n];
        char[] cArr = S.toCharArray();
        for ( int i = 0; i < n; i++) {
            if ( cArr[i] == C ) {
                pos = i;
            }else{
                res[i] = i - pos;
            }
        }
        for ( int i = n - 1; i >= 0; i--) {
            if ( cArr[i] == C ) {
                pos = i;
            }else{
                res[i] = Math.min(res[i], Math.abs(i-pos));
            }
        }
        return res;
    }
}