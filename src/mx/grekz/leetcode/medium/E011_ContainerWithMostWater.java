package mx.grekz.leetcode.medium;

public class E011_ContainerWithMostWater {
    public int maxArea(int[] hs) {
        int l = 0, h = hs.length - 1, max = 0;
        while ( l < h ) {
            max = Math.max(max, Math.min(hs[l], hs[h]) * (h - l) );
            if ( hs[l] < hs[h] ) l++;
            else h--;
        }
        return max;
    }
}
