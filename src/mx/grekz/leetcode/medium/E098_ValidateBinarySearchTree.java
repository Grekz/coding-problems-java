package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E098_ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        return root == null || dfs(root, Long.MAX_VALUE, Long.MIN_VALUE); 
    }
    private boolean dfs(TreeNode root, long max, long min) {
        return root == null || !(root.val >= max || root.val <= min) && dfs(root.left, root.val, min) && dfs(root.right, max, root.val);
    }
}