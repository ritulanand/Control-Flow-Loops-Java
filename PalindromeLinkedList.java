 class PalindromeLinkedList {

    // 1 -> 2  -> 3 -> 2 -> 1


    public static Node<Integer> getMidList(Node<Integer> currNode){
		Node<Integer> slow = currNode;
		Node<Integer> fast = currNode;
		while(fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;

		}
		return slow;
        // 3 -> 2 -> 1
	}

	public static Node<Integer> reverseList(Node<Integer> currNode){
		Node<Integer> prev = null;
		Node<Integer> next = null;
		while(currNode != null){
			next = currNode.next; // next -> 2
			currNode.next = prev; // 3 => null
			prev = currNode;  // prev => 3
			currNode = next; // curr => 2
		}
		return prev;
        // 1 -> 2 -> 3-> null
	}

	public static boolean isPalindrome(Node<Integer> head) {
		//Your code goes here
		if(head == null || head.next == null){
			return true;
		}

	Node<Integer>	mid = getMidList(head); // 321
	Node<Integer>	revhead = reverseList(mid);  // 1=> 2 => 3
		while(revhead != null && head != null){
			if(!revhead.data.equals(head.data)){
				return false;

			}
			revhead = revhead.next;
			head = head.next;
		}
		return true;

	}
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(4);
        Node<Integer> node3 = new Node<>(2);
        Node<Integer> node4 = new Node<>(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        boolean isPalindrome = isPalindrome(node1);
        System.out.println("Is the linked list a palindrome? " + isPalindrome);
    }
}
