package NeetCode;

import ProblemSolving.BFS.TreeNode;

public class CommonAncestor {
    public TreeNode commonAncestor (TreeNode root  ,int q , int p){
        if(root == null) return null;

        if(root.val == p || root.val == q) return root;

        TreeNode left = commonAncestor(root.left , q , p);
        TreeNode right  = commonAncestor(root.right , q , p);

        if(left != null && right != null) return root;

        return left==null ? right : left ;
    }
}
