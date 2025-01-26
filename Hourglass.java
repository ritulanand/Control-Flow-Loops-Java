import java.util.Scanner;

class Hourglass {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i-1;j++){
				System.out.print(" ");
			}
        
            for(int j=i;j<=n;j++){
				System.out.print(j+ " ");
            
			}
          
			System.out.println();
		}


        //for opposite hours look
        for(int i=n-1;i>=1;i--){
			for(int j=1;j<=i-1;j++){
				System.out.print(" ");
			}
        
            for(int j=i;j<=n;j++){
				System.out.print(j+ " ");
            
			}
          
			System.out.println();
		}
    }
}


// o/p -
// 1 2 3 4 
//  2 3 4 
//   3 4 
//    4 
//   3 4 
//  2 3 4 
// 1 2 3 4 