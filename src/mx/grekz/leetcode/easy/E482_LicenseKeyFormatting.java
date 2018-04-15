package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E482_LicenseKeyFormatting {

    public String licenseKeyFormatting(String S, int K) {
        char[] cArr = S.replaceAll("-","").toUpperCase().toCharArray();
        StringBuilder res = new StringBuilder();
        int len = cArr.length, count = 0;
        for ( int i = len - 1; i >= 0 ; i-- ){
            if ( cArr[i] != '-') {
                res.append(cArr[i]);
                count++;
                if ( count == K && i > 0 ) {
                    res.append('-');
                    count = 0;
                }
            }
        }
        return res.reverse().toString();
    }
}