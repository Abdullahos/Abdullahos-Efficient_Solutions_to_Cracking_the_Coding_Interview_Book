//not ordered linked list
public static Node removeDup(Node head){
	if(head == null) return null;
	Node cur = head;
	while(cur.next != null){
		if(cur.next.data == head.data){
			cur.next = cur.next.next;
		}
		else	cur = cur.next;
	}
	removeDup(head.next);
	return head;
}
//space complexity O(n)
//time complexity O(n^2)