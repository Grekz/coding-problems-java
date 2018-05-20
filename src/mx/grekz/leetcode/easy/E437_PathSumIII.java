package mx.grekz.leetcode.easy;
import mx.grekz.leetcode.helpers.TreeNode;
/**
 * @author grekz
 */
public class E437_PathSumIII {
    public int pathSum(TreeNode root, int sum) {
        if ( root == null ) return 0;
        return doit(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    private int doit(TreeNode n, int s) {
        if ( n == null ) return 0;
        return doit(n.left, s - n.val) + doit(n.right, s - n.val) + ( s == n.val ? 1 : 0 );
    }
}