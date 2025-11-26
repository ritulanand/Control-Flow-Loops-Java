import java.util.LinkedList;
import java.util.Queue;

class WinnerofCircularQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        q.add(11);
        display(q);
        int winnerQueue = findTheWinner(11, 4);
        System.out.println("Winner: " + winnerQueue);
    }

    private static void display(Queue<Integer> q) {
        int n = q.size();
        for (int i = 1; i <= n; i++) {
            System.out.println(q.peek() + " ");
            q.add(q.remove());
        }
        System.out.println();
    }

    public static int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }
        while (q.size() > 1) {
            // k-1 elements remove and add
            for (int i = 1; i <= k - 1; i++) {
                q.add(q.remove());
            }
            q.remove(); // kth element will be removed

        }
        System.out.println(q);
        return q.peek();
    }
}
