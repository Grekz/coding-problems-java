package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E581_ShortestUnsortedContinuousSubarray {

    public int findUnsortedSubarray(int[] nums) {
        int len = nums.length, 
            ini = -1, 
            end = -2, 
            max = -2147483648, 
            min = 2147483647;
        for (int i = 0; i < len; i++) {
          max = Math.max(max, nums[ i ]);
          min = Math.min(min, nums[ len - 1 - i ]);
          if (nums[ i ] < max) {end = i;}
          if (nums[ len - 1 - i ] > min) {ini = len - 1 - i;} 
        }
        return end - ini + 1;
    }
}