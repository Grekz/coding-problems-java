package mx.grekz.leetcode.easy;

import mx.grekz.leetcode.helpers.TreeNode;

/**
 * @author grekz
 */
public class E235_LowestCommonAncestorofaBinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode r, TreeNode p, TreeNode q) {
        if( r.val > p.val && r.val > q.val ) return lowestCommonAncestor(r.left, p, q);
        else if( r.val < p.val && r.val < q.val ) return lowestCommonAncestor(r.right, p, q);
        return r;
    }
}