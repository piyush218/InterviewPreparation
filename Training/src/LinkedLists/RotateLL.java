package LinkedLists;
/*Given a singly linked list, rotate the linked list counter-clockwise by k nodes. Where k is a given positive integer. 
 * For example, if the given linked list is 10->20->30->40->50->60 and k is 4, the list should be modified to 
 * 50->60->10->20->30->40. Assume that k is smaller than the count of nodes in linked list.
 * */
public class RotateLL {

	public static void main(String[] arg)
	{
		SingleLinkedList sll = new SingleLinkedList();
		int n = 8;
		sll.insertAtStart(1);
		sll.insertAtEnd(2);
		sll.insertAtEnd(3);
		sll.insertAtEnd(4);
		sll.insertAtEnd(5);
		sll.insertAtEnd(6);
		sll.display();
		rotate(sll, n);
		sll.display();
	}

	private static void rotate(SingleLinkedList sll, int n) {
		int size = 0;
		Node temp = sll.start;
		while(temp.getLink() != null)// grab the end and size of SLL
		{
			size++;
			temp=temp.getLink();
		}
		size++;
		Node end =temp;
		temp = sll.start;
		n = n%size; //jus confirming is n is greater than size, then reduce it to its modulus.
		if(n<size)//
		{
			while(n>1)
			{
				temp = temp.getLink();
				n--;
			}
			end.setLink(sll.start);
			sll.start = temp.getLink();
			temp.setLink(null);
		}
		
		
	}
	
}
/*practice:
 * 1->2->3->4->5->6->7->8

public Node rotateLastK(Node start, int k)
{
Node temp = start;
int size = 0;
while(temp.getNext()!=null)//getting size and end of SLL
{
    size++;
    temp = temp.getNext();
}
size++;//counting the last node as well
Node end = temp;
temp = start;// reinitializing temp
k = k % size; //making sure that k is less than size, if not take modulus, which will b equivalent to one full n-times rotation of list.
while(k>1) traversing to find the new end
{
    temp = temp.getNext();
    k--;
}
Node newEnd = temp;
Node newStart = temp.getNext();
newEnd.setNext(null);
end.setNext(start);
start = newStart;

return start;
}
 * */
