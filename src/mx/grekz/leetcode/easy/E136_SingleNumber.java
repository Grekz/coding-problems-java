package mx.grekz.leetcode.easy;

public class E136_SingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int x : nums)
            res ^= x;
        return res;
    }

}
