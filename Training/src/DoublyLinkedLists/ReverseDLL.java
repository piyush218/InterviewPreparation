package DoublyLinkedLists;
//Reverse a doubly linked list
public class ReverseDLL {
	
	public static void main(String[] args)
	{
		DoublyLL dll = new DoublyLL();
		dll.insertAtStart(4);
		dll.insertAtStart(3);
		dll.insertAtStart(2);
		dll.insertAtStart(1);
		dll.display();
		dll.start = reverse(dll.start);
	
		dll.display();
	}

	private static DoublyNode reverse(DoublyNode start) {
		DoublyNode n = start, next;
		while(n.getNext() != null){
			next = n.getNext(); 
			n.next = n.prev; //reversing next pointer
			n.prev = n.next; // reversing prev pointer
			n = next;
		}
		n.next = n.prev;
		n.next.prev = n;
		// n is the new head.
		return n;
	}
}
