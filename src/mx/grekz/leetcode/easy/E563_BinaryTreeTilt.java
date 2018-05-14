package mx.grekz.leetcode.easy;

import mx.grekz.leetcode.helpers.*;
/**
 * @author grekz
 */
public class E563_BinaryTreeTilt {

    int sum;
    public int findTilt(TreeNode root) {
        sum = 0;
        doit(root);
        return sum;
    }
    private int doit(TreeNode n) {
        if ( n == null ) return 0;
        int left = doit(n.left), right = doit(n.right);
        sum += Math.abs(left-right);
        return n.val + left + right;
    }
}