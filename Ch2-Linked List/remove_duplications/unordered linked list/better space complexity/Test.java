public static void main(String[] args){
	test(new Node(new int[]{0,0,0,0}));
	test(new Node(new int[]{1,2,3,1,2,3,1,2,4}));
}
public static test(Node head){
	System.out.println("before:");
	printList(head);
	removeDup(head);
	printList(head);
}
public static void printList(Node head){
	if(head==null)	return;
	Noded cur = head;
	while(cur.next != null ){
		System.out.println(cur.data);
		cur = cur.next;
	}
}