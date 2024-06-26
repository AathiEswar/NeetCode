package NeetCode;

import ProblemSolving.BFS.TreeNode;

public class StringBinary {
    public String tree2str(TreeNode root) {
        if (root == null) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        dfs(root, result);

        return result.toString();
    }

    public void dfs(TreeNode node , StringBuilder result){
        if(node == null){
            return ;
        }

        result.append(node.val);

        if(node.left != null || node.right != null){
            result.append("(");
            dfs(node.left , result);
            result.append(")");
        }

        if(node.right != null){
            result.append("(");
            dfs(node.right , result);
            result.append(")");
        }
    }
}
