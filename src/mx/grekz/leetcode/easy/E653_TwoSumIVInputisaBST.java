package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E653_TwoSumIVInputisaBST {
    public boolean findTarget(TreeNode root, int k) {
        java.util.Set<Integer> set = new java.util.HashSet<>();
        return dfs(root, k, set);
    }

    private boolean dfs(TreeNode root, int k, java.util.Set<Integer> set) {
        if (root == null)
            return false;
        if (set.contains(k - root.val))
            return true;
        set.add(root.val);
        return dfs(root.left, k, set) || dfs(root.right, k, set);
    }
}