//odd, if even make p2 start from head.next
public static boolean(Node head){
	if(head==null)	return false;
	Node p1 = head;
	Node p2 = head;
	int halfSize = 0;
	while(P2.next!=null){
		p1 = p1.next;
		p2 = p2.p2.next;
		halfSize++;
	}
	//now, p1 exact at middle
	List<Integer> list = new ArrayList();
	while(p1.next!=null){
		p1 = p1.next;
		list.add(0,p1);
	}
	Node n = head;
	for(int i = 0; i<halfSize; i++){
		if(n.data != list.get(i))	return false;
	}
	return true;
}