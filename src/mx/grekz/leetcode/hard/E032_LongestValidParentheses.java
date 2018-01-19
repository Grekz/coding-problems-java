package mx.grekz.leetcode.hard;

import java.util.Stack;

public class E032_LongestValidParentheses {
    public int longestValidParentheses(String s) {
        if (s == null || s.length() < 2) return 0;
        char[] cArr = s.toCharArray();
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for(int i = 0; i < cArr.length; i++){
            char c = cArr[i];
            if (c == '('){
                stack.push(i);
            }else{
                //System.out.println(stack);
                stack.pop();
                if (!stack.isEmpty())
                    res = Math.max(res, i - stack.peek() );
                else
                    stack.push(i);
            }
        }
        return res;
    }

}
