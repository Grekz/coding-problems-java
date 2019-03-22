package mx.grekz.leetcode.hard;

/**
 * @author grekz
 */
public class E0042_TrappingRainWater {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1, ml = 0, mr = 0, res = 0;
        while ( l < r ) { 
            if ( height[l] < height[r] ) { 
                if ( ml < height[l] ) {
                    ml = height[l];
                }else{
                    res += ml - height[l];
                }
                l++;
            }else{
                if ( mr < height[r] ) {
                    mr = height[r];
                }else{
                    res += mr - height[r];
                }
                r--;
            }
        }
        return res;
    }
}