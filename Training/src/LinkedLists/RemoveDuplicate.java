package LinkedLists;
/*Write code to remove duplicates from an unsorted linked list.
FOLLOW UP
How would you solve this problem if a temporary buffer is not allowed?
 * */
public class RemoveDuplicate {
	
	public static void main(String[] args)
	{
		SingleLinkedList sll = new SingleLinkedList();
		sll.insertAtStart(2);
		sll.insertAtEnd(3);
		sll.insertAtEnd(4);
		sll.insertAtEnd(5);
		sll.insertAtEnd(2);
		sll.insertAtEnd(4);
		sll.insertAtEnd(4);
		sll.insertAtEnd(4);
		sll.display();
		//sll.removeDups();
		//sll.display();
		sll.removeDupWOHash();
		sll.display();
	}
	
}
