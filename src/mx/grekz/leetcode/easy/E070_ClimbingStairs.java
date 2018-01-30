package mx.grekz.leetcode.easy;

public class E070_ClimbingStairs {
    public int climbStairs(int n) {
        return (int)(1/Math.sqrt(5)*(Math.pow((1+Math.sqrt(5))/2,n+1)-Math.pow((1-Math.sqrt(5))/2,n+1)));
    }
}
