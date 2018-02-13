package mx.grekz.leetcode.easy;

public class E125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() < 1){
            return true;
        }
        for(int i = 0, j = s.length() - 1 ; i < j; i++,j--){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                j++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(j))){
                i--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)) ){
                return false;
            }
        }
        return true;
    }
}
