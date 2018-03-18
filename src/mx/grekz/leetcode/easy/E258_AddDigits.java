package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E258_AddDigits {
	public int addDigits(int num) {
        if(num < 10) return num;
        return 1 + ( num - 1 ) % 9;
    }
}