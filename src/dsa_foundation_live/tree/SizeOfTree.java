package dsa_foundation_live.tree;

public class SizeOfTree {

    public int sizeOfTree(TreeNode root){

        if(root == null)
            return 0;

        int leftCount = sizeOfTree(root.left);
        int rightCount = sizeOfTree(root.right);

        return leftCount + rightCount + 1;
    }
}
