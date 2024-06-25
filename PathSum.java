package NeetCode;

import ProblemSolving.BFS.TreeNode;

public class PathSum {
    public boolean pathSum(TreeNode root,int target){
        // base case
        if(root == null)return false;

        // decrment with the root value
        target-= root.val;

        // the target must be 0 at the leaf node
        if(target == 0 && root.left == null && root.right == null) return true;

        return pathSum(root.left , target )|| pathSum(root.right , target);
    }
}
