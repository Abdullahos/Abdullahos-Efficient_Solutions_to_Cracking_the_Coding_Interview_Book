/**
	returns the node at the beginning of the loop.
*/
public static Node detectLoop (Node n){
	List<Node> nlist = new ArrayList():
	while(n!=null){
		if(nlist.contains(n))	return n;
		n = n.next;
	}
	//if no circular node found.
	return null;
}