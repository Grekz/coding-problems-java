package mx.grekz.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class E017_LetterCombinationsofaPhoneNumber {
	private final String[] cArr = new String[] { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public List<String> letterCombinations(String digits) {
		List<String> res = new ArrayList<String>();
		if (digits.length() < 1 || digits.indexOf("0") > -1 || digits.indexOf("1") > -1)
			return res;
		res.add("");
		for (char c : digits.toCharArray()) {
			List<String> tmp = new ArrayList<>();
			for (char x : cArr[c - '0'].toCharArray())
				for (String y : res)
					tmp.add(y + x);
			res = tmp;
		}
		return res;
	}
}
