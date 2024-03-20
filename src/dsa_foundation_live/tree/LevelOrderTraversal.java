package dsa_foundation_live.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    public List<List<Integer>> levelOrderTraversal(TreeNode root){

        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList();
        if(root == null)
            return wrapList;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i = 1; i < size; i++){
                TreeNode t = (TreeNode) queue.remove();

                if (queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if(queue.peek().right != null)
                    queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            wrapList.add(subList);
        }
        return wrapList;
    }
}
