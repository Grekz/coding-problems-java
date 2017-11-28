package mx.grekz.leetcode.easy;

public class E541_ReverseStringII {
	/**
	 * https://leetcode.com/problems/reverse-string-ii/description/
	 */
	public String reverseStr(String s, int k) {
        char[] cArr = s.toCharArray();
        int n = cArr.length;
        for( int i = 0; i < n; i = i + 2 * k )
            swap(cArr, i, i + k - 1 > n - 1 ? n - 1 : i + k - 1);
        
        return String.valueOf(cArr);
    }
    private void swap(char[] arr, int i, int j){
        while(i<j){
            char tmp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = tmp;
        }
    }

}
