package leetcode.easy;

import others.structure.TreeNode;

/**
 * Created by dss886 on 2016/3/4.
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class No104 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
    }
}
