package mx.grekz.leetcode.easy;

public class E014_LongestCommonPrefix {
    public String longestCommonPrefix(String[] s) {
        if ( s == null || s.length < 1 ) return "";
        if (s.length < 2 ) return s[0];
        String prefix = s[0];
        for(int i = 1; i < s.length && prefix.length() > 0; i++)
            while(s[i].indexOf(prefix) != 0)
                prefix = prefix.substring(0, prefix.length() - 1);
        return prefix;
    }
}
