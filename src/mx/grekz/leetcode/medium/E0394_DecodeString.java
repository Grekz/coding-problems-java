package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E0394_DecodeString {
    public String decodeString(String s) {
        String res = "";
        Stack<String> stack = new Stack<>();
        int n = s.length();
        for ( int i = 0; i < n; i++ ) {
            char c = s.charAt(i);
            if ( Character.isDigit(c) ) {
                int j = i;
                while(Character.isDigit(c))
                    c = s.charAt(++j);
                stack.push(res);
                stack.push(s.substring(i, j));
                i = j;
                res = "";
            } else if ( c == ']' ) {
                String tmpRes = "";
                for ( int t = Integer.parseInt(stack.pop()); t > 0; t-- )
                    tmpRes += res;
                res = stack.pop() + tmpRes;
            } else {
                res += Character.toString(c) ;
            }
        }
        return res;
    }
}