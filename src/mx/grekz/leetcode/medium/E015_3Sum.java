package mx.grekz.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E015_3Sum {
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<>();
		int n = nums.length;
		for (int i = 0; i < n - 2; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				int l = i + 1, h = n - 1, x = nums[i];
				while (l < h) {
					if (x + nums[l] + nums[h] == 0) {
						res.add(Arrays.asList(x, nums[l], nums[h]));
						while (l < h && nums[l] == nums[l + 1])
							l++;
						while (l < h && nums[h] == nums[h - 1])
							h--;
						l++;
						h--;
					} else if (x + nums[l] + nums[h] < 0) {
						l++;
					} else {
						h--;
					}
				}
			}
		}
		return res;
	}
}
