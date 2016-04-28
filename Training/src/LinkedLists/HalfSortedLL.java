package LinkedLists;
/*2.Given an integer linked list of which both first half and second half are sorted independently.
 *  Write a function to merge the two parts to create one single sorted linked list in place [do not use any extra space]. 
 *  eg: Input: List: 1->2->3->4->5->1->2; Output: 1->1->2->2->3->4->5 
 * */
public class HalfSortedLL {

	public static void main(String[] args)
	{
		SingleLinkedList sll = new SingleLinkedList();
		sll.insertAtStart(1);
		sll.insertAtEnd(2);
		sll.insertAtEnd(3);
		sll.insertAtEnd(4);
		sll.insertAtEnd(6);
		sll.insertAtEnd(1);
		sll.insertAtEnd(5);
		sll.insertAtEnd(8);
		sort(sll.start);
		sll.display();
		
	}

	private static void sort(Node start) {
		Node temp = start;
		while(temp.getLink()!=null)
		{
			if(temp.getData() > temp.getLink().getData())
			{
				break;
			}
			temp = temp.getLink();
		}
		Node start2 = temp.getLink();
		temp.setLink(null);
		
		SingleLinkedList s1 = new SingleLinkedList();
		SingleLinkedList s2 = new SingleLinkedList();
		s1.start=start;
		s2.start= start2;
		s1.display();
		s2.display();
		start = merge(start,start2);
	}

	private static Node merge(Node start, Node start2) 
	{
		Node head = new Node();
		Node temp = head;
		Node left= start;
		Node right =start2;
		while(left!=null && right!=null)
		{
			if(left.getData() <=  right.getData())
			{
				temp.setLink(left);
				left = left.getLink();
			}
			else
			{
				temp.setLink(right);
				right = right.getLink();
			}
			temp = temp.getLink();
		}
		if(left!=null)
		{
			temp.setLink(left);
		}
		if(right!=null)
		{
			temp.setLink(right);
		}
		return temp.getLink();
	}
}
