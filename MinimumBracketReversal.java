import java.util.Stack;

public class MinimumBracketReversal {
    public static int countBracketReversals(String input) {
        if (input.length() % 2 != 0)
            return -1; // Odd can't be balanced

        Stack<Character> stack = new Stack<>();

        // Step 1: Push and pop based on conditions
        for (char ch : input.toCharArray()) {
            if (ch == '{') {
                stack.push(ch);
            } else { // ch == '}'
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop(); // matched
                } else {
                    stack.push(ch); // unmatched closing
                }
            }
        }

        // Step 2: Count unmatched '{' and '}'
        int c1 = 0, c2 = 0;
        while (!stack.isEmpty()) {
            if (stack.pop() == '{')
                c1++;
            else
                c2++;
        }

        return (c1 + 1) / 2 + (c2 + 1) / 2;
    }

    public static void main(String[] args) {
        String input = "{{{{}}}";
        int result = countBracketReversals(input);
        System.out.println("Minimum reversals needed: " + result);
    }
}