import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueUsingLL {

    private Node front;
    private Node rear;
    private int size;

    public QueueUsingLL() {
        front = null;
        rear = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int data) {
        Node newnode = new Node(data);
        if (rear == null) {
            front = rear = newnode;
        } else {
            rear.next = newnode;
            rear = newnode;
        }
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            return -1;
        }
        int value = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return value;
    }

    public int front() {
        if (isEmpty()) {
            return -1;
        }
        return front.data;
    }

    public void printQueue() {
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        QueueUsingLL queue = new QueueUsingLL();

        int q = s.nextInt();

        while (q > 0) {
            int choice, input;
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    input = s.nextInt();
                    queue.enqueue(input);
                    break;

                case 2:
                    System.out.println(queue.dequeue());
                    break;

                case 3:
                    System.out.println(queue.front());
                    break;

                case 4:
                    System.out.println(queue.getSize());
                    break;

                default:
                    System.out.println((queue.isEmpty()) ? "true" : "false");
            }

            q -= 1;
        }
        s.close();
    }
}