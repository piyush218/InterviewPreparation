package Chapter2LL;

import LinkedList.LinkedListImplement;
import LinkedList.Node;

public class PartitionLL {

	static LinkedListImplement ll = new LinkedListImplement();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ll.addNodeAtStart(14);
		ll.addNodeAtStart(19);
		ll.addNodeAtStart(18);
		ll.addNodeAtStart(28);
		ll.addNodeAtStart(26);
		ll.addNodeAtStart(2);
		ll.addNodeAtStart(8);
		ll.addNodeAtStart(12);
		ll.addNodeAtStart(24);
		ll.addNodeAtStart(21);
		ll.display();
		partiton(21, ll.getHead());
		ll.display();
	}

	private static void partiton(int sel, Node head) {
		// TODO Auto-generated method stub
		Node selNode = head, head2 = new Node();
		Node headL = new Node(), tempL = headL;
		Node headR = new Node(), tempR = headR;
		Node prev =head;
		while(selNode != null)
		{
			//find the node selected
			if(selNode.getData() == sel)
			{
				break;
			}
			prev = selNode;
			selNode = selNode.getNext();
			
		}
		
		if(selNode == null)
		{
			System.out.println("Bad value selected");
			return;
		}
		else if(selNode == head)
		{
			head = head.getNext();
			selNode.setNext(null);
		}
		else 
		{
			prev.setNext(selNode.getNext());
			selNode.setNext(null);
		}
		
		Node temp = head;
		
		while(temp != null)
		{
			if(temp.getData() <= sel && temp != selNode)
			{
				tempL.setNext(temp);
				tempL = tempL.getNext();
			}
			else if(temp.getData() > sel)
			{
				tempR.setNext(temp);
				tempR = tempR.getNext();
			}
			prev = temp;
			temp = temp.getNext();
			prev.setNext(null);
		}
		Node temp1 = headL.getNext();
		Node temp2 = headR.getNext();
		System.out.println("-----------------------------");
		while(temp1 != null)
		{
			System.out.print(temp1.getData() + " -> ");
			temp1 = temp1.getNext();
		}
		System.out.println();
		while(temp2 != null)
		{
			System.out.print(temp2.getData() + " -> ");
			temp2 = temp2.getNext();
		}
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println(selNode.getData());
		//merge the three
		tempL.setNext(selNode);
		selNode.setNext(headR.getNext());
		
		temp = headL.getNext();
		System.out.println("*****Got it******");
		while(temp!= null)
		{
			System.out.print(temp.getData() + " -> ");
			temp = temp.getNext();
		}
		
		System.out.println();
		System.out.println("*****Got it******");
		
	}

}
