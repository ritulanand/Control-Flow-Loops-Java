import java.util.Scanner;

class BinaryDecimal {
    	public static void main(String[] args) {
		// Write your code here
		     Scanner sc = new Scanner(System.in);
			 int n = sc.nextInt();
			  int ans =0;
			  		 int pv =1;
			 while(n>0){
				 n = n*10;
				 ans = ans + pv * n;
				 pv= pv*2;
				 n= n/10;
			 }
			 System.out.print(ans);
             sc.close();

	}
}
