package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E287_FindtheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        if (nums == null || nums.length < 2 ) return -1;
        int res = 0, fast = 0;
        do{
            res = nums[res];
            fast = nums[nums[fast]];
        }while( res != fast );
        fast = 0;
        do{
            res = nums[res];
            fast = nums[fast];
        }while( res != fast );
        return res;
    }
}