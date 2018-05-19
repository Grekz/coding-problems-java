package mx.grekz.leetcode.easy;

import mx.grekz.leetcode.helpers.TreeNode;

/**
 * @author grekz
 */
public class E572_SubtreeofAnotherTree {
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null) return false;
        return isSame(s,t) || isSubtree(s.left,t) || isSubtree(s.right,t);
    }
    private boolean isSame(TreeNode s, TreeNode t){
        if(s==null && t==null) return true;
        if(s==null || t==null) return false;
        return s.val==t.val && isSame(s.left,t.left) && isSame(s.right,t.right);
    }
}