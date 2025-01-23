 
 import java.util.*;

 class SumofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //  int i, sum=0;
        // for( i=1; i<n;i++){
        //     sum = sum + i;
        //     System.out.println(sum);
        // }
        // System.out.println("out"+ sum);
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int res = 0;
		// for(int i=1; i*i <=n;i++){
         
		// 	res =i;
		// }
        int i=1;
        while(i*i<=n){
            i++;
        }

        System.out.print(i-1);
        sc.close();
    }
}
