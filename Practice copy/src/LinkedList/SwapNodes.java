package LinkedList;
//Swap nodes in a linked list without swapping data
public class SwapNodes {

	static LinkedListImplement myList = new LinkedListImplement();
	public static void main(String[] args)
	{
		
		myList.addNodeAtEnd(5);
		myList.addNodeAtEnd(8);
		myList.addNodeAtEnd(2);
		myList.addNodeAtEnd(1);
		myList.addNodeAtEnd(4);
		myList.addNodeAtEnd(10);
		myList.display();
		swap(myList.getHead(), 5, 8);
		System.out.println(myList.getHead().getData());
		myList.display();
	}
	
	public static Node swap(Node head, int val1, int val2)
	{
		if(head == null || head.getNext() == null || val1 == val2)
		{
			System.out.println("The values are inappropraite!");
			return head;
		}
		
		Node temp1,temp2, prev1 = null, prev2 = null;
		temp1 = head;
		temp2 = head;
		Boolean flag1 = false, flag2 = false;
		
		while(temp1 != null && temp2 != null)
		{
			if(!flag1 && (temp1.getData() == val1 || temp1.getData() == val2) && (val1 != val2))
			{
				flag1 = true;
				System.out.println("temp1 found as: " + temp1.getData());
				temp2 = temp2.getNext();
			}
			else if(flag1 && (temp2.getData() == val1 || temp2.getData() == val2))
			{
				flag2 = true;
				break;
			}
			else if(flag1 && !flag2)
			{
				prev2 = temp2;
				temp2 = temp2.getNext();
			}
			else if(!flag1 && !flag2 )
			{
				prev1 = temp1;
				temp1 = temp1.getNext();
				prev2 = temp2;
				temp2 = temp2.getNext();
			}
			
		}
		if(temp1== null || temp2 == null)
		{
			System.out.println("The values are inappropraite!");
			return head;
		}
		
		//We have found temp1 and temp2
		//now let exchange them
		
		Node helper;
		if(temp1 == head && temp1.getNext() != temp2)//temp1=head
		{
			prev2.setNext(temp1);
			helper = temp1.getNext();
			temp1.setNext(temp2.getNext());
			temp2.setNext(helper);
			myList.setHead(temp2);
			
		}
		else if(temp1 == head && temp1.getNext() == temp2)//temp1=head & temp1 and temp2 are neighbours
		{
			temp1.setNext(temp2.getNext());
			temp2.setNext(temp1);
			myList.setHead(temp2);
		}
		else if(temp1.getNext() == temp2)//temp1 and temp2 are neighbours
		{
			prev1.setNext(temp2);
			temp1.setNext(temp2.getNext());
			temp2.setNext(temp1);
		}
		else
		{
			prev1.setNext(temp2);
			prev2.setNext(temp1);
			helper = temp1.getNext();
			temp1.setNext(temp2.getNext());
			temp2.setNext(helper);
		}
		
		return head;
	}
}
