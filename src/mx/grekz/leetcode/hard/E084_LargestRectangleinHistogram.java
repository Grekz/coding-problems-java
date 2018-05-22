package mx.grekz.leetcode.hard;

import java.util.Stack;

/**
 * @author grekz
 */
public class E084_LargestRectangleinHistogram {

    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        if ( n < 1 ) return 0;
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        for ( int i = 0; i <= n; i++ ) {
            int cur = i != n ? heights[i] : 0;
            while ( !stack.isEmpty() && cur < heights[stack.peek()] ) {
                int h = heights[stack.pop()];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                res = Math.max(res, h * w);
            }
            stack.push(i);
        }
        return res;
    }
}