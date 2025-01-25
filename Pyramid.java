import java.util.Scanner;

class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){
            for(int j=1; j<= n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<= 2*i -1; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        // using while loop
        // int i=1;
        // while(i<=n){
        //     int j=1;
        //     while(j<= n-i){
        //         System.out.print( " ");
        //         j++;
        //     }
        //     j=1;
        //     while(j<=2*i - 1){
        //         System.out.print(j);
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }
        sc.close();
    }
}
