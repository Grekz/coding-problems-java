package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E791_CustomSortString {

    public String customSortString(String S, String T) {
        int[] tmp = new int[26];
        for ( char c : T.toCharArray() ) tmp[c - 97]++ ;
        String res = "";
        for ( char c : S.toCharArray() )
            while ( tmp[ c - 97 ]-- > 0 )
                res += c;
        for ( int i = 0; i < 26; i++)
            while ( tmp[i]-- > 0 ) 
                res += (char)(i + 97);
        return res;
    }
}