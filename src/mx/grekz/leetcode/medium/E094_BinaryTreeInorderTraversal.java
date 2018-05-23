package mx.grekz.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

import mx.grekz.leetcode.helpers.TreeNode;

/**
 * @author grekz
 */
public class E094_BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        doit(root, res);
        return res;
    }
    private void doit(TreeNode n, List<Integer> res) {
        if ( n != null ) {
            doit(n.left,res);
            res.add(n.val);
            doit(n.right,res);
        }
    }
}