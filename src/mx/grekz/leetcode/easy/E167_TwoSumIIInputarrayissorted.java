package mx.grekz.leetcode.easy;

public class E167_TwoSumIIInputarrayissorted {
    public int[] twoSum(int[] nums, int target) {
        int j = nums.length - 1, i = 0;
        while(i < j){
            int sum = nums[j] + nums[i];
            if (sum < target) i++;
            else if(sum > target) j--;
            else break;
        }
        return new int[]{i+1,j+1};
    }
}
