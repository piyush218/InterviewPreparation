package LinkedList;

public class LinkedListImplement {
	
	private Node head;
	
	public void addNodeAtStart(int data)
	{
		Node newNode = new Node();
		newNode.setData(data);
		
		if(getHead() == null)
		{
			setHead(newNode);
			getHead().setNext(null);
		}
		else
		{
			newNode.setNext(getHead());
			setHead(newNode);
		}
	}
	
	public void addNodeAtPosition(int data, int pos)
	{
		Node newNode = new Node();
		newNode.setData(data);
		
		if(getHead() == null)
		{
			setHead(newNode);
			getHead().setNext(null);
		}
		else
		{
			Node temp = getHead();
			
				
				temp = getHead();
				Node tempNext = temp.getNext();
				int i = 0;
				while(i != pos-2 && temp != null)
				{
					temp = temp.getNext();
					tempNext = tempNext.getNext();
					i++;
				}
				
				if(temp == null)
				{
					System.out.println("Position out of bound, please choose a smaller position");
					return;	
				}
				else
				{
					temp.setNext(newNode);
					newNode.setNext(tempNext);
					
				}
			}
	}
	
	public void addNodeAtEnd(int data)
	{
		Node newNode = new Node();
		newNode.setData(data);
		
		if(getHead() == null)
		{
			setHead(newNode);
			getHead().setNext(null);
		}
		else
		{
			Node temp = getHead();
			while(temp.getNext() != null)
			{
				temp = temp.getNext();
			}
			temp.setNext(newNode);
			newNode.setNext(null);
		}
	}
	
	public void display()
	{
		Node temp = getHead();
		while(temp.getNext() != null)
		{
			System.out.print(temp.getData() + " -> ");
			temp = temp.getNext();
		}
		System.out.print(temp.getData());
		System.out.println();
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public int getSize(Node head) {
		// TODO Auto-generated method stub
		int count = 0;
		if(head == null)
		{
			return 0;
		}
		Node temp = head;
		while(temp != null)
		{
			count ++; 
			temp = temp.getNext();
		}
		return count;
	}

	
}
