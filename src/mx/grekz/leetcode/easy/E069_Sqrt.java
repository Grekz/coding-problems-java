package mx.grekz.leetcode.easy;

public class E069_Sqrt {
    public int mySqrt(int x) {
        long r = x;
        while ( r * r > x ) {
            r = ( r + x / r ) / 2;
        }
        return (int) r;
    }
}
