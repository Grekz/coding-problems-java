package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E0150_EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for ( String x : tokens ) {
            if ( isOp(x) )
                stack.push(doOp(stack.pop(), stack.pop(), x));
            else
                stack.push(Integer.parseInt(x));
        }
        return stack.get(stack.size()-1) ;
    }
    private boolean isOp(String x) {
        return x.equals("+") || x.equals("-") || x.equals("*") || x.equals("/");  
    }
    private int doOp(Integer a, Integer b, String x) {
        if ( x.equals("+") )
            return b + a;
        if ( x.equals("-") )
            return b - a;
        if ( x.equals("*") )
            return b * a;
        return b / a;
    }
}