import java.util.*;
public class Main {
    static final int INF = 99999;
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int e = scn.nextInt();
       int graph [][] = new int[n][n];
       for(int i = 0;i < n;i++){
           Arrays.fill(graph[i],INF);
       }
       
       for(int i = 0;i < e;i++){
          int u = scn.nextInt();
          int v = scn.nextInt();
          int w = scn.nextInt();
         
          graph[u][v] = w; 
          graph[v][u] = w; 
       }
       int s = scn.nextInt();
       int d = scn.nextInt();
       
       dijkstra(graph,s,d,n);
    }

    static void dijkstra(int graph[][],int s,int d,int n){
        int dist[] = new int[n];
        boolean visited[] = new boolean[n];
        int parent[]= new int[n];
        
        Arrays.fill(dist,INF);
        Arrays.fill(parent,-1);
        
        dist[s] = 0;
        for(int count = 0; count < n; count++){
            int u = min(dist,visited);
            visited[u] = true;
            for(int v = 0; v < n; v++){
                if(!visited[v] && graph[u][v] != INF && dist[u] + graph[u][v] < dist[v]){
                    dist[v] = dist[u] + graph[u][v];
                    parent[v] = u;
                }
            }
        }
        
        printpath(parent,d);
    }

    static int min(int dist[],boolean visited[]){
        int min = INF;
        int idx = -1;
        for(int i = 0;i < dist.length;i++){
            if(!visited[i] && dist[i] < min){
                min = dist[i];
                idx = i;
            }
        }
        return idx;
    }
    
    static void printpath(int parent[],int d){
        List<Integer> path = new ArrayList<>();
        while(d != -1){
            path.add(d);
            d = parent[d];
        }
        Collections.reverse(path); 
        for(int i = 0;i < path.size();i++){
            System.out.print(path.get(i));
            if(i < path.size() - 1)
                System.out.print("->");
        }
        System.out.println();
    }
}
