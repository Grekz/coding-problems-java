package mx.grekz.leetcode.easy;

public class E171_ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        int res = 0, len = s.length() -1;
        char[] arr = s.toCharArray();
        for(int i = len; i >= 0 ; i-- ){
            int c = arr[i] - 'A' + 1;
            res += c * Math.pow(26,len - i);
        }
        return res;
    }
}
