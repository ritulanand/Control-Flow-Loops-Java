 class MergeTwoSortedLinkedList {
      public static Node<Integer> mergeTwoSorteds(Node<Integer> head1, Node<Integer> head2) {
       
          Node<Integer> t1 = head1;
    Node<Integer> t2 = head2;
    Node<Integer> head = null;
    Node<Integer> tail = null;

    // Initialize head and tail
    if (t1 != null && (t2 == null || t1.data <= t2.data)) {
        head = t1;
        tail = t1;
        t1 = t1.next;
    } else if (t2 != null) {
        head = t2;
        tail = t2;
        t2 = t2.next;
    }

    // Merge remaining nodes
    while (t1 != null && t2 != null) {
        if (t1.data <= t2.data) {
            tail.next = t1;
            t1 = t1.next;
        } else {
            tail.next = t2;
            t2 = t2.next;
        }
        tail = tail.next;
    }

    // Attach the remaining list (if any)
    if (t1 != null) {
        tail.next = t1;
    } else if (t2 != null) {
        tail.next = t2;
    }

    return head;
    }
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(3);
        Node<Integer> node3 = new Node<>(9);
        node1.next = node2;
        node2.next = node3;

        Node<Integer> node4 = new Node<>(2);
        Node<Integer> node5 = new Node<>(4);
        Node<Integer> node6 = new Node<>(6);
        node4.next = node5;
        node5.next = node6;

        Node<Integer> mergedHead = mergeTwoSorteds(node1, node4);

        // Print merged linked list
        Node<Integer> current = mergedHead;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
