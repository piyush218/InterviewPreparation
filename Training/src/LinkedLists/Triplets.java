package LinkedLists;
/*Given three linked lists, say a, b and c, find one node from each list such that the sum of the values of the nodes
 *  is equal to a given number. 
For example, if the three linked lists are 12->6->29, 23->5->8 and 90->20->59, and the given number is 101, 
the output should be triplet “6 5 90″.
 * */
//Approach: b has to be ascending order sorted and c has to descending order sorted
public class Triplets {

	public static void main(String[] args)
	{
		SingleLinkedList a = new SingleLinkedList();
		SingleLinkedList b = new SingleLinkedList();
		SingleLinkedList c = new SingleLinkedList();
		a.insertAtStart(12);
		a.insertAtEnd(6);
		a.insertAtEnd(29);
		b.insertAtStart(1);
		b.insertAtEnd(2);
		b.insertAtEnd(3);
		b.insertAtEnd(5);
		c.insertAtStart(90);
		c.insertAtEnd(59);
		c.insertAtEnd(20);
		System.out.println("LL a:");
		a.display();
		System.out.println("LL b:");
		b.display();
		System.out.println("LL c:");
		c.display();
		int sum = 101;
		findTriplet(a,b,c,sum);
	}

	private static void findTriplet(SingleLinkedList a, SingleLinkedList b,
			SingleLinkedList c, int sum) {
		Node tempa = a.start;
		Node tempb = b.start;//ascending order sorted
		Node tempc = c.start;//descending order sorted
		boolean found =false;
		int s=0;
		A:
		while(tempa != null)
		{
			tempb = b.start;
			tempc = c.start;
			
			while(tempb !=null && tempc!=null)
			{
					s = tempa.getData() + tempb.getData() + tempc.getData();
			
			if(s == sum)
			{
				found=true;
				System.out.println("Found Triplets as: " + tempa.getData()+", " + tempb.getData() +", "+ tempc.getData());	
				break A;
			}
			else if (s<sum)
			{
				tempb = tempb.getLink();
			}
			else if(s>sum)
			{
				tempc = tempc.getLink();
			}
			}

			tempa = tempa.getLink();
			
		}
		
		if(!found)
		{
			System.out.println("No such triplets...");
		}
	}
}
