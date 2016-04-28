package LinkedLists;

public class MergeSort {

	public static void main(String[] args)
	{
		SingleLinkedList sll1 = new SingleLinkedList();
		sll1.insertAtStart(4);
		sll1.insertAtEnd(8);
		sll1.insertAtEnd(20);
		sll1.insertAtEnd(43);
		sll1.insertAtEnd(2);
		sll1.insertAtEnd(5);
		sll1.insertAtEnd(12);
		sll1.insertAtEnd(90);
		sll1.display();
		sll1.start = MergeSort.mergeSort(sll1.start);
		sll1.display();

	}

	private static Node mergeSort(Node n) {
		if(n==null || n.getLink()==null)
		{
			return n;
		}
		Node temp = n;
		Node h1 = n;
		Node h2 = null;
		int size = 0;
		while(temp!=null)//finding size of the array
		{
			size++;
			temp = temp.getLink();
		}
		int mid = size/2;//finding mid element
		temp = n;
		while(mid>1 ) // reaching mid.next which will be given into h2
		{
			temp = temp.getLink();
			mid--;
		}
		h2 = temp.getLink();
		temp.setLink(null);//actual splitting
		
		Node merged = merge(mergeSort(h1), mergeSort(h2));
		
		return merged;
		
	}

	private static Node merge(Node merge1, Node merge2) {
		Node head = new Node();
		Node temp = head;
		Node left= merge1;
		Node right =merge2;
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
		
		return head.getLink();
	}
}
