package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E400_NthDigit {

    public int findNthDigit(int n) {
        if ( n < 10 ) { 
            return n; 
        }
        n -= 1;
        int digitInNumber = 1;
        int range = 1;
        while (n / 9 / range / digitInNumber >= 1) {
            n -= 9 * range * digitInNumber;
            digitInNumber++;
            range *= 10;
        }
        return (range + n/digitInNumber + "").charAt(n%digitInNumber) - '0';
    }
}