package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E091_DecodeWays {

    public int numDecodings(String s) {
        if (s == null || s.length() < 1 || s.charAt(0) == '0' ) return 0;
        char[] ca = s.toCharArray();
        int len = ca.length, count[] = new int[len+1];
        count[0] = 1;
        count[1] = 1;
        for(int i = 2; i <= len; i++){
            char fc = ca[i-1], sc = ca[i-2];
            if ( fc != '0')
                count[i] = count[i-1];
                
            // if two last chars are below than 26
            if ( ( sc < '2' && sc > '0') || ( sc == '2' && fc < '7' ) )
                count[i] += count[i-2];
        }
        
        return count[len];
    }
}