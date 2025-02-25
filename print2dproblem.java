import java.util.Scanner;

class print2dproblem {
    public static void main(String[] args) {
           int[][] ar = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ar[i][j] = scanner.nextInt();
            }
        }

        System.out.println(ar[3][3]); 
        scanner.close();
    }
}
