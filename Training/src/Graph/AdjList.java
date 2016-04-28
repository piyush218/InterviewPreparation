package Graph;

public class AdjList {
	
	Node head;
	Node end;
	
	AdjList()
	{
		head = null;
		end = null;
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void insert(int val)
	{
		Node newNode = new Node(val, null);
		if(head == null)
		{
			head = newNode;
			end = newNode;
			end.setNext(null);
		}
		else
		{
			end.setNext(newNode);
			end = end.getNext();
			end.setNext(null);
		}
	}
}
