import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of nodes
        int e = sc.nextInt(); // number of edges

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        int indegree[] = new int[n];

        // input edges
        for(int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            adj.get(u).add(v);
            indegree[v]++;
        }

        Queue<Integer> q = new LinkedList<>();

        // add nodes with indegree 0
        for(int i = 0; i < n; i++) {
            if(indegree[i] == 0) {
                q.add(i);
            }
        }

        List<Integer> topo = new ArrayList<>();

        while(!q.isEmpty()) {
            int u = q.poll();
            topo.add(u);

            for(int v : adj.get(u)) {
                indegree[v]--;
                if(indegree[v] == 0) {
                    q.add(v);
                }
            }
        }

        // check for cycle
        if(topo.size() != n) {
            System.out.println("Cycle exists (Topo not possible)");
        } else {
            for(int x : topo) {
                System.out.print(x + " ");
            }
        }
    }
}
