package Chapter2LL;

import LinkedList.LinkedListImplement;
import LinkedList.Node;
// The numbers are in reverse order
public class Addition {

	public static void main(String[] args)
	{
		LinkedListImplement l1 = new LinkedListImplement();
		l1.addNodeAtStart(1);
		l1.addNodeAtEnd(2);
		l1.addNodeAtEnd(3);
		LinkedListImplement l2 = new LinkedListImplement();
		l2.addNodeAtStart(1);
		l2.addNodeAtEnd(2);
		l2.addNodeAtEnd(8);
		l1.display();
		l2.display();
		addLL(l1.getHead(), l2.getHead());
	}

	private static void addLL(Node head1, Node head2) {
		// TODO Auto-generated method stub
		LinkedListImplement result = new LinkedListImplement();
		Node fakeHead = new Node();
		Node temp = fakeHead;
		int carry = 0, helper;
		Node temp1 = head1;
		Node temp2 = head2;
		int sum = 0;
		while(temp1!= null && temp2!=null)
		{
			sum = temp1.getData() + temp2.getData() + carry;
			Node newNode = new Node();
			newNode.setData(sum%10);
			temp.setNext(newNode);
			
			if(sum > 9)
				carry = ((sum%100) - (sum%10))/10;
			else
				carry = 0;
			
			temp1 = temp1.getNext();
			temp2 = temp2.getNext();
			temp = temp.getNext();
			
		}
		
		if(temp1 != null)
		{
			temp1.setData(temp1.getData() + carry);
			temp.setNext(temp1);
			carry = 0;
			
		}
		else if(temp2 != null)
		{
			temp2.setData(temp2.getData() + carry);
			temp.setNext(temp2);
			carry = 0;
		}
		else if(temp1==null && temp2== null && carry !=0)
		{
			Node newNode = new Node();
			newNode.setData(carry);
			newNode.setNext(null);
			temp.setNext(newNode); 
		}
		System.out.println("Result is.....");
		temp = fakeHead.getNext();
		while(temp.getNext() != null)
		{
			System.out.print(temp.getData() + " -> ");
			temp = temp.getNext();
		}
		System.out.println(temp.getData());
	}
}
