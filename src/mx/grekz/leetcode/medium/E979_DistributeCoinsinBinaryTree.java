package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E979_DistributeCoinsinBinaryTree {
    int res = 0;
    public int distributeCoins(TreeNode root) {
        res = 0;
        dfs(root);
        return res;
    }
    private int dfs(TreeNode n) {
        if ( n == null )
            return 0;
        int l = dfs(n.left), r = dfs(n.right);
        res += Math.abs(l) + Math.abs(r);
        return r + l + n.val + -1;
    }
}