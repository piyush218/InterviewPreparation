package DoublyLinkedLists;

import LinkedLists.Node;

public class DoublyLL {

	protected DoublyNode start;
	//protected Node end;//we keep a track of end so that we can avoid O(n) complexity when we have to place myNode at the end.
	public int size;//we keep a track of size so that we can avoid O(n) complexity when we have to place myNode at the end or delete.
	
	public DoublyLL()
	{
		start = null;
		//end = null;
		size = 0;
	}
	
	
	public boolean isEmpty()
	{
		return start == null;
	}
	
	public void insertAtStart(int val)
	{
		DoublyNode myNode = new DoublyNode(val, null, null);
		size++;
		if(isEmpty())
		{
			start = myNode;
			myNode.setPrev(null);
			myNode.setNext(null);
			
		}
		else
		{
			myNode.setNext(start);
			start.setPrev(myNode);
			start = myNode;
			myNode.setPrev(null);
		}
	}
	
	public void insertAtPos(int val, int pos)
	{
			DoublyNode myNode = new DoublyNode(val, null, null);
			size++;
			DoublyNode temp = start;
			int i=1;
			while(i!=pos-1)
			{
				temp = temp.getNext();
			}
			DoublyNode temp2 = temp.getNext();
			temp.setNext(myNode);
			myNode.setPrev(temp);
			myNode.setNext(temp2);
			temp2.setPrev(myNode);
						
	}
	
	public void display()
	{
		DoublyNode temp = start;
		while(temp.getNext()!=null)
		{
			System.out.print(temp.getData() + "->");
			temp = temp.getNext();
		}
		System.out.println(temp.getData());
	}
	
	public void deleteData(int delVal)
	{
		DoublyNode temp = start;
		while(temp!=null)
		{
			if(temp.getData() == delVal)
			{
				System.out.println("got the node");
				//DoublyNode prev1 = temp.getPrev();
				//DoublyNode next1 = temp.getNext();
				//System.out.println(prev1.getData());
				//System.out.println(next1.getData());
				temp.getPrev().setNext(temp.getNext());
				temp.getNext().setPrev(temp.getPrev());
				temp.setPrev(null);
				temp.setNext(null);
			}
			temp = temp.getNext();
		}
	}
}
