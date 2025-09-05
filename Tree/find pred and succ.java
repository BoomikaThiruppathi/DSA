import java.util.*;

public class Main {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    static Node buildTree(int[] arr, int index) {
        if (index >= arr.length) return null;

        Node node = new Node(arr[index]);
        node.left = buildTree(arr, 2 * index + 1);
        node.right = buildTree(arr, 2 * index + 2);
        return node;
    }

    static void inorder(Node root, List<Integer> inorderList) {
        if (root == null) return;
        inorder(root.left, inorderList);
        inorderList.add(root.val);
        inorder(root.right, inorderList);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Node root = buildTree(arr, 0);

        List<Integer> inorderList = new ArrayList<>();
        inorder(root, inorderList);

        for (int val : arr) {
            int index = inorderList.indexOf(val);
            int pred = (index > 0) ? inorderList.get(index - 1) : 0;
            int succ = (index < inorderList.size() - 1) ? inorderList.get(index + 1) : 0;

            System.out.println(val + " : " + pred + "," + succ);
        }
    }
}
