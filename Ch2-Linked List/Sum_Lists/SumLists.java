public class SumLists{
	public Node sumLists(Node n1, Node n2){
		int rem = 0;
		Node oldNode;
		Node newNode;
		while(n1!=null && n2!=null){
			newNode = new Node(n1.data + n2.data + rem);
			if(newNode.data>=10)	{
				newNode.data = newNode.data-10;
				rem = 1;
			}
			newNode.next = oldNode;
			oldNode = newNode;
			n1 = n1.next;
			n2 = n2.next;
		}
		return newNode;
	} 
}
//space complexity O(1)
//time complexity O(n);