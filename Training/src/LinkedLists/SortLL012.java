package LinkedLists;

public class SortLL012 {

	public static void main(String[] args)
	{
		SingleLinkedList sll = new SingleLinkedList();
		sll.insertAtStart(2);
		sll.insertAtEnd(0);
		sll.insertAtEnd(2);
		sll.insertAtEnd(0);
		sll.insertAtEnd(1);
		sll.insertAtEnd(2);
		sll.insertAtEnd(0);
		sll.insertAtEnd(2);
		sll.insertAtEnd(0);
		sll.insertAtEnd(1);
		sll.insertAtEnd(0);
		sll.display();
		//sort(sll.start);
		sort2(sll.start);
		sll.display();
	}

	private static void sort2(Node start) //works
{
//		System.out.println("Sorting");
		Node temp = start;
		int[] count = {0,0,0};
		while(temp!=null)//counting the number of each 0, 1, 2 and putting them in count[]
		{
			count[temp.getData()]++;
			temp = temp.getLink();
		}
//		System.out.println("No. of 0s: " + count[0]);
//		System.out.println("No. of 1s: " + count[1]);
//		System.out.println("No. of 2s: " + count[2]);
		temp = start;
		while(temp!=null)
		{
			while(count[0]!=0 && temp!=null)//placing 0s
			{
				temp.setData(0);
				temp = temp.getLink();
				count[0]--;
			}
			
			while(count[1]!=0 && temp!=null)//placing 1s
			{
				temp.setData(1);
				temp = temp.getLink();
				count[1]--;
			}
			while(count[2]!=0 && temp!=null)//placing 2s
			{
				temp.setData(2);
				temp = temp.getLink();
				count[2]--;
			}
		}
	}

	private static void sort(Node start) //doesnt work
	{
		Node temp = start;
		Node helper, prev = null, end;
		while(temp.getLink()!=null)
		{
			temp = temp.getLink();
		}
		Node end1 = temp;
		end = temp;
		System.out.println("End is: " + end.getData());
		temp = start;
		prev =temp;
		while(temp!=end1.getLink())
		{
			if(temp.getData() == 2)
			{
				System.out.println("found: " + temp.getData());
				if(prev == temp)
				{
					helper = temp.getLink();
					temp.setLink(null);
					end.setLink(temp);
					start = helper;
					prev = helper;
					temp = helper;
					System.out.println("----temp now is: " + temp.getData());
				}
				else
				{
					System.out.println("entered else");
					helper = temp.getLink();
					System.out.println("helper is: "+ helper.getData());
					temp.setLink(null);
					end.setLink(temp);
					prev.setLink(helper);
					temp = helper;
					end = end.getLink();
					System.out.println("temp now is: " + temp.getData());
				}
			}
			else if(temp.getData() == 0)
			{
				System.out.println("found: " + temp.getData());
				if(prev==temp)
				{
					prev = temp;
					temp = temp.getLink();
				}
				else
				{
					helper = temp.getLink();
					temp.setLink(start);
					prev.setLink(helper);
					start = temp;
					temp = helper;
				}
			}
			else if(temp.getData() == 1){
			prev = temp;
			temp=temp.getLink();
			}
		}
	}
}
