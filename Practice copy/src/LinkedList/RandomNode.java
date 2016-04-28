package LinkedList;

import java.util.Random;

public class RandomNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListImplement myList = new LinkedListImplement();
		myList.addNodeAtEnd(10);
		myList.addNodeAtEnd(12);
		myList.addNodeAtEnd(14);
		myList.addNodeAtEnd(16);
		myList.addNodeAtEnd(18);
		myList.addNodeAtEnd(20);
		
		myList.display();
		for(int i =0; i<5; i++)
		System.out.println(randomNode(myList.getHead()));

	}
	
	public static int randomNode(Node head)
	{
		if(head == null)
			return 0;
		int result = head.getData();
		
		long a = Integer.MAX_VALUE;
		long c = 11;
		long b = System.nanoTime();
		Random random = new Random();
		random.setSeed(System.nanoTime());
		
		Node current = head;
		int n;
		for(n=2; current!=null; n++)
		{
			//System.out.println("n= " + 10*Math.random() % n);
			
			if (random.nextInt() % n == 0)
			{
				//System.out.println("n= " + Math.random() % n);
				result = current.getData();
			}
			
			current = current.getNext();
		}
		
		return result;	
	}

}
