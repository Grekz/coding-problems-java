package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E034_FindFirstandLastPositionofElementinSortedArray {

    public int[] searchRange(int[] nums, int target) {
        int idx = bSearch(nums, target, true);
        if (nums.length < 1 || nums[idx % nums.length] != target)
            return new int[] { -1, -1 };
        int rIdx = bSearch(nums, target, false) - 1;
        return new int[] { idx, rIdx };
    }

    private int bSearch(int[] n, int t, boolean left) {
        int a = 0, b = n.length, m;
        while (a < b) {
            m = a + (b - a) / 2;
            if (n[m] > t || (left && n[m] == t))
                b = m;
            else
                a = m + 1;
        }
        return a;
    }
}