import java.util.*;

public class Main {
    static final int INF = 1000000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int e = sc.nextInt();

        int dist[][] = new int[n][n];

        // initialize
        for(int i = 0; i < n; i++){
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0;
        }

        // input edges
        for(int i = 0; i < e; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();

            dist[u][v] = w; // directed
        }

        // Floyd Warshall
        for(int k = 0; k < n; k++){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(dist[i][k] != INF && dist[k][j] != INF){
                        dist[i][j] = Math.min(dist[i][j],
                                              dist[i][k] + dist[k][j]);
                    }
                }
            }
        }

        // output
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(dist[i][j] == INF)
                    System.out.print("INF ");
                else
                    System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }
    }
}
