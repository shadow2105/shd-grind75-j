package binarytree;

public class InvertBinaryTree {

    // Depth First Search (Recursion) - Time Complexity: O(n) ; Space Complexity: O(h) ,
    // 'h' is the height of the binary tree. In worst case, 'h' equals 'n' for an unbalanced (completely skewed) binary tree.
    // LeetCode - Runtime: 0 ms ; Memory : 39.8 MB
    public static TreeNode solution(TreeNode root) {
        return invertTree(root);
    }
    public static TreeNode invertTree(TreeNode node) {
        if (node != null) {
            TreeNode tempNode = node.right;
            node.right = invertTree(node.left);
            node.left = invertTree(tempNode);
        }
        return node;
    }
}
