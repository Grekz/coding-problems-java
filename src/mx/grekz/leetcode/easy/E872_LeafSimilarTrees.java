package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E872_LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return dfs(root1).equals(dfs(root2));
    }

    private String dfs(TreeNode node) {
        return node == null ? "" : dfs(node.left) + dfs(node.right) + (node.right == node.left ? node.val : "");
    }
}