package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E824_GoatLatin {
    public String toGoatLatin(String S) {
        String vowels = "aeiouAEIOU";
        String res = "";
        int i = 1;
        for ( String c : S.split("\\s") ) {
            res += " ";
            char curChar = c.charAt(0);
            if ( vowels.indexOf(curChar) > -1 ) {
                res += c;
            }else{
                res += c.substring(1) + c.charAt(0); 
            }
            res += "ma";
            for (int j = 0; j < i; j++) {
                res += "a";
            }
            i += 1;
        }
        return res.substring(1);
    }
}