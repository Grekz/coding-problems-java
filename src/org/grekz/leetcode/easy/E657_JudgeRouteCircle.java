package org.grekz.leetcode.easy;

/**
 * https://leetcode.com/problems/judge-route-circle/description/
 * @author grekz
 *
 */
public class E657_JudgeRouteCircle {
	/**
	 * Logic: 
	 * - the steps should be an even number.
	 * - if goes down the same time it goes down, it should be in y = 0
	 * - if goes left the same time it goes right, it should be in x = 0
	 * 
	 */
    public boolean judgeCircle(String moves) {
        if ( moves == null || moves.length() % 2 != 0 ) return false;
        int x = 0, y = 0;
        for ( char c : moves.toCharArray() )
            switch (c) {
                case 'U' : y++; break;
                case 'D' : y--; break;
                case 'R' : x++; break;
                case 'L' : x--; break;
            }
        return x == 0 && y == 0;
    }
}
