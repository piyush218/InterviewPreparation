package Chapter2LL;

import java.util.Stack;

import LinkedList.LinkedListImplement;
import LinkedList.Node;

public class PalindromLL {

	static LinkedListImplement ll = new LinkedListImplement();
	
	public static void main(String[] args)
	{
		ll.addNodeAtStart(1);
		ll.addNodeAtStart(2);
		ll.addNodeAtStart(3);
		//ll.addNodeAtStart(3);
		ll.addNodeAtStart(2);
		ll.addNodeAtStart(1);
		ll.display();
		System.out.println(isPalinWithStack(ll.getHead()));
	}

	private static boolean isPalinWithStack(Node head) {
		// TODO Auto-generated method stub
		boolean palin = true;
		Stack<Integer> s = new Stack<>();
		int size = 0;
		Node temp = head;
		while(temp != null)
		{
			size++;
			temp = temp.getNext();
			
		}
		System.out.println(size);
		int mid = size/2;
		System.out.println(mid);
		
		temp = head;
		while(mid > 1)
		{
			temp = temp.getNext();
			mid--;
		}
		Node middle = temp;
		System.out.println("middle: " + middle.getData());
		
		temp = head;
		while(temp != middle.getNext())
		{
			s.add(temp.getData());
			temp = temp.getNext();
		}
		
		Node temp2;
		if(size%2 != 0)
		{
			System.out.println("hi");
			temp2 = middle.getNext().getNext();
		}
		else
		{
			temp2 = middle.getNext();
		}
		System.out.println(s);
		System.out.println("temp2: " + temp2.getData());
		int helper;
		while(temp2!= null)
		{
			helper = s.pop();
			System.out.println("checking: " + helper + " -> " + temp2.getData());
			if(temp2.getData() != helper)
				{
				System.out.println("help: " + helper + "->" + temp2.getData());
					return false;
				}
			temp2 = temp2.getNext();
		}
		return palin;
	}
	
}
