 class FindNodeInLinkedList {
    public static int findNode(Node<Integer> head, int n) {
		// Write your code here.
		Node<Integer> curr = head;
		int count =0;
		while(curr != null ){
			  if(curr.data == n){
		  return count;
	  }
			count++;
			curr = curr.next;
			
    
		}
		return -1;
	}

      public static void main(String[] args){

      Node<Integer> node1 = new Node<Integer>(10);
    Node<Integer> node2 = new Node<Integer>(20);
    node1.next = node2;
    // increment(node1);
    int res = findNode(node1, 10);
    
    System.out.print(res);


  }
}
