package mx.grekz.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class E022_GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        btHelper(res, "", 0, 0, n);
        return res;
    }
    
    private void btHelper(List<String> res, String str, int open, int close, int max){
        if ( open + close == max * 2) {
            res.add(str);
            return;
        }
        if ( open < max ) 
            btHelper(res, str + "(", open + 1, close, max);
        if ( close < open ) 
            btHelper(res, str + ")", open, close + 1, max);
    }}
