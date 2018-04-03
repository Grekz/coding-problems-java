package mx.grekz.leetcode.easy;

import mx.grekz.leetcode.helpers.TreeNode;

/**
 * @author grekz
 */
public class E404_SumofLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null || ( root.left == null && root.right == null ) ) return 0;
        
        int ans = 0;
        if(root.left != null && root.left.left == null && root.left.right == null) 
            ans += root.left.val;
        return ans + sumOfLeftLeaves(root.right) + sumOfLeftLeaves(root.left);        
    }
}