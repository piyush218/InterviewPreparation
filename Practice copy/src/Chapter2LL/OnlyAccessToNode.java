package Chapter2LL;

import LinkedList.*;

public class OnlyAccessToNode {

	static LinkedListImplement ll = new LinkedListImplement();
	
	public static void main(String[] args)
	{
		ll.addNodeAtStart(14);
		ll.addNodeAtStart(19);
		ll.addNodeAtStart(18);
		ll.addNodeAtStart(28);
		ll.addNodeAtStart(26);
		ll.addNodeAtStart(2);
		ll.addNodeAtStart(8);
		ll.addNodeAtStart(12);
		ll.addNodeAtStart(24);
		ll.addNodeAtStart(21);
		ll.display();
		Node temp = ll.getHead();
		int i=1;
		while(i != 4)
		{
			temp = temp.getNext();
			i++;
		}
		delete(temp);
		ll.display();
		//System.out.println(temp.getData());
	}

	private static void delete(Node badNode) {
		// TODO Auto-generated method stub
		
		Node prev = badNode;
		Node temp = badNode.getNext();
		while(temp.getNext() != null)
		{
			prev.setData(temp.getData());
			prev = temp;
			temp = temp.getNext();
		}
		prev.setData(temp.getData());
		prev.setNext(null);
		
	}
}
