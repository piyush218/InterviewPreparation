package LinkedList;

public class MergeSort {

	public static void main(String[] args)
	{
		LinkedListImplement myList = new LinkedListImplement();
		myList.addNodeAtEnd(5);
		myList.addNodeAtEnd(8);
		myList.addNodeAtEnd(2);
		myList.addNodeAtEnd(1);
		myList.addNodeAtEnd(4);
		myList.addNodeAtEnd(10);
		//myList.display();
		System.out.println("head => " + myList.getHead().getData());
		divide(myList.getHead());
		
		myList.display();
		
	}
	
	public static Node divide(Node head)
	{
		//check if the list is not null or single elemented
		if(head == null || head.getNext() == null)
		{
			return head;
		}
		//else divide the list into individual nodes
		Node temp = head;
		Node head1 = head;
		Node head2 = null; //this head is to be found
		
		//first count the no. of nodes:
		int count = 0;
		while(temp != null)
		{
			count++;
			temp = temp.getNext();
		}
		
		//find middle element and put temp back as head
		int mid = count/2;
		System.out.println("Size = " + count);
		temp = head;
		
		//count till mid and take the element next to mid as head2
		while(mid > 1)
		{
			temp = temp.getNext();
			mid--;
		}
		
		head2 = temp.getNext();
		System.out.println("got head1 as " + head1.getData());
		
		System.out.println("got head2 as " + head2.getData());
		//break the link between temp and head2 inorder to divide it completely
		temp.setNext(null);
		
		Node merged = merge(divide(head1), divide(head2));
		System.out.println("merged");
		return merged;
	}
	
	public static Node merge(Node head1, Node head2)
	{
		System.out.println("merging " + head1.getData() + " " + head2.getData());
		Node head = new Node();
		Node temp = head;
		Node left = head1;
		Node right = head2;
		while(left != null && right != null)
		{
			if(left.getData() <= right.getData())
			{
				temp.setNext(left);
				left = left.getNext();
			}
			else
			{
				temp.setNext(right);
				right = right.getNext();
			}
			
			temp = temp.getNext();
			
		}
		
		if(left != null)
		{
			temp.setNext(left);
		}
		if(right != null)
		{
			temp.setNext(right);
		}
		System.out.println("returning merged");
		return head.getNext();
	}
}
