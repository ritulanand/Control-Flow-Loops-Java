import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

 class BreadthFistSearchfordisconnected {

    public static void bfTraversal(int adjMatrix[][]){
        Queue<Integer> pendingVertices = new LinkedList<>();
        boolean visited[] = new boolean[adjMatrix.length];
        for(int i=0; i < adjMatrix.length; i++) {
            if(!visited[i]) {
                pendingVertices.add(i);
                visited[i] = true;
                while(!pendingVertices.isEmpty()){
                    int currentVertex = pendingVertices.poll();
                    System.out.print(currentVertex + " ");
                    for(int j=0; j< adjMatrix.length;j++){
                        if(adjMatrix[currentVertex][j] == 1 && !visited[j]){
                            // j is unvisited neighbour of currentVertex
                            pendingVertices.add(j);
                            visited[j] = true;
                        }
                    }
                }
                System.out.println();
            }
        }
    }
   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int e = s.nextInt();
        int adjMatrix[][] = new int[n][n];
        for(int i=0; i< e;i++){
            int v1 = s.nextInt();
            int v2 = s.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }
        bfTraversal(adjMatrix);

    }
}
