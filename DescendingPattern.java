import java.util.Scanner;

class DescendingPattern {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){
            
            for(int j=1; j<=i;j++){
                System.out.print(n-j+1);
                // n--;
            }
            System.out.println();
        }
        sc.close();
    }
}
