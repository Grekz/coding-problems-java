package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E951_FlipEquivalentBinaryTrees {
    public boolean flipEquiv(TreeNode a, TreeNode b) {
        return a == null || b == null ? a == b
                : a.val == b.val && (flipEquiv(a.left, b.left) && flipEquiv(a.right, b.right)
                        || flipEquiv(a.right, b.left) && flipEquiv(a.left, b.right));
    }
}