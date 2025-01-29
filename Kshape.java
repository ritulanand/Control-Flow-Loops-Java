import java.util.Scanner;

public class Kshape {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      
		for(int i=1;i<=n;i++){
			
        
            for(int j=i;j<=n;j++){
				System.out.print(n-j+1+ " ");
            
			}
          
			System.out.println();
		}


        //for opposite hours look
        for(int i=n-1;i>=1;i--){
        
            for(int j=i;j<=n;j++){
				System.out.print(n-j+1 + " ");
            
			}
          
			System.out.println();
		}
    }
}
