package mx.grekz.leetcode.easy;

public class E168_ExcelSheetColumnTitle {
    /*
    Inputs:
    1
    55
    5554
    28
    26
    
    Results:
    "A"
    "BC"
    "HEP"
    "AB"
    "Z"
    */
    public String convertToTitle(int n) {
        if ( n == 0 ) return "";
        String res = "";
        while ( n-- > 0 ) {
            res = (char) ( 'A' + n % 26 ) + res;
            n /= 26;
        }
        return res;
    }
}