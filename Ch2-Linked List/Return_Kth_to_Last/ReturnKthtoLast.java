//if the list size is known, iterate size-k-1 times (k=0 'll return the tail in our case)
//else	use Runner technique
public static Node returnKthtoLast(Node head, int k){
	Node p1 = head;
	Node p2 = head;
	
	for(int i = 0 ; i<k; i++){
		if(p2==null)	return null;	//out of bounds
		p2 = p2.next;
	}
	while(p2.next!= null){
		p1 = p1.next;
		p2 = p2.next;
	}
	return p2.data;
}
public static void test(Node head,int k){
	System.out.println(returnKthtoLast(head,k));
}
public static void main(String[] args){
	Node head = new Node(new int[]{1,2,3,4,5});	
	test(head,3);	//expected : 3
	System.out.println();
	test(head,2);	//expected : 2
}