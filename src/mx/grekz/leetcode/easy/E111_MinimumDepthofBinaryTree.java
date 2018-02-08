package mx.grekz.leetcode.easy;

import mx.grekz.leetcode.helpers.TreeNode;

public class E111_MinimumDepthofBinaryTree {

    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        return drill(root, 1);
    }
    
    private int drill(TreeNode walk, int lvl){
        if(walk == null) return Integer.MAX_VALUE;
        if(walk.left == null && walk.right == null) return lvl;
        return Math.min(drill(walk.left, lvl+1), drill(walk.right, lvl+1));
    }
}
