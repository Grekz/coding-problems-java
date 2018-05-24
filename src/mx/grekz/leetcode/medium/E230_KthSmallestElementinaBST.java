package mx.grekz.leetcode.medium;

import mx.grekz.leetcode.helpers.TreeNode;

/**
 * @author grekz
 */
public class E230_KthSmallestElementinaBST {
    public int kthSmallest(TreeNode root, int k) {
        int count = countit(root.left) + 1;
        if ( k == count )
            return root.val;
        if ( k > count )
            return kthSmallest(root.right, k - count);
        return kthSmallest(root.left, k);
    }
    private int countit(TreeNode n) {
        if ( n == null ) return 0;
        return 1 + countit(n.left) + countit(n.right);
    }
}