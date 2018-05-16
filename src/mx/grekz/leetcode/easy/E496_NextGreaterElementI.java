package mx.grekz.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author grekz
 */
public class E496_NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> m = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        for( int x : nums2 ) {
            while ( !s.isEmpty() && s.peek() < x )
                m.put(s.pop(), x);
            s.push(x);
        }
        for ( int i = 0; i < nums1.length; i++ ) {
            nums1[i] = m.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }
}