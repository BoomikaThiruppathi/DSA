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

  
    static Node invertTree(Node root) {
        if (root == null) return null;

        Node temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);

        return root;
    }

    
    static void levelOrder(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.data + " ");

            if (temp.left != null) q.add(temp.left);
            if (temp.right != null) q.add(temp.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;

        
        int n = sc.nextInt();

        
        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        System.out.print("Original Tree (Level Order): ");
        levelOrder(root);

        root = invertTree(root);

        System.out.print("\nInverted Tree (Level Order): ");
        levelOrder(root);
    }
}
