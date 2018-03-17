package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length() ) return false;
        int tmp[] = new int[26];
        for(char c : s.toCharArray()) {
            tmp[c - 'a']++;
        }
        for(char c : t.toCharArray()) {
            if ( tmp[c - 'a']-- == 0 ) {
                return false;
            }
            
        }
        return true;
    }
}