package mx.grekz.leetcode.easy;

import mx.grekz.leetcode.helpers.TreeNode;

public class E112_PathSum {
    public boolean hasPathSum(TreeNode r, int s) {
        if ( r == null ) return false;
        return ( s-r.val == 0 && r.left == null && r.right == null ) || hasPathSum(r.left, s-r.val) || hasPathSum(r.right, s-r.val); 
    }
}
