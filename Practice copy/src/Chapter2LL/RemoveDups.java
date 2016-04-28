package Chapter2LL;
import java.util.HashMap;

import LinkedList.*;

public class RemoveDups {
	static LinkedListImplement ll = new LinkedListImplement();

	public static void main(String[] args)
	{
		
		ll.addNodeAtStart(13);
		ll.addNodeAtStart(13);
		ll.addNodeAtStart(13);
		ll.addNodeAtStart(2);
		ll.addNodeAtStart(2);
		ll.addNodeAtStart(2);
		ll.addNodeAtStart(8);
		ll.addNodeAtStart(12);
		ll.addNodeAtStart(24);
		ll.addNodeAtStart(24);
		ll.display();
		//removeDupsWHash(ll.getHead());
		removeDupsWOHash(ll.getHead());
	}

	private static void removeDupsWOHash(Node head) {
		// TODO Auto-generated method stub
		Node temp = head;
		Node runner = temp.getNext();
		Node prev = temp;
		while(temp != null)
		{
			runner = temp.getNext();
			prev = temp;
			while(runner != null)
			{
				if(runner.getData() == temp.getData())
				{
					prev.setNext(runner.getNext());
					runner.setNext(null);
					runner = prev.getNext();
				}
				else
				{
					prev = runner;
					runner = runner.getNext();
				}
			}
			temp = temp.getNext();
		}
		
		ll.display();
	}

	private static void removeDupsWHash(Node head) {
		// TODO Auto-generated method stub
		HashMap<Integer, Boolean> map = new HashMap<>();
		Node temp = head;
		Node prev = head;
		while(temp != null)
		{
			if(map.containsKey(temp.getData()))
			{
				//System.out.println("dup found");
				prev.setNext(temp.getNext());
				temp.setNext(null);
				temp = prev.getNext();
			}
			else
			{
				map.put(temp.getData(), true);
				prev = temp;
				temp = temp.getNext();
			}
		}
		
		ll.display();
	}
}
