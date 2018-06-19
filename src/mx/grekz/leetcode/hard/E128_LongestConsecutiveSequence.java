package mx.grekz.leetcode.hard;

/**
 * @author grekz
 */
public class E128_LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        int res = 0;
        java.util.Set<Integer> s = new java.util.HashSet<>();
        for ( int x : nums ) s.add(x);
        for ( int x : nums )
            if ( !s.contains(x - 1) ) {
                int y = x + 1;
                while ( s.contains(y)) y++;                    
                res = Math.max(res, y - x);
            }
        return res;
    }
}