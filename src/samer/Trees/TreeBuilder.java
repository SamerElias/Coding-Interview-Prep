package samer.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeBuilder {

    public static TreeNode buildTree(Integer[] tree) {
        if(tree.length == 0) return null;
        TreeNode root = new TreeNode(tree[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        for(int i = 1; i < tree.length; i++) {
            TreeNode node = q.peek();
            if(node.left == null) {
                node.left = new TreeNode(tree[i]);
                if(tree[i] != null) q.add(node.left);
            } else if (node.right == null) {
                node.right = new TreeNode(tree[i]);
                if(tree[i] != null) q.add(node.right);
                q.remove();
            }
        }
        return root;
    }

}
