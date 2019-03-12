package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E856_ScoreofParentheses {
    public int scoreOfParentheses(String S) {
        int bal = 0, res = 0;
        char prev = 0;
        for ( char c : S.toCharArray()) {
            if ( c == '(')
                bal++;
            else {
                bal--;
                if ( prev == '(') {
                    res += 1 << bal;
                }
            }
            prev = c;
        }
        return res;
    }
}