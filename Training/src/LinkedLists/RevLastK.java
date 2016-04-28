package LinkedLists;
/*Reverse last 5 nodes of linkedlist. Please let me know if there is any better way. 
E.g. 
Input: 1,2,3,4,5,6,7 
Output: 1,2,7,6,5,4,3
 * */
public class RevLastK {

	public static void main(String[] args)
	{
		SingleLinkedList sll = new SingleLinkedList();
		sll.insertAtStart(1);
		sll.insertAtEnd(2);
		sll.insertAtEnd(3);
		sll.insertAtEnd(4);
		sll.insertAtEnd(5);
		sll.insertAtEnd(6);
		sll.insertAtEnd(7);
		sll.insertAtEnd(8);
		sll.insertAtEnd(9);
		//sll.display();
		Node temp2 = sll.start;
		Node temp3 = recReverse(temp2);
		while(temp3!= null)
		{
			System.out.println(temp3.data + " ");
			temp3 = temp3.getLink();
		}
		//sll.display();
		
	}

	private static void rev(SingleLinkedList sll, int n) {
	
		Node temp = sll.start;
		Node end, helper;
		int size = 0;
		while(temp.getLink() != null)
		{
			size++;
			temp=temp.getLink();
		}
		end = temp;
		temp = sll.start;
		size++;
		int i= size - n;
		while(i>1)
		{
			temp = temp.getLink();
			i--;
		}
		System.out.println(temp.getData());
		Node temp2 = temp.getLink();
		temp.setLink(null);
		Node head2 = recReverse(temp2);
		temp.setLink(head2);
		temp = sll.start;
		while(temp!=null)
		{
			System.out.println(temp.getData());
			temp = temp.getLink();
		}
		
		
	}

	private static Node recReverse(Node temp2) {
		if(temp2 == null) return null;
		if(temp2.getLink() == null) return temp2;
		
			Node rest = temp2.getLink();
			temp2.setLink(null);
			Node revHead = recReverse(rest);
			rest.setLink(temp2);
			Node temp3 = revHead;
			return revHead;
	}
	
	
}
/*practice:
 * 1->2->3->4->5->6->7->8
k=4
so traverse m-k nodes. (m-k)th.setNext = end
public void revLastK(Node start, int k )
{
    Node temp = start;
    int size = 0;
    while(temp != null)
    {
        size++;
        temp = temp.getNext();
    }
    int count = size - k;
    temp = start;
    while(count>1)
    {
        temp = temp.getNext();
        count--;
    }
    Node newHead = temp.getNext();
    temp.setNext(null);
    temp.setNext(reverse(newHead));
}

public Node reverse(Node newHead)
{
    if(newHead == null)
        return null;
       
    if(newHead.getNext == null)
        return newHead;
    
    Node rest = newHead.getNext();
    newHead.setNext(null);
    
    // reverse everything from second element onwards
    Node reverseRest = reverse(rest);
    
    //then join back all the elements but in reversed order
    rest.setNext(newHead);
    
    return reverseRest;
}
 * */
