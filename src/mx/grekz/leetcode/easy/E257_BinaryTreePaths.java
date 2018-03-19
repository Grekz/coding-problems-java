package mx.grekz.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

import mx.grekz.leetcode.helpers.TreeNode;

/**
 * @author grekz
 */
public class E257_BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root != null ) traverseTree(root, res, "");
        return res;
    }
    public void traverseTree(TreeNode node, List<String> list, String cur){
        if ( node.left == null && node.right == null ) list.add(cur + node.val);
        else{
            if ( node.left != null ) traverseTree(node.left,  list, cur + node.val + "->"  );
            if ( node.right != null )traverseTree(node.right, list, cur + node.val + "->" );
        }
    }
}