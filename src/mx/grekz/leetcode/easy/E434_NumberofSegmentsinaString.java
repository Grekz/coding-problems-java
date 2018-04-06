package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E434_NumberofSegmentsinaString {

    public int countSegments(String s) {
        s = s.trim();
        if ( s.length() < 1 ) return 0;
        int res = 1;
        char[] arr = s.toCharArray();
        for ( int i = 1; i < arr.length; i++ ){
            if ( arr[i] != ' ' && arr[i-1] == ' ' ) res++;
        }
        return res;
    }
}