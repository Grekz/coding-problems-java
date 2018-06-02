package mx.grekz.leetcode.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import mx.grekz.leetcode.helpers.TreeNode;

/**
 * @author grekz
 */
public class E654_MaximumBinaryTree {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        List<Integer> ar = Arrays.stream( nums ).boxed().collect( Collectors.toList() );
        return getMaxTree(ar);
    }
    private TreeNode getMaxTree(List<Integer> ar){
        if ( ar == null || ar.size() < 1 ) {
            return null;
        }
        int i = ar.indexOf(Collections.max(ar));
        TreeNode root = new TreeNode(ar.get(i));
        root.left = getMaxTree(ar.subList(0, i));
        root.right = getMaxTree(ar.subList(i+1, ar.size()));
        return root;
    }
}