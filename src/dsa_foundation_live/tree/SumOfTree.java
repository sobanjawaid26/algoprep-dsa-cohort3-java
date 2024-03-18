package dsa_foundation_live.tree;

public class SumOfTree {

    public int sumOfTree(TreeNode root){
        if(root == null)
            return 0;
        int sumLeft = sumOfTree(root.left);
        int sumRight = sumOfTree(root.right);
        return sumLeft + sumRight + root.val;
    }
}
