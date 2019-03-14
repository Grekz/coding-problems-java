package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
// public class E303_RangeSumQueryImmutable {
public class NumArray {

    private int[] numsCache;
    public NumArray(int[] nums) {
        if (nums == null || nums.length < 1) return;
        this.numsCache = nums;
        int cur = nums[0];
        for(int i = 1; i < nums.length; i++){
            numsCache[i] = nums[i] + numsCache[ i - 1];
        }
    }

    public int sumRange(int i, int j) {
        if (numsCache == null || numsCache.length < 1 ) return 0;
        return numsCache[j] - (i == 0 ? 0 : numsCache[i-1]);
    }
    
    // Your NumArray object will be instantiated and called as such:
    // NumArray numArray = new NumArray(nums);
    // numArray.sumRange(0, 1);
    // numArray.sumRange(1, 2);
}