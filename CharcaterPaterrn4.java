import java.util.Scanner;

class CharcaterPaterrn4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){
            char ch = (char) ('A'+ n -i);
            for(int j=1; j<=i; j++){
             System.out.print((char) (ch + j-1));
            }
            System.out.println();
        }
    }
}
