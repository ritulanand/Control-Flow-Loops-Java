 import java.util.*;

 class Dowhile {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random random = new Random();
            int randomNumber = random.nextInt(10);
            System.out.println("randomNumber "+randomNumber);
            int guessedNumber;
            do{
                System.out.print("Enter a number between 1-10 ");
                guessedNumber = sc.nextInt();

            }while(guessedNumber != randomNumber);
            System.out.println("ypu guessed right");
    }
}
