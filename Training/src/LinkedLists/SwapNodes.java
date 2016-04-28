package LinkedLists;
/*1. Normal case
 * 2. Adjacent nodes
 * 3. first and next nodes
 * 4. last and second last nodes
 * */
public class SwapNodes {

	public static void main(String[] args)
	{
		SingleLinkedList sll = new SingleLinkedList();
		sll.insertAtStart(10);
		sll.insertAtEnd(20);
		sll.insertAtEnd(30);
		sll.insertAtEnd(40);
		sll.insertAtEnd(50);
		sll.insertAtEnd(60);
		sll.display();
		int a = 60;
		int b =20;
		if (a>b) {
			a = a + b;
			b = a - b;
			a = a - b;
		}
		swap(a,b,sll.start, sll);
		sll.display();
	}

	private static void swap(int val1, int val2, Node head, SingleLinkedList sll) {
		Node temp1 = head;
		Node temp2 = head;
		Node prev1=null, next1=temp1.getLink(), prev2=null, next2=temp2.getLink();
		
		while(temp1 != null)
		{
			if(temp1.getData() == val1)
			{
				break;
			}
			prev1 = temp1;
			temp1 = temp1.getLink();
			if(temp1 != null)
			
				next1 = temp1.getLink();
		}
		
		while(temp2 != null)
		{
			if(temp2.getData() == val2)
			{
				break;
			}
			prev2 = temp2;
			temp2 = temp2.getLink();
			if(temp2 != null)
				next2 = temp2.getLink();
		}
		
		//System.out.println(prev1.getData() + " " + next1.getData());
		//System.out.println(prev2.getData() + " " + next2.getData());
		if(temp1 == null || temp2==null)
		{
			System.out.println("Value not found");
		}
		else if(temp1==head)
		{
			System.out.println(next1.getData());
			temp2.setLink(next1);
			temp1.setLink(next2);
			next1.setLink(temp1);
			sll.start = temp2;
		}
		else if(next2 == null)
		{
			temp1.setLink(null);
			prev1.setLink(temp2);
			temp2.setLink(next1);
			prev2.setLink(temp1);
		}
		else	
		{
			prev1.setLink(temp2);
			temp2.setLink(next1);
			temp1.setLink(next2);
			next1.setLink(temp1);
					
		}
			
		
	}
}
