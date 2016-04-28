package LinkedLists;
//Please implement a function to merge two sorted lists into a single sorted list.

public class MergeLL {

	public static void main(String[] args)
	{
	SingleLinkedList l1 = new SingleLinkedList();
	SingleLinkedList l2 = new SingleLinkedList();
	SingleLinkedList m =new SingleLinkedList();
	l1.insertAtStart(5);
	l1.insertAtEnd(8);
	l1.insertAtEnd(16);
	l1.insertAtEnd(20);
	l1.insertAtEnd(24);
	
	l2.insertAtStart(2);
	l2.insertAtEnd(10);
	l2.insertAtEnd(12);
	l2.insertAtEnd(22);
	l2.insertAtEnd(28);
	m.start = m.merge(l1.start, l2.start);
	m.display();
	
	}
	
}
