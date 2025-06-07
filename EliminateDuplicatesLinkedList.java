 class EliminateDuplicatesLinkedList {
    public static Node<Integer> removeDuplicates(Node<Integer> head) {

		if(head == null){
			return null;
		}
		Node<Integer> currNode = head;
			while(currNode.next != null){
				if(currNode.data.equals(currNode.next.data)){
					currNode.next = currNode.next.next;
				}else{
					currNode = currNode.next;
				}
			}
			return head;

	}
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(10);
        Node<Integer> node2 = new Node<>(10);
        Node<Integer> node3 = new Node<>(20);
        Node<Integer> node4 = new Node<>(20);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Node<Integer> resultHead = removeDuplicates(node1);
        
        // Print the result
        Node<Integer> curr = resultHead;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
