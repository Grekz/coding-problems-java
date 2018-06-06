package mx.grekz.leetcode.easy;

import mx.grekz.leetcode.helpers.TreeNode;
/**
 * @author grekz
 */
public class E530_MinimumAbsoluteDifferenceinBST {

    int minDiff = 2147483647;
    TreeNode prev;
    public int getMinimumDifference(TreeNode root) {
        minDiff = 2147483647;
        prev = null;
        doit(root);
        return minDiff;
    }
    private void doit(TreeNode root) {
        if (root == null) return;
        doit(root.left);
        if (prev != null) minDiff = Math.min(minDiff, root.val - prev.val);
        prev = root;
        doit(root.right);
    }
}