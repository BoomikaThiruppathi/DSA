import java.util.*;

public class Main {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

  
    static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }
        return root;
    }

    
    static boolean isIdentical(Node root1, Node root2) {
        // Case 1: Both are empty
        if (root1 == null && root2 == null) {
            return true;
        }

        // Case 2: One is empty
        if (root1 == null || root2 == null) {
            return false;
        }

        // Case 3: Values must match + subtrees must be identical
        return (root1.data == root2.data)
                && isIdentical(root1.left, root2.left)
                && isIdentical(root1.right, root2.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first tree
        int n1 = sc.nextInt();
        Node root1 = null;
        for (int i = 0; i < n1; i++) {
            int val = sc.nextInt();
            root1 = insert(root1, val);
        }

        // Input second tree
        int n2 = sc.nextInt();
        Node root2 = null;
        for (int i = 0; i < n2; i++) {
            int val = sc.nextInt();
            root2 = insert(root2, val);
        }

        // Check identical
        if (isIdentical(root1, root2)) {
            System.out.println("The trees are identical.");
        } else {
            System.out.println("The trees are not identical.");
        }
    }
}
