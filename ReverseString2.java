import java.util.Scanner;

class ReverseString2 {

    public static void reverseString(char[] arr){
        for(int i=0,  n = arr.length-1; i<n ;i++, n--){
            char temp = arr[i];
            arr[i] =arr[n];
            arr[n] = temp;
            // [arr[i], arr[j]] = [arr[j], arr[i]];
         }
         String ans ="";
         for(char i : arr){
           ans += i;
         }
           System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string: ");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        // System.out.println("char");
        for(char i: arr){
            System.out.print(i+ " ");
        }
        System.out.println();
        reverseString(arr);
    }
}
