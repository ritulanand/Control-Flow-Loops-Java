import java.util.ArrayList;
import java.util.Scanner;

class GetPathDFS {

     public static ArrayList<Integer> getPathDFS(int[][] adjMatrix, int start, int end, boolean[] visited) {
        // Base case: if start == end, path found
        if (start == end) {
            ArrayList<Integer> path = new ArrayList<>();
            System.out.println("Path found:>>"+ path);
            path.add(end);
            return path;
        }

        visited[start] = true;

        // Explore all neighbors
        for (int i = 0; i < adjMatrix.length; i++) {
            if (adjMatrix[start][i] == 1 && !visited[i]) {
                ArrayList<Integer> smallPath = getPathDFS(adjMatrix, i, end, visited);
                if (smallPath != null) {
                    System.out.println("Path found:" + smallPath);
                    smallPath.add(start); // add current node while returning
                    return smallPath;
                }
            }
        }

        return null; // no path found
    }

    public static void main(String[] args) {
          Scanner s = new Scanner(System.in);

        int V = s.nextInt(); // number of vertices
        int E = s.nextInt(); // number of edges

        int[][] adjMatrix = new int[V][V];

        // Fill adjacency matrix
        for (int i = 0; i < E; i++) {
            int v1 = s.nextInt();
            int v2 = s.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }

        int start = s.nextInt();
        int end = s.nextInt();

        boolean[] visited = new boolean[V];

        ArrayList<Integer> path = getPathDFS(adjMatrix, start, end, visited);

        if (path != null) {
            for (int vertex : path) {
                System.out.print(vertex + " ");
            }
        }
    }
}
