import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
        this.next = null;
    }
}

class LevelWiseLinkedList {
    public static void main(String[] args) {
        // Create a sample binary tree
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        root.left = new BinaryTreeNode<>(2);
        root.right = new BinaryTreeNode<>(3);
        root.left.left = new BinaryTreeNode<>(4);
        root.left.right = new BinaryTreeNode<>(5);
        root.right.left = new BinaryTreeNode<>(6);
        root.right.right = new BinaryTreeNode<>(7);

        ArrayList<LinkedListNode<Integer>> result = constructLinkedListForEachLevel(root);

        // Print the result
        System.out.println("Level-wise linked lists:");
        for (int i = 0; i < result.size(); i++) {
            System.out.print("Level " + i + ": ");
            LinkedListNode<Integer> current = result.get(i);
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root) {
        ArrayList<LinkedListNode<Integer>> result = new ArrayList<>();

        if (root == null)
            return result;

        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            LinkedListNode<Integer> head = null;
            LinkedListNode<Integer> tail = null;

            // Process all nodes of the current level
            for (int i = 0; i < size; i++) {
                BinaryTreeNode<Integer> current = queue.poll();

                // Create LinkedList node
                LinkedListNode<Integer> newNode = new LinkedListNode<>(current.data);

                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = tail.next;
                }

                // Add children to queue
                if (current.left != null)
                    queue.add(current.left);

                if (current.right != null)
                    queue.add(current.right);
            }

            // Add head of this level linked list
            result.add(head);
        }

        return result;
    }
}
