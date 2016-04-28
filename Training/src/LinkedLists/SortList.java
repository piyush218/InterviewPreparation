package LinkedLists;

public class SortList {

	public static void main(String[] args)
	{
		SingleLinkedList myList = new SingleLinkedList();
		System.out.println("Welcome");
		myList.insertAtStart(4);
		myList.insertAtEnd(1);
		myList.insertAtEnd(12);
		myList.insertAtEnd(6);
		myList.insertAtEnd(5);
		myList.insertAtEnd(2);
		
		myList.sort();
	}
}
