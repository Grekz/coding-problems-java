package mx.grekz.leetcode.easy;

public class E028_ImplementstrStr {  
    public int strStr(String haystack, String needle) {
        return strStr(haystack, needle, 0);
    }    
    private int strStr(String haystack, String needle, int idx) {
        int nLen = needle.length();
        if ( haystack.length()-idx < nLen ) { return -1; }        
        if ( haystack.substring(idx, idx+nLen).equals(needle) ) { return idx; } 
        return strStr(haystack, needle, idx+1);
    }
}
