package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E704_BinarySearch {
    public int search(int[] nums, int target) {
        return bSearch(nums, target, 0, nums.length - 1);
    }

    private int bSearch(int[] nums, int target, int ini, int end) {
        if (ini > end)
            return -1;
        int mid = ini + (end - ini) / 2;
        if (nums[mid] == target)
            return mid;
        if (nums[mid] > target)
            return bSearch(nums, target, ini, mid - 1);
        return bSearch(nums, target, mid + 1, end);
    }
}