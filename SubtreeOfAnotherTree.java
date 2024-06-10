package NeetCode;

import ProblemSolving.BFS.TreeNode;

public class SubtreeOfAnotherTree {
    public static boolean subTreeOfAnotherTree(TreeNode root , TreeNode subRoot){
       if(subRoot == null) return true;
       if(root == null) return false;

      if(isSameTree(root , subRoot)) return true;

       return subTreeOfAnotherTree(root.left , subRoot ) || subTreeOfAnotherTree(root.right , subRoot);
    }

    public static boolean isSameTree(TreeNode root , TreeNode subRoot){
        if(root == null && subRoot == null) return true;

        if(root != null && subRoot != null && root.val == subRoot.val) {
            return isSameTree(root.left , subRoot.left ) && isSameTree(root.right , subRoot.right) ;
        }

        return false;
    }
}
