package mx.grekz.leetcode.easy;

import mx.grekz.leetcode.helpers.TreeNode;

public class E108_ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if ( nums.length == 0 ) { return null; }
        return helper(nums, 0, nums.length-1);
    }
    private TreeNode helper( int[] nums, int l, int h ){
        if ( l > h ) { return null; }
        int m = l + ( h - l ) / 2;
        TreeNode res = new TreeNode(nums[m]);
        res.left = helper(nums, l, m-1);
        res.right = helper(nums, m+1, h);
        return res;
    }

}
