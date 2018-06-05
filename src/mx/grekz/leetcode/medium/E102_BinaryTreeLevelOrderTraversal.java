package mx.grekz.leetcode.medium;
import java.util.List;
import java.util.ArrayList;
import mx.grekz.leetcode.helpers.TreeNode;

/**
 * @author grekz
 */
public class E102_BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>(1);
        if(root == null) return result;
        addNodes(result, root, 0);
        return result;
    }
    public void addNodes(List<List<Integer>> res, TreeNode walk, int lvl){
        List<Integer> tmp;
        if(res.size() <= lvl){
            tmp = new ArrayList<>(1);
            res.add(tmp);
        }else{
            tmp = res.get(lvl);
        }
        tmp.add(walk.val);
        if(walk.left!= null)  addNodes(res,walk.left, lvl+1);
        if(walk.right!= null) addNodes(res,walk.right, lvl+1);
    }
}