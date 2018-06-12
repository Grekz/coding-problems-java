package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E038_CountandSay {

    public String countAndSay(int n) {
        if ( n < 1 ) return "0";
        if ( n == 1 ) return "1";
        if ( n == 2 ) return "11";
        if ( n == 3 ) return "21";
        char[] arr = countAndSay( n - 1 ).toCharArray();
        int cur = -1, count = 0;
        String res = "";
        for ( int i = 0; i < arr.length; i++ ) {
           char x = arr[i];
           if ( cur != x ) {
                if (count > 0)
                    res += count + "" + (char)cur;
                count = 1;
                cur = x;
           }else
                count++;
        }
        res += count + "" + (char)cur;
        return res;
    }
}