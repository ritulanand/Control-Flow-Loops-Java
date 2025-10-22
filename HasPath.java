import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class HasPath {

      public static boolean hasPath(int[][] adjMatrix, int start, int end, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            // If we found the destination vertex
            if (current == end) {
                return true;
            }

            // Traverse all neighbors
            for (int i = 0; i < adjMatrix.length; i++) {
                if (adjMatrix[current][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
        return false; // no path found
    }
    
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        int V = s.nextInt(); // number of vertices
        int E = s.nextInt(); // number of edges

        int[][] adjMatrix = new int[V][V];
        for (int i = 0; i < E; i++) {
            int v1 = s.nextInt();
            int v2 = s.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }

        int start = s.nextInt();
        int end = s.nextInt();

        boolean[] visited = new boolean[V];
        boolean result = hasPath(adjMatrix, start, end, visited);

        System.out.println(result);
        s.close();
    }
}
