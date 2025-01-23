import java.util.Scanner;

class Conditionals {
    public static void main(String[] args) {
        // if condition
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("even number");
        }
        System.out.println("odd number");
        sc.close();

    }
}
