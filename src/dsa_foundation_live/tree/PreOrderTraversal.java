package dsa_foundation_live.tree;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {

    public List<Integer> preOrderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        preHelper(root, res);
        return res;
    }

    private void preHelper(TreeNode root, List<Integer> res) {
        if(root == null)
            return;
        res.add(root.val);
        preHelper(root.left, res);
        preHelper(root.right, res);
    }

    public static void main(String[] args) {

    }
}
