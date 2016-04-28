package LinkedLists;

public class SortedInsert {

	static SingleLinkedList sll = new SingleLinkedList();
	public static void main(String[] args)
	{
		
		sll.insertAtStart(4);
		insert(8);
		sll.display();
		insert(18);
		sll.display();
//		sll.insertAtEnd(28);
//		sll.insertAtEnd(38);
//		sll.insertAtEnd(48);
//		sll.insertAtEnd(58);
//		
		insert(10);
		sll.display();
	}

	private static void insert(int val) {
		Node temp = sll.start;
		Node helper;
		Node newNode = new Node(val, null);
		while(temp!=null)
		{
			// looking for the element just smaller and just larger than the value
			if(temp == sll.start && temp.getLink() == null)//only one element
			{
				if(temp.getData() > val)
				{
					newNode.setLink(temp);
					sll.start = newNode;
					temp.setLink(null);
					//break;
				}
				else
				{
					temp.setLink(newNode);
					newNode.setLink(null);
					//break;
				}
					
			}
			else if(temp!= null && temp.getData() <= val)
			{
				if(temp.getLink()!=null && temp.getLink().getData() > val)
				{
					helper = temp.getLink();
					temp.setLink(newNode);
					newNode.setLink(helper);
				}
				else if(temp.getLink() == null)
				{
					temp.setLink(newNode);
					newNode.setLink(null);
				}
				
			}
			temp = temp.getLink();
		}
	}
}
