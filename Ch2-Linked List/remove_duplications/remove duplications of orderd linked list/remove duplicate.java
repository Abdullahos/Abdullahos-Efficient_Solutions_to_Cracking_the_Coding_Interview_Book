//ordered linked list
public static Node removeDup(Node head){
	if(head == null) return null;
	Node cur = head;
	while(cur.next != null && cur.next.data == head.data){
		cur = cur.next;
	}
	head.next = cur.next;
	removeDup(head.next);
	return head;
}