import java.util.*;

public class Main {

    static boolean isBipartite(int graph[][], int n) {
        int color[] = new int[n];
        Arrays.fill(color, -1); // -1 means not colored

        Queue<Integer> q = new LinkedList<>();

        for(int start = 0; start < n; start++) {
            if(color[start] == -1) {
                q.add(start);
                color[start] = 0;

                while(!q.isEmpty()) {
                    int u = q.poll();

                    for(int v = 0; v < n; v++) {
                        if(graph[u][v] == 1) {
                            
                            if(color[v] == -1) {
                                color[v] = 1 - color[u];
                                q.add(v);
                            }
                            
                            else if(color[v] == color[u]) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // nodes
        int e = sc.nextInt(); // edges

        int graph[][] = new int[n][n];

        for(int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph[u][v] = 1;
            graph[v][u] = 1;
        }

        if(isBipartite(graph, n))
            System.out.println("Bipartite Graph");
        else
            System.out.println("Not a Bipartite Graph");
    }
}
