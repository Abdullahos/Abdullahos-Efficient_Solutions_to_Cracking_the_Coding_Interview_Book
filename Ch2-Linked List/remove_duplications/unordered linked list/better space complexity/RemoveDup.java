public class{
	public static void removeDup(Node head){
		List list = new ArrayList();
		Node cur = head;
		list.add(cur);
		while(cur.next != null){
			cur = cur.next;
			if(!list.contains(cur.data)){
				list.add(cur);
			}
		}
	}
	//space complexity O(1)
	//time compexity O(n)
}