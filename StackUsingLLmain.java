public class StackUsingLLmain {
    public static void main(String[] args) throws StackEmptyException {
        StackUsingLL<Integer> stack = new StackUsingLL<>();
        int arr[] = { 5, 6, 7, 1, 9 };
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        stack.push(10);
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
    }
}