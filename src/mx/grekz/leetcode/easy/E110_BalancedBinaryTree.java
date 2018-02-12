package mx.grekz.leetcode.easy;

import mx.grekz.leetcode.helpers.*;

public class E110_BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return dfs(root) != -1;
    }
    private int dfs(TreeNode root){
        if ( root == null ) { return 0; }
        int lh = dfs(root.left);
        if ( lh == -1 ) { return lh; }
        int rh = dfs(root.right);
        if ( rh == -1 ) { return rh; }
        int dif = lh - rh;
        if ( dif > 1 || dif < -1 ) { return -1; }
        return Math.max(lh, rh) + 1 ;
    }

}
