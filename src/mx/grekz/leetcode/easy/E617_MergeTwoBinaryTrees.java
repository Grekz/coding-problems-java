package mx.grekz.leetcode.easy;

import mx.grekz.leetcode.helpers.TreeNode;

/**
 * @author grekz
 */
public class E617_MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if ( t1 == null ) {
            return t2;
        }
        if ( t2 == null ) {
            return t1;
        }
        TreeNode cur = new TreeNode(t1.val + t2.val);
        cur.left = mergeTrees(t1.left, t2.left);
        cur.right = mergeTrees(t1.right, t2.right);
        return cur;
    }
}