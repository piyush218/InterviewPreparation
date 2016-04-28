package LinkedLists;

import java.util.Hashtable;

public class SingleLinkedList {

	protected Node start;
	protected Node end;//we keep a track of end so that we can avoid O(n) complexity when we have to place myNode at the end.
	public int size;//we keep a track of size so that we can avoid O(n) complexity when we have to place myNode at the end or delete.
	
	public SingleLinkedList()
	{
		start = null;
		end = null;
		size = 0;
	}
	
	
	public boolean isEmpty()
	{
		return start == null;
	}
	
	public void insertAtStart(int val)
	{
		Node myNode = new Node(val, null);
		size++;
		if(isEmpty())
		{
			start = myNode;
			start.setLink(null);
			end = start;
			end.setLink(null);
		}
		else
		{
			myNode.setLink(start);
			start = myNode;
		}
	}
	
	public void insertAtEnd(int val)
	{
		Node myNode = new Node(val, null);
		size++;
		if(isEmpty())
		{
			start = myNode;
			end = start;
			start.setLink(null);
		}
		else
		{
			end.setLink(myNode);
			myNode.setLink(null);
			end = myNode;
		}
	}
	
	public int getSize()
	{
		int count = 0;
		if(isEmpty())
		{
			return 0;
		}
		else
		{
			Node temp = start;
			while(temp!=null)
			{
				count++;
				temp = temp.getLink();
			}
			return count;
		}
		
	}
	
	public void insertAtPosition(int val, int pos)
	{
		Node myNode = new Node(val, null);
		size++;
		if(isEmpty())
		{
			start = myNode;
			end = start;
			end.setLink(null);
		}
		else
		{
			int i = 1;
			Node temp = start;
			while(i <= getSize())
			{
				if(i == pos-1)
				{
					myNode.setLink(temp.getLink());
					temp.setLink(myNode);
					break;
				}
				temp = temp.getLink();
				i++;
			}
			
		}
	}
	
	public void deleteAtPos(int pos)
	{
		if(isEmpty())
		{
			System.out.println("Sorry No elements to be deleted");
			return;
		}
		else
		{
			size--;
			int i = 1;
			Node temp = start;
			
			if(pos == 1)
			{
				//deleting the start node
				start = start.getLink();
				return;
			}
			
			else if(pos == getSize())
			{
				while(temp.getLink() != end)
				{
					temp = temp.getLink();
				}
				temp.setLink(null);
				end = temp;				
				
			}
			
			else // Delete any node other than the first and the last nodes.
			{
				while(i < getSize())
				{
					if(i == pos-1)
					{
						Node del = temp.getLink();
						temp.setLink(del.getLink());
						break;
					}
					temp = temp.getLink();
					i++;
				}
			}
		}
	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Sorry no list to be displayed");
		}
		else
		{
			Node temp = start;
			while(temp.getLink()!=null)
			{
				System.out.print(temp.getData() + " -> ");
				temp = temp.getLink();
			}
			System.out.println(temp.getData());
			
		}
	}

	public void deleteEntireList()
	{
		
		start = null;//grbage collector eats away the island of memory
		
	}
	
	public Node getPrev(Node n)
	{
		Node retNode = null;
		Node temp = start;
		if(n == start)
		{
			return start;
		}
		while(temp != null)
		{
			if(temp.getLink() == n)
			{
				retNode = temp;
				break;
			}	
			temp = temp.getLink();
		}
					
		return retNode;
	}
	
	public void removeDups() //with hash
	{
		if(isEmpty())//head==null
		{
			System.out.println("Sorry no list to be displayed");
		}
		else
		{
			Hashtable<Integer, Boolean> myTab = new Hashtable<Integer, Boolean>(); 
			Node temp = start;//Node prev = null;
			Node previousNode = null;
			while(temp != null)
			{
				System.out.println("Obtained " + temp.getData());
				if(!myTab.containsKey(temp.getData()))
				{
					System.out.println("Notpresent " + temp.getData());
					myTab.put(temp.getData(), true);
					previousNode = temp;
					temp = temp.getLink();//next
				}
				else
				{
					System.out.println("present " + temp.getData());
						previousNode.setLink(temp.getLink());//getNext
						temp = temp.getLink();
				}
				
			}
		}
		
	}
	
	public void removeDupWOHash() //without hash
	{
		if(isEmpty())//head==null
		{
			System.out.println("Sorry no list to be displayed");
			return;
		}
		else
		{
			Node temp = start;
			Node runner = temp.getLink();
			Node previousNode = null;
			while(temp!=null)
			{	
				previousNode = temp;
				runner = temp.getLink();
				while(runner!=null)
				{	
					if(temp.getData() == runner.getData())
					{
						previousNode.setLink(runner.getLink());
					}
					else{
						previousNode = previousNode.getLink();
					}
					runner = runner.getLink();
				}
				temp = temp.getLink();
			}
		}
	}
	
	public void reverseLL()
	{
		if(isEmpty())
		{
			System.out.println("Sorry no list to be displayed");
		}
		else
		{
			
			Node temp = start;
			Node result = null;
			Node next = null;
			
			while(temp!=null)
			{
				//System.out.println(temp.getData() + " -> ");
				next = temp.getLink();
				temp.setLink(result);
				result = temp;
				temp = next;
			}
			start = result;
				
		}
		
	}
	
	public int mFromLast(int m)
	{
		Node temp = start;
		Node runner =start;
		while(runner!=null)
		{
			if(m>0)
			{
				runner = runner.getLink();
				m--;
			}
			else
			{
				temp = temp.getLink();
				runner = runner.getLink();
			}
		}
		return temp.getData();
	}

	public Node ReverseRec(Node list)
{
    if (list == null) return null; 

    if (list.getLink() == null) return list;

    Node secondElem = list.getLink();
    list.setLink(null);

    // reverse everything from the second element on
    Node reverseRest = ReverseRec(secondElem);

    // then we join the two lists
    secondElem.setLink(list);

    return reverseRest;
}
	
	public void sort()
	{ //Does not work.....
		System.out.println("Sorting");
		Node temp = start;
		Node temp2 = temp;
		Node runner = temp.getLink();
		Node tempPrev = null;
		Node helper;
		while(runner.getLink() != null)
		{
			System.out.println("I  am in the first loop");
			System.out.println("hey");
			while(runner != null)
			{
				System.out.println("--------hey again");
				if(temp.getData() > runner.getData())
				{
					System.out.println("got into if");
					//swap both nodes
					if(temp == start)
					{
						System.out.println("head");
						runner = start;
						helper = runner.getLink();
						runner.setLink(temp);
						temp2.setLink(temp);
						temp.setLink(helper);
						tempPrev = runner;
					}
					else
					{
						System.out.println("middle");
						tempPrev.setLink(runner);
						tempPrev = runner;
						helper = runner.getLink();
						runner.setLink(temp);
						temp2.setLink(temp);
						temp.setLink(helper);
						
					}
				}
				System.out.println(runner.getData());
				System.out.println(temp.getData());
				runner = runner.getLink();
				temp2 = temp2.getLink();
			}
			tempPrev = temp;
			temp = temp.getLink();
			temp2 = temp;
			runner = temp.getLink();
			
		}
		while(start != null)
		{
			System.out.println(start.getData());
			start = start.getLink();
		}
	}
	public Node merge(Node merge1, Node merge2)
	{
		System.out.println("Merging L1 & L2");
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
