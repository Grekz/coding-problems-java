package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E1022_SumofRootToLeafBinaryNumbers {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }
    private int dfs(TreeNode root, int c) {
        if ( root == null ) return 0;
        c = c * 2 + root.val;
        if ( root.left == null && root.right == null )
            return c;
        return dfs(root.left, c) + dfs(root.right, c);
    }
}