 import java.util.Scanner;
 
 class UserInput {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // Scanner sc = new Scanner(System.in);
            // byte F1 = (byte) 432432;
            // float F2 = (float) 454545365646565465443.56464656;
            // float -> double
            // byte -> int -> long
            // long mult =  F1;
            // System.out.println(mult);
	
            // float totalMarks = sc.nextFloat();
            // int scored = sc.nextInt();
            // // float totalMarks = 800f;
            // // int scored = 540;
            // //calculate percentage
            // double percent = (scored/ totalMarks) *100;
            // System.out.println(percent);
            // Scanner sc = new Scanner(System.in);
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y1 = sc.nextInt();
			int y2 = sc.nextInt();

		// Write your code here
int result = (x2 - x1)* (y2 -y1);
System.out.println(result);
            sc.close();
        }
}
