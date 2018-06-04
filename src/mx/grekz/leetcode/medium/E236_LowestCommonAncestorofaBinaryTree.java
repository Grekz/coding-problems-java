package mx.grekz.leetcode.medium;

import mx.grekz.leetcode.helpers.TreeNode;

/**
 * @author grekz
 */
public class E236_LowestCommonAncestorofaBinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode r, TreeNode p, TreeNode q) {
        if (r == null) return null;
        if (r == p || r == q ) return r;
        TreeNode l = lowestCommonAncestor(r.left, p, q), ri = lowestCommonAncestor(r.right, p, q);
        if (l != null && ri != null ) return r;
        return l != null ? l : ri;
    }
}