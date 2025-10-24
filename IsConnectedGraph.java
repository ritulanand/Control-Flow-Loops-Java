import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class IsConnectedGraph {
    	public static void bfs(int[][] adjMatrix, int start, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while(!queue.isEmpty()) {
            int current = queue.poll();
            for (int i = 0; i < adjMatrix.length; i++) {
                if (adjMatrix[current][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
           if (V == 0) {
        System.out.println("true");
        return;
        }

        int[][] adjMatrix = new int[V][V];
        for (int i = 0; i < E; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }

        boolean[] visited = new boolean[V];

        // Run BFS from vertex 0
        bfs(adjMatrix, 0, visited);
     

        // Check if all vertices are visited
        boolean isConnected = true;
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                isConnected = false;
                break;
            }
        }

        System.out.println(isConnected);
    }
    
}
