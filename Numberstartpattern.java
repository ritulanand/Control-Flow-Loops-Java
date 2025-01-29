import java.util.Scanner;

public class Numberstartpattern {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Read the number of rows
        
        // Loop to print each row
        for (int i = 1; i <= n; i++) {
            // Loop to print numbers before the star
            for (int j = n; j >= i + 1; j--) {
                System.out.print(j);
            }
            // Print the star in the correct position
            System.out.print("*");
            // Loop to print numbers after the star
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
