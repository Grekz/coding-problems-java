package mx.grekz.leetcode.easy;

public class E058_LengthofLastWord {
    public int lengthOfLastWord(String s) {
        return s.trim().length()-1-s.trim().lastIndexOf(" ");
    }
}
