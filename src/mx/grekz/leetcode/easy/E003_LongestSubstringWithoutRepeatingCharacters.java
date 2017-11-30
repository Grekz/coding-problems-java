package mx.grekz.leetcode.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 * @author grekz
 *
 */
public class E003_LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() < 1)
			return 0;
		char[] cArr = s.toCharArray();
		int dict[] = new int[256], sum = 0, prev = 0, i, len = cArr.length;
		Arrays.fill(dict, -1);
		for (i = 0; i < len; i++) {
			int c = cArr[i];
			if (dict[c] >= prev) {
				sum = Math.max(i - prev, sum);
				prev = dict[c] + 1;
			}
			dict[c] = i;
		}
		return Math.max(i - prev, sum);
	}
}
