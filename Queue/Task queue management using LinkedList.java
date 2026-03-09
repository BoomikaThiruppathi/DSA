import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            int task = sc.nextInt();
            q.add(task);
            System.out.println("Enqueued: " + task);
        }

        System.out.print("Queue Elements after Dequeue: ");

        int size = q.size();

        for(int i = 0; i < size; i++) {
            int x = q.poll();

            if(x >= 0) {
                System.out.print(x + " ");
            }
        }
    }
}
