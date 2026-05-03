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

    // 🔹 Insert nodes level-wise
    static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();

            if (temp.left == null) {
                temp.left = new Node(value);
                break;
            } else {
                q.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = new Node(value);
                break;
            } else {
                q.add(temp.right);
            }
        }
        return root;
    }

    // 🌳 Check mirror
    static boolean isMirror(Node left, Node right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;

        return (left.data == right.data)
                && isMirror(left.left, right.right)
                && isMirror(left.right, right.left);
    }

    
    static boolean isSymmetric(Node root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;

        int n = sc.nextInt();

       
        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        System.out.println("Is Tree Symmetric? " + isSymmetric(root));
    }
}
