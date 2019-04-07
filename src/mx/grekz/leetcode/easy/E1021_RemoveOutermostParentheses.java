package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E1021_RemoveOutermostParentheses {
    public String removeOuterParentheses(String S) {
        String res = "";
        int c = 0;
        for ( char x : S.toCharArray() )
            if ( (x == '(' && c++ > 0 ) || ( x == ')' && c-- > 1 ) )
                res += x;
        return res;
    }
}