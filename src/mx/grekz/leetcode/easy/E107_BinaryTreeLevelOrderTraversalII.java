package mx.grekz.leetcode.easy;

import java.util.List;
import java.util.ArrayList;
import mx.grekz.leetcode.helpers.*;
public class E107_BinaryTreeLevelOrderTraversalII {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(res, 0, root);
        return res;
    }
    private void dfs(List<List<Integer>> res, int lvl, TreeNode root) {
        if ( root == null ) { return; }
        int le = res.size();
        lvl += 1;
        if ( le < lvl ) {
            res.add(0, new ArrayList<Integer>());
            le+=1;
        }
        res.get(le - lvl).add(root.val);
        dfs(res, lvl, root.left);
        dfs(res, lvl, root.right);
    }
}
