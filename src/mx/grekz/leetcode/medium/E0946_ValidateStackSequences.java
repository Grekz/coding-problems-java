package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E0946_ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = popped.length;
        if ( n != pushed.length ) return false;
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for ( int x : pushed ) {
            stack.push(x);
            while ( j < n && !stack.isEmpty() && stack.peek() == popped[j] ) {
                ++j;
                stack.pop();
            }
        }
        return j == n;
    }
}