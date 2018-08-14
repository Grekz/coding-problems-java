package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E860_LemonadeChange {

    public boolean lemonadeChange(int[] bills) {
        int f = 0, t = 0;
        for (int x : bills) {
            if ( x == 5 )
                f++;
            else if ( x == 10 ) { 
                t++;
                f--;
            }else if ( t > 0 ) {
                t--;
                f--;
            }else
                f -= 3;
            if ( f < 0 )
                return false;
        }
        return true;
    }
}