package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E344_ReverseString {

    public String reverseString(String s) {
        if(s == null || s.length() < 2) return s;
        char[] arr = s.toCharArray();
        for(int i = 0 ; i < arr.length / 2; i++) swap(arr, i, arr.length - 1 - i);
        return new String(arr);
    }
    public void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}