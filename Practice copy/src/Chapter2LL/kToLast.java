package Chapter2LL;

import LinkedList.*;

public class kToLast {

	static LinkedListImplement ll = new LinkedListImplement();

	public static void main(String[] args)
	{
		
		ll.addNodeAtStart(15);
		ll.addNodeAtStart(14);
		ll.addNodeAtStart(13);
		ll.addNodeAtStart(2);
		ll.addNodeAtStart(2);
		ll.addNodeAtStart(2);
		ll.addNodeAtStart(8);
		ll.addNodeAtStart(12);
		ll.addNodeAtStart(24);
		ll.addNodeAtStart(24);
		ll.display();
		int size = ll.getSize(ll.getHead());
		int m = 3;
		int point = size - m;
		Node temp = ll.getHead();
		System.out.println(point);
		while(point !=0)
		{
			temp = temp.getNext();
			point--;
		}
		System.out.println(temp.getData());
		
	}

}
