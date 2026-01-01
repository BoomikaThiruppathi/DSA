import java.util.*;

public class Main {
    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // number of nodes
        int e = scn.nextInt(); // number of edges

        int graph[][] = new int[n][n];
        
       
        for(int i = 0; i < n; i++){
            Arrays.fill(graph[i], INF);
        }

       
        for(int i = 0; i < e; i++){
            int u = scn.nextInt();
            int v = scn.nextInt();
            int w = scn.nextInt();

         
            graph[u][v] = w;
            graph[v][u] = w; 
        }

        prims(graph, n);
    }

    static void prims(int graph[][], int n){
        int key[] = new int[n];     
        int parent[] = new int[n];     
        boolean mst[] = new boolean[n]; 

        Arrays.fill(key, INF);
        Arrays.fill(parent, -1);

        key[0] = 0; 

        for(int count = 0; count < n; count++){
            int u = minNode(key, mst);
            
            // Mistake: if graph is disconnected, minNode may return -1, crashing the code
            if(u == -1) break;
            
            mst[u] = true;

            
            for(int v = 0; v < n; v++){
               
                if(!mst[v] && graph[u][v] != INF && graph[u][v] < key[v]){
                    key[v] = graph[u][v];
                    parent[v] = u;
                }
            }
        }

       
        for(int i = 1; i < n; i++){
          
          
            if(parent[i] != -1) { // check for disconnected nodes
                System.out.println(parent[i] + " -> " + i + " (weight " + graph[parent[i]][i] + ")");
            }
        }
    }

    static int minNode(int key[], boolean mst[]){
        int min = INF;
        int idx = -1;
        for(int i = 0; i < key.length; i++){
            if(!mst[i] && key[i] < min){
                min = key[i];
                idx = i;
            }
        }
        return idx;
    }
}
