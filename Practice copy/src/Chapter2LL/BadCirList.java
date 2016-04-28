package Chapter2LL;

import LinkedList.Node;

public class BadCirList {
	
	public static void main(String[] args)
	{
		Node a = new Node();
		Node b = new Node();
		Node c = new Node();
		Node d = new Node();
		Node e = new Node();
		Node f = new Node();
		Node g = new Node();
		Node h = new Node();
		Node i = new Node();
		Node j = new Node();
		Node k = new Node();
		Node l = new Node();
		a.setData(11);
		b.setData(12);
		c.setData(13);
		d.setData(14);
		e.setData(15);
		f.setData(16);
		g.setData(17);
		h.setData(18);
		i.setData(19);
		j.setData(20);
		k.setData(21);
		l.setData(22);
		
		Node head = a;
		
		a.setNext(b);
		b.setNext(c);
		c.setNext(d);
		d.setNext(e);
		e.setNext(f);
		f.setNext(g);
		g.setNext(h);
		h.setNext(i);
		i.setNext(j);
		j.setNext(k);
		k.setNext(l);
		l.setNext(f);
		
		System.out.println(findLoopStart(head).getData());
		
		
	}

	private static Node findLoopStart(Node head) {
		// TODO Auto-generated method stub
		if(head == null || head.getNext() == null)
			return head;
		
		Node temp = head;
		Node runner =  temp.getNext();
		
		while(temp != runner)
		{
			temp = temp.getNext();
			runner = runner.getNext().getNext();
		}
		
		runner = runner.getNext();
		temp.setNext(null);
		temp = head;
		Node temp2 = runner;
		
		//find the size difference between the temp LL and runner LL
		
		int size1 = 0, size2 = 0;
		while(temp != null)
		{
			size1++;
			temp = temp.getNext();
		}
		while(temp2 != null)
		{
			size2++;
			temp2= temp2.getNext();
		}
		
		int diff = size1 - size2;
		temp=head;
		temp2 =runner;
		
		while(diff < 0)
		{
			temp2 = temp2.getNext();
		}
		while(diff > 0)
		{
			temp = temp.getNext();
		}
		
		
		//now both the lls have same number of nodes
		
		while(temp != temp2)
		{
			temp = temp.getNext();
			temp2 = temp2.getNext();
		}
		
		return temp;
	}
	
	

}
