package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E700_SearchinaBinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null)
            return null;
        if (root.val == val)
            return root;
        return searchBST(val < root.val ? root.left : root.right, val);
    }
}