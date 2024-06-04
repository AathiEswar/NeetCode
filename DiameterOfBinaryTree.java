package NeetCode;

import ProblemSolving.BFS.TreeNode;

public class DiameterOfBinaryTree {

    int sum = 0;
    public int diameterOfBinaryTree(TreeNode root){

        helper(root);
        return sum;
    }

    private int helper(TreeNode root) {
        if(root == null) return 0;

        int left = helper(root.left);
        int right = helper(root.right);

        sum = Math.max(sum , left+right);

        return 1 + Math.max(left  , right);
    }
}
