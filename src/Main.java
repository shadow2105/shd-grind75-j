import binarytree.InvertBinaryTree;
import binarytree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        System.out.println("InvertBinaryTree");

        TreeNode nodeL21 = new TreeNode(1);
        TreeNode nodeL22 = new TreeNode(3);
        TreeNode node11 = new TreeNode(2, nodeL21, nodeL22);
        TreeNode nodeL23 = new TreeNode(6);
        TreeNode nodeL24 = new TreeNode(9);
        TreeNode node22 = new TreeNode(7, nodeL23, nodeL24);
        TreeNode root = new TreeNode(4, node11, node22);

        printTree(root);

        printTree(InvertBinaryTree.solution(root));
    }

    // Level Order Traversal (Breadth First Search)
    public static void printTree(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<>();

        if(root == null) {
            return;
        }

        queue.add(root);
        TreeNode currentNode;
        while(!queue.isEmpty()) {
            currentNode = queue.remove();
            System.out.print(currentNode.getVal() + " ");

            if(currentNode.getLeft() != null) {
                queue.add(currentNode.getLeft());
            }

            if(currentNode.getRight() != null) {
                queue.add(currentNode.getRight());
            }
        }
        System.out.println();
    }
}