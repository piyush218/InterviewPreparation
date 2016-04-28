package DoublyLinkedLists;

import LinkedLists.Node;

public class LRU {

	public static void main(String[] args)
	{
		DoublyLL dll = new DoublyLL();
		dll.insertAtStart(4);
		dll.insertAtStart(6);
		dll.insertAtStart(2);
		dll.insertAtStart(3);
		dll.insertAtStart(8);
		use(dll,6);
		dll.display();
		use(dll,10);
		dll.display();
	}

	private static void use(DoublyLL dll, int u) {
		DoublyNode temp = dll.start;
		DoublyNode prevtemp = temp;
		boolean f=false;
		while(temp!=null)
		{
			if(temp.getData() == u)
			{
				f=true;
				System.out.println("Page found");
				break;
			}
			prevtemp = temp;
			temp=temp.getNext();
		}
		if(f==true)
		{
			if(temp.next!=null)
			{
				temp.next.prev = temp.prev;
			}
			temp.prev.next = temp.next;
			temp.setNext(dll.start);
			dll.start = temp;
			
		}
		else
		{
			//temp = temp.getPrev();
			System.out.println("Page not found...Adding page...Deleting LRU");
			DoublyNode n = new DoublyNode(u, null, null);
			prevtemp.prev.setNext(null);
			n.setNext(dll.start);
			n.next.prev = n;
			dll.start = n;
		}
	}
}
