// package stacks;

// import linkedlist.Node;

// Generic datatype can be used here
public class StackUsingLL<T> {

    private Node<T> head;
    private int size;

    public StackUsingLL() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Pushing happens at the beginning of the LL
    public void push(T elem) {
        Node<T> newNode = new Node<T>(elem);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Since pushing is happening at first node
    public T top() throws StackEmptyException {
        if (head == null) {
            throw new StackEmptyException();
        }
        return head.data;
    }

    public T pop() throws StackEmptyException {
        if (head == null) {
            throw new StackEmptyException();
        }
        // Remove data from the front
        T temp = head.data;
        head = head.next;
        size--;
        return temp; // 
    }
}