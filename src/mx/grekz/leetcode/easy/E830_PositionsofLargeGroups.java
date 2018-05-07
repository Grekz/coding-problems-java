package mx.grekz.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author grekz
 */
public class E830_PositionsofLargeGroups {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> res = new ArrayList<>();
        S += "|";
        int ps = 0;
        int n = S.length();
        for (int i = 0; i < n; i++ ) {
            if ( S.charAt(i) != S.charAt(ps) ) {
                if ( i - ps > 2 ) {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(ps);
                    tmp.add(i-1);
                    res.add(tmp);
                }
                ps = i;
            }
        }
        return res;
    }
}