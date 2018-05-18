package mx.grekz.leetcode.easy;

import mx.grekz.leetcode.helpers.TreeNode;

/**
 * @author grekz
 */
public class E543_DiameterofBinaryTree {
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        res = 0;
        doit(root);
        return res;
    }
    
    private int doit(TreeNode n) {
        if (n == null) return 0;
        int le = doit(n.left);
        int ri = doit(n.right);
        res = Math.max(res, le + ri);
        return Math.max(le, ri) + 1;   
    }
}