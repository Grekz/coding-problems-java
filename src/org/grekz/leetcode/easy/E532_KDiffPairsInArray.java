package org.grekz.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class E532_KDiffPairsInArray {
	/*
	 * Inputs:
	 * nums = [3,1,4,1,5]
	 * k = 2
	 * ---
	 * [3,1,4,1,5]
	 * 2
 	 * ----
	 * [4,6,3,7,4,1,5]
	 * 1
 	 * ----
	 * [3,3,1,4,4,1,5,5]
 	 * 0
 	 * ----
 	 * [1]
	 * 4
 	 * ----
	 * 
	 * Results:
	 * 2
	 * ----
	 * 4
	 * ----
	 * 4
	 * ----
	 * 0
	 * */
    public int findPairs(int[] nums, int k) {
        if ( k < 0 || nums == null || nums.length == 0 ) return 0;
        int res = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for(int x : nums){
            int t = m.getOrDefault(x, 0);
            m.put( x, t + 1 );
        }
        for(Entry<Integer, Integer> e : m.entrySet()){
        	if ( ( k == 0 && e.getValue() > 1 ) || ( m.containsKey( e.getKey() + k ) ) )
        		res++;        		
        }
        return res;        
    }
}
