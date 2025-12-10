import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int e = scn.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < e; i++) {
            int u = scn.nextInt();
            int v = scn.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int start = scn.nextInt();
        boolean visited[] = new boolean[n];

        System.out.print("DFS Traversal : ");
        dfs(start, adj, visited);
    }

    static void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neigh : adj.get(node)) {
            if (!visited[neigh]) {
                dfs(neigh, adj, visited);
            }
        }
    }
}
