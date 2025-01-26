import java.util.Scanner;

class Hollownumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){
            int curr =1;
            for(int j=1; j<= n; j++){
              if(i==1 || i == n){
                System.out.print(curr);
                curr++;
              }else{
                if(j==1 || j == n){
                  System.out.print(curr);
                  curr++;
                }else{
                  System.out.print(" ");
                }
              }
            // System.out.println();
            // curr= 1;
            }

          
            System.out.println();
        }
    }
}
