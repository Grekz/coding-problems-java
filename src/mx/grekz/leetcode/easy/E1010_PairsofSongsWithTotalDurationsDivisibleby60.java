package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E1010_PairsofSongsWithTotalDurationsDivisibleby60 {
    public int numPairsDivisibleBy60(int[] time) {
        int res = 0, cnt[] = new int[60];
        for ( int x : time ) {
            int d = (60 - x % 60) % 60;
            res += cnt[d];
            cnt[x % 60] += 1;
        }
        return res;
    }
}