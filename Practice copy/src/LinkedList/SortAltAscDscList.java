/*Sort a linked list that is sorted alternating ascending and descending orders?
 * Input List:   10->40->53->30->67->12->89->NULL
   Output List:  10->12->30->43->53->67->89->NULL
 * 
 * */
package LinkedList;

import java.util.ArrayList;

public class SortAltAscDscList {
	
	public static void main(String[] args)
	{
		LinkedListImplement myList = new LinkedListImplement();
		myList.addNodeAtEnd(10);
		myList.addNodeAtEnd(40);
		myList.addNodeAtEnd(53);
		myList.addNodeAtEnd(30);
		myList.addNodeAtEnd(67);
		myList.addNodeAtEnd(12);
		myList.addNodeAtEnd(89);
		myList.display();
		
		sort(myList.getHead());
		
	}
	
	public static void sort(Node head)
	{
		ArrayList<Node> header = new ArrayList<Node>();
		
		//divide the list on the basis of ascends and descends
		Node temp = head.getNext();
		Node prev = head;
		while(temp != null)
		{
			if(prev.getData() > temp.getData())
			{
				header.add(temp);
				prev.setNext(null);
				
			}
			
			prev = temp;
			temp = temp.getNext();
			
		}
		int divisions = header.size();
		Node newHead = new Node();
		Node newTemp = newHead;
		int i=0;
		while(i < divisions)
		{
			
		}
	}

}
