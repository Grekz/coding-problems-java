package mx.grekz.leetcode.easy;

import mx.grekz.leetcode.helpers.TreeNode;

public class E100_SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){ return true; }
        if(p == null || q == null){ return false; }
        if(p.val == q.val) { return isSameTree(p.right, q.right) && isSameTree(p.left, q.left); }
        return false;
    }
}
