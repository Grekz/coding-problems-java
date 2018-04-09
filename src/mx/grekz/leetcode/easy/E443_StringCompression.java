package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E443_StringCompression {
    public int compress(char[] chars) {
        int indAns = 0;
        int ind = 0;
        int n = chars.length;
        while ( ind < n ) {
            char c = chars[ind];
            int cc = 0;
            while ( ind < n && c == chars[ind] ) {
                cc += 1;
                ind += 1;
            }
            chars[indAns] = c;
            indAns += 1;
            if ( cc > 1 ) {
                for ( char x : (cc + "").toCharArray() ) {
                    chars[indAns] = x;
                    indAns += 1;
                }
            }
        }
        return indAns;
    }
}