//using Runner technique
public static Node deleteMiddleNode(Node head){
	Node p1 = head;
	Node p2 = head;
	
	while(p2 != null && p2.next != null`){
		p2 = p2.next.next;
		p1 = p1.next;
	}
	//p2 reached tail or null(tail.next) while p1 at almost middle 
	//depending on size of linked list even or odd.
	p1.next = p1.next.next;
	
	return head;
}
//space complexity O(1)
//time complexity O(n)