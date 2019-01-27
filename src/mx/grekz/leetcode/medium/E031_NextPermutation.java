package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E031_NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length - 1;
        int i = n - 1, j = n;
        while (i >= 0 && nums[i] >= nums[i + 1])
            i--;
        if (i >= 0) {
            while (j >= 0 && nums[j--] <= nums[i])
                ;
            swap(nums, i, j + 1);
        }
        while (i < n)
            swap(nums, ++i, n--);
    }

    private void swap(int[] a, int i, int j) {
        int c = a[i];
        a[i] = a[j];
        a[j] = c;
    }
}