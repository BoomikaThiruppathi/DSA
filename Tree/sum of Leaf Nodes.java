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

    static Node insert(Node root, int value) {
        if (root == null) return new Node(value);

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();

            if (temp.left == null) {
                temp.left = new Node(value);
                break;
            } else q.add(temp.left);

            if (temp.right == null) {
                temp.right = new Node(value);
                break;
            } else q.add(temp.right);
        }
        return root;
    }

    static int sumOfLeaves(Node root) {
        if (root == null) return 0;

        // leaf node condition
        if (root.left == null && root.right == null)
            return root.data;

        return sumOfLeaves(root.left) + sumOfLeaves(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;

       
        int n = sc.nextInt();

       
        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        System.out.println("Sum of Leaf Nodes: " + sumOfLeaves(root));
    }
}
