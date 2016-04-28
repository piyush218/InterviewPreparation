package DoublyLinkedLists;

import LinkedLists.Node;

public class DoublyNode {

	protected int data;
	protected DoublyNode next;
	protected DoublyNode prev;
	
	public DoublyNode()
	{
		data = 0;
		next = null;
		prev = null;
	}
	
	public DoublyNode(int d, DoublyNode n, DoublyNode p)
	{
		data = d;
		next = n;
		prev = p;
	}
	
	public void setNext(DoublyNode n)
	{
		next = n;
	}
	
	public void setPrev(DoublyNode p)
	{
		prev = p;
	}
	
	public void setData(int d)
	{
		data = d;
	}
	
	public DoublyNode getNext()
	{
		return next;
	}
	
	public DoublyNode getPrev()
	{
		return prev;
	}
	
	public int getData()
	{
		return data;
	}

}
