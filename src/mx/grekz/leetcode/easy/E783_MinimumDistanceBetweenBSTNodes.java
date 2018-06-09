package mx.grekz.leetcode.easy;

import mx.grekz.leetcode.helpers.TreeNode;

/**
 * @author grekz
 */
public class E783_MinimumDistanceBetweenBSTNodes {

    int res = 2147483647, pre = -1;
    public int minDiffInBST(TreeNode root) {
        if (root == null)
            return res;
        minDiffInBST(root.left);
        if (pre > -1) 
            res = Math.min(res, root.val - pre);
        pre = root.val;
        minDiffInBST(root.right);
        return res;
    }
}