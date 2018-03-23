package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E345_ReverseVowelsofaString {
    public String reverseVowels(String s) {
        if(s == null || s.length() < 2) return s;
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        while( i < j){
            if( !isVowel(chars[i]) ){
                i++;
                continue;
            }
            if(!isVowel(chars[j])){
                j--;
                continue;
            }
            swap(chars, i++, j--);
        }
        return new String(chars);
    }
    public boolean isVowel(char x){
        return "aeiouAEIOU".indexOf(x) != -1 ;
    }
    public void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}