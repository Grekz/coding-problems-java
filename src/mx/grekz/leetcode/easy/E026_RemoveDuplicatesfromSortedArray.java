package mx.grekz.leetcode.easy;

public class E026_RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length < 1 ) return 0;
        if ( nums.length == 1 ) return 1;
        int len = nums.length, base = nums[0], count = 0,cur = 1;
        for(int i = 1; i < len ; i++ ){
            if ( base == nums[i] ) {
                count++;
                nums[i] = -1;
            }else{
                base = nums[i];
                nums[cur++] = nums[i];
            }
        }
        return len - count;
    }}
