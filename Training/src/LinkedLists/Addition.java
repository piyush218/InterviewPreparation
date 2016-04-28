package LinkedLists;

public class Addition {

	int carry = 0 ;
	public static void main(String[] args)
	{
		SingleLinkedList sll1 = new SingleLinkedList();
		SingleLinkedList sll2 = new SingleLinkedList();
		sll1.insertAtStart(1);
		sll1.insertAtEnd(2);
		sll1.insertAtEnd(3);
		sll1.insertAtEnd(4);
		sll2.insertAtStart(5);
		sll2.insertAtEnd(2);
		sll2.insertAtEnd(8);
		//new Addition().add(sll1.start, sll2.start);
		Node temp = sll1.start;
		while(temp != null)
		{
			System.out.print(temp.getData() + " ");
			temp = temp.getLink();
		}
		System.out.println();
		temp = sll2.start;
		while(temp != null)
		{
			System.out.print(temp.getData() + " ");
			temp = temp.getLink();
		}
		System.out.println();
		temp = sll1.start;
		new Addition().adjustment(sll1, sll2);
		while(temp != null)
		{
			System.out.print(temp.getData() + " ");
			temp = temp.getLink();
		}
	}

	private void adjustment(SingleLinkedList sll1, SingleLinkedList sll2) {
		int size1 = sll1.getSize();
		int size2 = sll2.getSize();
		int diff = size1 - size2;
		Node previous1=null, temp1 = sll1.start;
		Node previous2=null, temp2 = sll2.start;
		while(diff > 0)
		{
			previous1 = temp1;
			temp1 = temp1.getLink();
			diff--;
		}
		while(diff < 0)
		{
			previous2 = temp2;
			temp2 = temp2.getLink();
			diff++;
		}
		
		new Addition().add(temp1, temp2);
		if(carry>0)
		{
			if(previous1!=null)
			{
				previous1.setData(previous1.getData()+carry);
			}
			else if(previous2!=null)
			{
				previous2.setData(previous2.getData()+carry);
			} 
		}
		
	}

	
	private void add(Node start1, Node start2) {
		if(start1 == null && start2==null && carry ==0)
		{
			return;
		}
//		else if(start1 == null && start2!=null)
//		{
//			start1 = new Node(0, null);
//		}
//		else if(start2 == null && start1!=null)
//		{
//			start2 = new Node(0,null);
//		}
		else if(start2 == null && start1==null)
		{
			return;
		}
		add(start1.getLink(), start2.getLink());
		
		int sum = start1.getData() + start2.getData() + carry ;
		start1.setData(sum);
		if(sum>=10)
		{
			start1.setData(sum%10);
			carry = sum/10;
		}
		else
			carry = 0;
		
	}
	
}
