package NeetCode;

import ProblemSolving.BFS.TreeNode;

public class MergeBinaryTrees {
    public TreeNode mergeBinaryTree(TreeNode root1 ,TreeNode root2){
        if(root1 == null)  return root2;
        if(root2 == null) return root1;

        root1.val += root2.val;

        root1.left = mergeBinaryTree(root1.left, root2.left);
        root1.right = mergeBinaryTree(root1.right , root2.right);


        return root1;
    }
}
