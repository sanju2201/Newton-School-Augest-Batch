public static Node CloneList(Node head) {
	if (head == null)
		return null;
 
	Node p = head;
 
	// copy every node and insert to list
	while (p != null) {
		Node copy = new Node(p.val);
		copy.next = p.next;
		p.next = copy;
		p = copy.next;
	}
     // 1 --> 2 --> 3 --> 4 --> 5
 
	// copy random pointer for each new node
	p = head;
	while (p != null) {
		if (p.random != null)
			p.next.random = p.random.next;
		p = p.next.next;
	}
    // 1 --> 3 --> 5 --> 2 --> 1

 
	// break list to two
	p = head; // 1
	Node newHead = head.next; // 2
	while (p != null) { // // 1 --> 2 --> 3 --> 4 --> 5
		Node temp = p.next; // 2 
		p.next = temp.next; // 3
		if (temp.next != null)
			temp.next = temp.next.next; // 5
		p = p.next;  // 2
	}
  
  //https://my.newtonschool.co/playground/code/9xtafhikh2nn/
 
	return newHead;
}
