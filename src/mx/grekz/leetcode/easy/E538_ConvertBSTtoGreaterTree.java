package mx.grekz.leetcode.easy;

import mx.grekz.leetcode.helpers.TreeNode;

/**
 * @author grekz
 */
public class E538_ConvertBSTtoGreaterTree {

    int cur = 0;
    public TreeNode convertBST(TreeNode root) {
        cur = 0;
        go(root);
        return root;
    }
    private void go(TreeNode node) {
        if ( node == null ) return;
        go(node.right);
        node.val += cur;
        cur = node.val;
        go(node.left);
    }
}