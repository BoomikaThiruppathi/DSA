import java.util.*;

public class RotateQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> q = new LinkedList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }

        int last = 0;

        for(int i = 0; i < n; i++) {
            int x = q.remove();
            if(i == n-1) {
                last = x;
            } else {
                q.add(x);
            }
        }

        Queue<Integer> result = new LinkedList<>();
        result.add(last);

        while(!q.isEmpty()) {
            result.add(q.remove());
        }

        System.out.println("Queue after rotation:");
        for(int x : result) {
            System.out.print(x + " ");
        }
    }
}
