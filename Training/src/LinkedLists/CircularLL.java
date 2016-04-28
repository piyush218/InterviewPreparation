package LinkedLists;

public class CircularLL {

	protected Node start;
	protected Node end;
	
	public void CircularLL(){
		start = null;
	}
	
	public boolean isEmpty()
	{
		return start == null;
	}
	
	public void insertAtBeg(int val)
	{
		Node myNode = new Node(val, null);
		if(isEmpty())
		{
			start = myNode;
			start.setLink(null);
			end = start;
			end.setLink(start);
		}
		else{
			myNode.setLink(start);
			end.setLink(myNode);
			start = myNode;
		}
	}
	
	public void insertAtEnd(int val)
	{
		Node myNode = new Node(val, null);
		if(isEmpty())
		{
			start = myNode;
			start.setLink(null);
			end = start;
			end.setLink(start);
		}
		else{
			end.setLink(myNode);
			myNode.setLink(start);
		}
	}
	
	public void display()
	{
		Node temp = start;
		while(temp!=end)
		{
			System.out.print(temp.getData() + " -> ");
			temp = temp.getLink();
		}
		System.out.println(temp.getData());
	}
}
