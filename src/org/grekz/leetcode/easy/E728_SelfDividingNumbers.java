package org.grekz.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class E728_SelfDividingNumbers {
	/**
	 * https://leetcode.com/problems/self-dividing-numbers/description/
	 */
	public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for ( int i = left; i <= right; i++ ) {
            int j = i;
            while ( j > 0 ) {
                int t = j % 10;
                if ( t == 0 || i % t != 0 ) break;
                j /= 10;
            }
            if ( j == 0 ) 
                res.add(i);
        }
        return res;
    }
}
