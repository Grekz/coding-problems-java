package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E739_DailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        int top = -1, n = T.length;
        int[] res = new int[n], stack = new int[n];
        for ( int i = 0; i < n; i++ ) {
            while ( top >= 0 && T[i] > T[stack[top]] ) {
                int id = stack[top--];
                res[id] = i - id;
            }
            stack[++top] = i;
        }
        return res;
    }
}