import java.util.Scanner;

class printwave {

    public static void wavePrint(int mat[][]){
		//Your code goes here
		int n= mat.length;
		if(n==0){
			return;
		}
		int m= mat[0].length;
		
		for(int i=0 ; i< m;i++){
			if(i% 2 ==0){
		 for(int j=0; j< n;j++){
			 
			 System.out.print(mat[j][i] + " ");
		 }
			}else{
 			for(int j=n-1; j >= 0;j--){
			 System.out.print(mat[j][i] + " ");
		 }
			}
		}
		
		
		System.out.println();
		
	}

    public static void main(String[] args) {
        int t, N, M;
        Scanner sr = new Scanner(System.in);
        t = sr.nextInt();
        for (int k = 0; k < t; ++k) {
            N = sr.nextInt();
            M = sr.nextInt();
            int ar[][] = new int[N][M]; // Swap n and m in array dimensions
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    ar[i][j] = sr.nextInt();
                }
            }
            wavePrint(ar);
	    System.out.println();
    }
}
}
