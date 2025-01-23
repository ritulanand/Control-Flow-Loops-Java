import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       boolean flag = false;
        for( int i=2; i<n;i++){
            if(n% i ==0){
                flag = true;
                break;
            }
        }
        if(flag == false){
            System.out.println("prime");
        }else{

            System.out.println("not prime");
        }
        sc.close();
    }
}
