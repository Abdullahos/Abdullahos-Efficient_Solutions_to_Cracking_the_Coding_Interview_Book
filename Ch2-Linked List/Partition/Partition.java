class Partition{
	public static Node partition(Node smaller, int x, Node headOfBigger){
		if(smaller == null) return null;
		Node bigger = headOfBigger;
		Node curr = smaller;
		while(curr.next!=null){
			if(curr.next.data >= x){
				if(headOfBigger!=null)	bigger.next = new Node(curr.data);
				else	headOfBigger = new Node(curr.data);
				curr.next = curr.next.next;
			}
			else	curr = curr.next;
		}
		if(smaller.data>x)	headOfBigger.next = new Node(smaller.data);
		
		smaller.next = headOfBigger;
	}
}
//space complexity O(1)
//time complexity O(n)