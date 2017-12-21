package mx.grekz.leetcode.easy;

import java.util.Stack;

public class E020_ValidParentheses {
    public boolean isValid(String s) {
        if ( s == null || s.length() < 1 ) return true;
        if ( s.length() == 1 ) return false;
        final String open = "({[", close = ")}]";
        Stack<Character> stack = new Stack<>();
        for(char cur : s.toCharArray()){
            if (open.indexOf(cur) != -1 ) stack.push(cur);
            else {
                if ( stack.isEmpty() || open.indexOf(stack.pop()) != close.indexOf(cur) ) return false;
            }
        }
        return stack.isEmpty();
    }
}
