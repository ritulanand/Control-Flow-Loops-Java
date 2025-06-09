 class MidPointLinkedList {
     public static void  printfrommidPoint(Node<Integer> head) {
        //Your code goes here
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        Node<Integer> temp = head;

        while(fast != null && fast.next != null && fast.next.next != null ){
            fast = fast.next.next;
            slow = slow.next;
            temp = slow;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        // System.out.print(slow.data+ " ");

        // return slow;
    }

    // public static printfrommid(Node<Integer> head) {
    //     Node<Integer> temp = head;
    //     while (temp != null) {
    //         System.out.print(temp.data + " ");
    //         temp = temp.next;
    //     }
    // }
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        Node<Integer> node4 = new Node<>(4);
        Node<Integer> node5 = new Node<>(5);
         Node<Integer> node6 = new Node<>(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        printfrommidPoint(node1); // Output: 3 4 5 6
    }
}
