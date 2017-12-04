package mx.grekz.leetcode.medium;
/**
 * https://leetcode.com/problems/longest-palindromic-substring/description/
 * @author grekz
 *
 */
public class E005_LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1 ) return "";
        if (s.length() == 1 ) return s;
        int len = s.length(), cc = 1, pSize = len*2+3;
        char[] tmp = new char[pSize];
        int[] p = new int[pSize];
        tmp[0] = '@';
        for(int i = 0; i < len; i++){
            tmp[cc++] = '#';
            tmp[cc++] = s.charAt(i);            
        }
        tmp[cc++] = '#';
        tmp[cc++] = '%';
        int c = 0, r = 0, maxC = 0, maxP = 0;
        for (int i = 1; i < pSize - 1; i++ ){
            int mirror = 2 * c - i;
            if ( i < r ){
                p[i] = Math.min(r-i, p[ mirror ]);
            }
            while (tmp[i + ( p[i] + 1 ) ] == tmp[i - ( p[i] + 1 )]){
                p[i]++;
            }
            if (i + p[i] > r ){
                c = i;
                r = i + p[i];
                if ( p[i] > maxP ){
                    maxP = p[i];
                    maxC = i;
                }
            }
        }
        int start = maxC - maxP;
        int end = maxC + maxP;
        start /= 2;
        end /= 2;
        return s.substring(start, end);
    }

}
