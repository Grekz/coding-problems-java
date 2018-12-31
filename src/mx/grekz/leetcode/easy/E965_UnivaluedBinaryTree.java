package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E965_UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null)
            return true;
        if (root.left != null && root.left.val != root.val || !isUnivalTree(root.left))
            return false;
        if (root.right != null && root.right.val != root.val || !isUnivalTree(root.right))
            return false;
        return true;
    }
}