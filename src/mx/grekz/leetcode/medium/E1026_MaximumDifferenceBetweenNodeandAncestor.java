package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E1026_MaximumDifferenceBetweenNodeandAncestor {
    public int maxAncestorDiff(TreeNode root) {
        return dfs(root, root.val, root.val);
    }
    private int dfs( TreeNode node, int max, int min ) {
        if ( node == null ) {
            return max - min;
        }
        max = Math.max(max, node.val);
        min = Math.min(min, node.val);
        int maxLeft = dfs(node.left, max, min);
        int maxRight = dfs(node.right, max, min);
        return Math.max(maxLeft, maxRight);
    }
}