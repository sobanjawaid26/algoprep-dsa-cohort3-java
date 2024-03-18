package dsa_foundation_live.tree;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {

    public List<Integer> inOrderTraversal(TreeNode root){
        List<Integer> resArr = new ArrayList<>();
        inOrderHelper(root, resArr);
        return resArr;
    }

    public void inOrderHelper(TreeNode root, List<Integer> resArr){

        if (root == null)
            return;
        inOrderHelper(root.left, resArr);
        resArr.add(root.val);
        inOrderHelper(root.right, resArr);
    }
}
