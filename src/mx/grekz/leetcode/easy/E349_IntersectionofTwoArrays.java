package mx.grekz.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author grekz
 */
public class E349_IntersectionofTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null || nums1.length < 1  || nums2.length < 1 ) return new int[]{};
        Set<Integer> set = new HashSet<>(), result = new HashSet<Integer>();
        for(int x : nums1) set.add(x);
        for(int y : nums2) if (set.contains(y)) result.add(y);
        int res[] = new int[result.size()], i = 0;
        for(int j : result) res[i++] = j;
        return res;
    }
}