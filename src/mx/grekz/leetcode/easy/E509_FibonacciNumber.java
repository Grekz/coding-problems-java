package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E509_FibonacciNumber {
    public int fib(int N) {
        if (N < 2)
            return N;
        return fib(N - 1) + fib(N - 2);
    }
}