package LinkedLists;
//Implement an algorithm to find the nth to last element of a singly linked list.
import java.*;
public class MthToLast {

	public static void main(String[] args)
	{
		SingleLinkedList sll = new SingleLinkedList();
		sll.insertAtStart(0);
		sll.insertAtEnd(3);
		sll.insertAtEnd(6);
		sll.insertAtEnd(1);
		sll.insertAtEnd(9);
		sll.insertAtEnd(2);
		sll.insertAtEnd(4);
		sll.insertAtEnd(5);
		sll.insertAtEnd(7);
		System.out.println(sll.mFromLast(3));
				
	}
}
