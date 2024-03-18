package dsa_foundation_live.tree;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {

    public List<Integer> postOrderTraversal(TreeNode root){
        List<Integer> resArr = new ArrayList<>();
        postOrderHelper(root, resArr);
        return resArr;
    }

    public void postOrderHelper(TreeNode root, List<Integer> resArr){

        if (root == null)
            return;
        postOrderHelper(root.left, resArr);
        postOrderHelper(root.right, resArr);
        resArr.add(root.val);
    }
}
