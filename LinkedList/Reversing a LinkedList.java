import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 0) return;

        Node head = new Node(sc.nextInt());
        Node temp = head;

        for (int i = 1; i < n; i++) {
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
        }

        // Reverse the linked list
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Print reversed list
        temp = prev;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
