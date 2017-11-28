package mx.grekz.leetcode.easy;

import mx.grekz.leetcode.helpers.TreeNode;

public class E606_ConstructStringFromBinaryTree {
	/**
	 * https://leetcode.com/problems/construct-string-from-binary-tree/description/
	 */
    public String tree2str(TreeNode t) {
        if ( t == null ) return "";
        if ( t.left == t.right ) return t.val + "";
        if ( t.left == null && t.right != null ) return t.val + "()("+tree2str(t.right)+")";
        if ( t.left != null && t.right == null ) return t.val + "("+tree2str(t.left)+")";
        return t.val + "("+tree2str(t.left)+")("+tree2str(t.right)+")";
    }

}
