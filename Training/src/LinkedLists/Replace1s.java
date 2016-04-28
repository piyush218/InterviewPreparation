package LinkedLists;

import java.util.HashMap;
import java.util.Hashtable;

/*Having A List of int [1,1,1,3,1,2,1,1,4,1] 
Output needed [1,5,6,3,7,2,8,9,4,10] 
Note: Need not to change value of 3,2,4
 * */
public class Replace1s {

	public static void main(String[] args)
	{
		SingleLinkedList sll = new SingleLinkedList();
		sll.insertAtStart(1);
		sll.insertAtEnd(1);
		sll.insertAtEnd(1);
		sll.insertAtEnd(3);
		sll.insertAtEnd(1);
		sll.insertAtEnd(1);
		sll.insertAtEnd(4);
		sll.insertAtEnd(1);
		sll.insertAtEnd(2);
		sll.insertAtEnd(1);
		sll.display();
		//replace(sll);
		//sll.display();
		replaceNew(sll);
		sll.display();
		
	}

	private static void replaceNew(SingleLinkedList sll) {
		int max =0;
		Node temp = sll.start;
		while(temp != null)
		{
			if(max < temp.getData())
			{
				max = temp.getData();
			}
			temp = temp.getLink();
		}
		System.out.println();
		temp = sll.start;
		while(temp != null)
		{
			if(temp != sll.start && temp.getData() == 1)
			{
				max ++;
				temp.setData(max);
				continue;
			}
			
				temp = temp.getLink();
			
		}
	}

	private static void replace(SingleLinkedList sll) {
		Node temp = sll.start;
		//int val = 0;
		HashMap<Integer, Integer> myTab = new HashMap<Integer, Integer>();
		int max = 0;
		while(temp!=null)
		{
			if(temp.getData() > max)
			{
				max = temp.getData();
			}
			if(myTab.containsKey(temp.getData()))
			{
				myTab.put(temp.getData(), myTab.get(temp.getData())+1);
			}
			else
			myTab.put(temp.getData(), 1);
			temp = temp.getLink();
		}
		
		temp = sll.start;
		int c = myTab.get(1);
		boolean first = false;
		while(temp!=null)
		{
			if(temp.getData() == 1 && !first)
			{
				first = true;
				
			}
			else if(temp.getData()==1 && first)
			{
				max++;
				temp.setData(max);
			}
			
			temp = temp.getLink();
		}
	}
}
