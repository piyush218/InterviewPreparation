package LinkedList;

public class SepOddEvenSorted {
	static LinkedListImplement odd = new LinkedListImplement();
	static LinkedListImplement even = new LinkedListImplement();
	
	public static void main(String[] args)
	{
		LinkedListImplement myList = new LinkedListImplement();
		myList.addNodeAtStart(12);
		myList.addNodeAtEnd(1);
		myList.addNodeAtEnd(3);
		myList.addNodeAtEnd(4);
		myList.addNodeAtEnd(10);
		myList.addNodeAtEnd(2);
		myList.addNodeAtEnd(25);
		myList.addNodeAtEnd(20);
		myList.addNodeAtEnd(21);
		
		divideSort(myList.getHead());
	}

	private static void divideSort(Node head) {
		Node node1 = new Node();
		Node node2 = new Node();
		
		
		
		Node temp = head;
		Node next = temp.getNext();
		
		while(temp != null)
		{
			next = temp.getNext();
			temp.setNext(null);
			
			
				System.out.println("* " + temp.getData());
				sortedInsert(temp);
			
			temp = next;
		}
		
		System.out.println("Odd list: ");
		Node tempOdd = odd.getHead();
		Node tempEven = even.getHead();
		
		while(tempOdd != null)
		{
			System.out.println(tempOdd.getData());
			tempOdd = tempOdd.getNext();
		}
		
		System.out.println("Even list: ");
		while(tempEven != null)
		{
			System.out.println(tempEven.getData());
			tempEven = tempEven.getNext();
		}
		
	}

	private static void sortedInsert(Node temp) {
		// TODO Auto-generated method stub
		LinkedListImplement sepList;
		if(temp.getData()%2 == 0)
			sepList = even;
		else
			sepList = odd;
			
		if(sepList.getHead() == null)
			{
			System.out.println("inserting at head " + temp.getData());
				sepList.setHead(temp);
				return;
			}
		System.out.println("inserting later " + temp.getData());
		Node temp1 = sepList.getHead();
		Node next1 = temp1.getNext();
		while(temp1 != null)
		{
			System.out.println("got " + temp.getData());

			next1 = temp1.getNext();
			if(temp.getData() >= temp1.getData() && next1 != null &&temp.getData() <= next1.getData()){
				System.out.println("inserting " + temp.getData());
				temp1.setNext(temp);
				temp.setNext(next1);
				return;
			}
			temp1 = temp1.getNext();
		}
		temp1.setNext(temp);
		temp.setNext(null);
		
	}

}
