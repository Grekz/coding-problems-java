package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E921_MinimumAddtoMakeParenthesesValid {
    public int minAddToMakeValid(String S) {
        int res = 0, bal = 0;
        for (char x : S.toCharArray()) {
            bal += x == '(' ? 1 : -1;
            if (bal == -1) {
                res++;
                bal++;
            }
        }
        return bal + res;
    }
}