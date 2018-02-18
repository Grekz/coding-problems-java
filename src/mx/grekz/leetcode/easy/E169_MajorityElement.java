package mx.grekz.leetcode.easy;

public class E169_MajorityElement {

    public int majorityElement(int[] nums) {
        if(nums == null || nums.length == 0 ) return -1;
        if(nums.length == 1 || nums.length == 2) return nums[0];
        int result = 0, count = 0;
        for(int x : nums){
            if(count == 0) result = x;
            if(x == result) count++;
            else count--;
        }
        return result;
    }
}
