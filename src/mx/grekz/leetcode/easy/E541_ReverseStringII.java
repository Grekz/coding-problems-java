package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E541_ReverseStringII {
    public String reverseStr(String s, int k) {
        char[] cArr = s.toCharArray();
        int n = cArr.length;
        for( int i = 0; i < n; i = i + 2 * k ){
            int ii = i, j = i + k - 1 > n - 1 ? n - 1 : i + k - 1;
            while(ii<j){
                char tmp = cArr[ii];
                cArr[ii++] = cArr[j];
                cArr[j--] = tmp;
            }
        }
        
        return String.valueOf(cArr);
    }
}