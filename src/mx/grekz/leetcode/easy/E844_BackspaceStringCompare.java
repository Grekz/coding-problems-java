package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E844_BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        return doit(S).equals(doit(T));
    }
    private String doit(String s) {
        int n = s.length();
        int c = 0;
        char hash = '#';
        String res = "";
        for ( int i = n - 1; i > -1; i-- ) {
            char cur = s.charAt(i);
            if ( cur == hash )
                c++;
            else if ( c > 0 )
                c--;
            else
                res += cur;
        }
        return res;
    }
}