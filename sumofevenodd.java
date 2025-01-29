import java.util.Scanner;

public class sumofevenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the integer
        System.out.print("Enter an integer: ");
        int N = sc.nextInt();
        
        // Initialize sum variables
        int evenSum = 0;
        int oddSum = 0;
        
        // Process each digit
        while (N != 0) {
            int digit = N % 10;  // Get the last digit
            if (digit % 2 == 0) {
                evenSum += digit;  // Add to even sum
            } else {
                oddSum += digit;   // Add to odd sum
            }
            N /= 10;  // Remove the last digit
        }
        
        // Output the results
        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits: " + oddSum);
        
        sc.close();
        
    }
}
