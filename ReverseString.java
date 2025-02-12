import java.util.Scanner;

class ReverseString {

    public static void reverseString(String str){
        String revString = "";
        for(int i= str.length() -1; i>=0;i--){
            revString = revString+ str.charAt(i);
        }
        System.out.println(revString);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string: ");
        String str = sc.nextLine();
        reverseString(str);
    }
}
