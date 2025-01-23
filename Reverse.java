import java.util.Scanner;

class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int rev = 0;
		int rev = 0;
		while(n>0){
			int temp;
           temp = n%10;
            n=n/10;
            System.out.println("n"+n);
			 rev = ( rev*10) + temp;
        }
		System.out.print(rev);
		
        sc.close();
    }
}
