package mx.grekz.leetcode.easy;

public class E202_HappyNumber {

    public boolean isHappy(int n) {
        if (n < 1 || n == 4 ) return false;
        if (n == 1 || n == 7 || n == 10 || n == 13 || n == 19 || n == 23 ) return true;
        return isHappy(getSum(n));
    }
    public int getSum(int n){
        int res = 0;
        while (n > 0){
            res += (n%10) * (n % 10);
            n /= 10;
        }
        return res;
    }
}
