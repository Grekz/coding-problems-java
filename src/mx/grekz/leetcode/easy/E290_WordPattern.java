package mx.grekz.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author grekz
 */
public class E290_WordPattern {

	public boolean wordPattern(String a, String b) {
		if (a == null || b == null)
			return false;
		String arr[] = b.split(" ");
		if (a.length() != arr.length)
			return false;
		Map<Character, String> map = new HashMap<>();
		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			String s = arr[i];
			if (map.containsKey(c)) {
				if (!map.get(c).equals(s))
					return false;
			} else {
				if (map.containsValue(s))
					return false;
				map.put(c, s);
			}
		}
		return true;
	}
}