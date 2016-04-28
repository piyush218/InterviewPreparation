package LinkedLists;

import java.util.Stack;

public class RevReadLL {

	public static void main(String[] args)
	{
		SingleLinkedList sll = new SingleLinkedList();
		sll.insertAtStart(1);
		sll.insertAtEnd(2);
		sll.insertAtEnd(3);
		sll.insertAtEnd(4);
		sll.insertAtEnd(5);
		sll.insertAtEnd(6);
		//reverseRead(sll);
		reverseReadRecursive(sll.start);
	}

	private static void reverseReadRecursive(Node start) {
		if(start == null)
		return;
		else
			reverseReadRecursive(start.getLink());
		System.out.println(start.getData());
	}

	private static void reverseRead(SingleLinkedList sll) {
		Stack<Integer> values = new Stack<Integer>();
		Node temp = sll.start;
		while(temp != null)
		{
			values.push(temp.getData());
			temp = temp.getLink();
		}
		while(!values.isEmpty())
		{
			System.out.println(values.pop());
		}
	}
}
