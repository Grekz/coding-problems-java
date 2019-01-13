package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E938_RangeSumofBST {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null)
            return 0;
        int res = 0;
        if (L <= root.val && root.val <= R)
            res += root.val;
        if (L <= root.val)
            res += rangeSumBST(root.left, L, R);
        if (R >= root.val)
            res += rangeSumBST(root.right, L, R);
        return res;
    }
}