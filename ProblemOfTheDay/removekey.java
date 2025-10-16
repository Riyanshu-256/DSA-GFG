package ProblemOfTheDay;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class removekey {

    Node removekeys(Node root, int l, int r) {
        // Base case
        if (root == null)
            return null;

        // Recursively fix the left and right subtrees
        root.left = removekeys(root.left, l, r);
        root.right = removekeys(root.right, l, r);

        // If root’s data is less than l, then its right subtree may have nodes in range
        if (root.data < l)
            return root.right;

        // If root’s data is greater than r, then its left subtree may have nodes in range
        if (root.data > r)
            return root.left;

        // Else root is in range
        return root;
    }

    // Optional: for testing
    void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        removekey obj = new removekey();

        Node root = new Node(6);
        root.left = new Node(-13);
        root.right = new Node(14);
        root.left.right = new Node(-8);
        root.right.left = new Node(13);
        root.right.right = new Node(15);
        root.right.left.left = new Node(7);

        int l = -10, r = 13;
        root = obj.removekeys(root, l, r);

        System.out.println("Inorder traversal of modified BST:");
        obj.inorder(root);
    }
}