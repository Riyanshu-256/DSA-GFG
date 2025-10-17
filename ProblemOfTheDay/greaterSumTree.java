package ProblemOfTheDay;

public class greaterSumTree {
    
    class Solution {
    // Helper variable to store running sum
    static int sum = 0;

    public static void transformTree(Node root) {
        sum = 0; // reset before starting
        convert(root);
    }

    // Recursive reverse inorder traversal
    static void convert(Node root) {
        if (root == null) return;

        // Traverse right subtree first
        convert(root.right);

        // Store the current node's data temporarily
        int temp = root.data;

        // Update current node's data to sum of greater nodes
        root.data = sum;

        // Update the running sum
        sum += temp;

        // Traverse left subtree
        convert(root.left);
    }
}
}
