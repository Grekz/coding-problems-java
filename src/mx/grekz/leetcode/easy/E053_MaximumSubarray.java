package mx.grekz.leetcode.easy;

public class E053_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int res, cur;
        cur = res = nums[0];
        for (int i = 1; i < nums.length; i++){
            cur = Math.max(cur+nums[i], nums[i]);
            res = Math.max(cur,res);
        }
        return res;
    }
}
