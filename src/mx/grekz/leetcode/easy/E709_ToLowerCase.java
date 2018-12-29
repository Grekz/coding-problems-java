package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E709_ToLowerCase {
    public String toLowerCase(String str) {
        String res = "";
        for( char c : str.toCharArray() )
            res += c <= 90 && c >= 65 ? (char)(c + 32) : c;
        return res;
    }
}