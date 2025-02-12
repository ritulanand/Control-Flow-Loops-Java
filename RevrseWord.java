import java.util.Scanner;

class RevrseWord {

    public static String reverseString(String str, int left, int right){
        String ans = "";
        for(int i = right;i>=left;i--){
			ans = ans + str.charAt(i);
		}
        return ans;
  }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("enter the string: ");
        String str = sc.nextLine();
        
 
        String finalString = "";
		 int start =0;
		 
		 for(int i=0; i< str.length();i++){
			 if(str.charAt(i) == ' ' || i == str.length() - 1){
				 int end = (i == str.length() -1) ? i : (i-1);
				String reverseWord = reverseString(str, start, end);
				 finalString =  finalString + reverseWord + " ";
				 start = i+1;
			 }
		 }
		System.out.println("out" + finalString);
    }
}
