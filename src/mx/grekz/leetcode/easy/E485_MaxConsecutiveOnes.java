package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E485_MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] n) {
        int cur = 0, max = 0;
        for(int x : n){
            if ( x == 1 ) cur++;
            else cur = 0;
            if ( max < cur ) max = cur;
        }
        return max;
    }
}