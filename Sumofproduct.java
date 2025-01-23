import java.util.Scanner;

class Sumofproduct {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
		if(c ==1){
            int j=0;
			for(int i=1; i<=n;i++){
				
					j= i+j;
					
			}
            System.out.print(j);
		}else if(c==2){
            int k=1;
			for(int i=1; i<=n;i++){
	          
					k= i*k;
				
		}
        System.out.print(k);
		}else{
			System.out.println(-1);
		}
    }
}
