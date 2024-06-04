package NeetCode;

import ProblemSolving.BFS.TreeNode;

public class InvertBinaryTree {
    public TreeNode invertBinaryTree(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertBinaryTree(root.left);
        invertBinaryTree(root.right);

        return root;
    }
}
