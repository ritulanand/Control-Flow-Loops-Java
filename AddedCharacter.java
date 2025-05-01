import java.util.Scanner;

class AddedCharacter {
    public static void findAddedCharacter(String s, String t) {
        int sumS = 0, sumT = 0;

        for (char c : s.toCharArray()) {
            System.out.println("s: " + c);
            sumS += c;
            System.out.println("sumS: " + sumS);
        }

        for (char c : t.toCharArray()) {
            System.out.println("t: " + c);
            sumT += c;
        }

        char addedChar = (char) (sumT - sumS);
        System.out.println("Added character: " + addedChar);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        findAddedCharacter(s, t);
    }
}
