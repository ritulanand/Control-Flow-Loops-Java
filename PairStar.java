import java.util.Scanner;
class PairStar {

    public static void addStars(char input[], int index) {
        // conditions to end recursive when out of bound 
        if(input[index] == '\0' || input[index + 1] == '\0') {
            return;
        }
        addStars(input, index + 1);

        if(input[index] == input[index + 1]) {
            int sz = 0;
            while(input[sz] != '\0') sz++;

            
            for(int i = sz; i > index + 1; i--) {
                input[i] = input[i - 1];
            }

            input[index + 1] = '*';
            input[sz + 1] = '\0'; // move null-terminator
            
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        char input[] = new char[2 * str.length() + 1];

        for(int i = 0; i < str.length(); i++) {
            input[i] = str.charAt(i);
        }

        input[str.length()] = '\0';
        addStars(input, 0);

        for(int i=0; input[i] != '\0'; i++){
            System.out.print(input[i]);
        }
    }
}