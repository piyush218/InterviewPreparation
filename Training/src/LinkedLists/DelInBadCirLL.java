package LinkedLists;
//For deleting an element in bad Cir LL, 
//if it is head- delete normal, 
//if it is at loop start- we find the loop start and check if the node to be deleted is the same as that at 
//the loop start, then connect end's next to loopStart's next
public class DelInBadCirLL {

	public static void main(String[] args)
	{
		SingleLinkedList sll = new SingleLinkedList();//4,8,12,16,2->12
		Node n = new Node(4,null);
		Node m = new Node(12,new Node(16, null));
		Node l = new Node(2,m);
		m.getLink().setLink(l);;
		sll.start =n;
		n.setLink(new Node(8, m));
		System.out.println(l.getLink().getData());
		Node loopStart = findLoopStart(sll.start)[0];
		Node end = findLoopStart(sll.start)[1];
		del(16, loopStart, sll.start);
	}

	private static void del(int val, Node m, Node start) { // m=loopStart
		Node temp;
		if(start.getData() == val)
		{
			System.out.println("deletion at start");
			temp = start;
			start = start.getLink();
			temp.setLink(null);
		}
		else if (m.getData() == val)
		{
			System.out.println("deletion at loop start");
			temp = start;
			while(temp.getLink() != m) // reaching the end
			{
				temp = temp.getLink();
			}
			temp.setLink(m.getLink()); //setting end's next pointer to loopStart's next pointer
			Node newm = temp.getLink();
			m.setLink(null);
			while(temp.getLink()!=m)
			{
				temp = temp.getLink();
			}
			temp.setLink(newm);
			System.out.println("end is " + temp.getData() + " Newm is " + temp.getLink().getData());
		}
		else
		{
			temp = start;
			Node prev =null;
			while(temp!=null)
			{
				if(temp.getData()==val)
					break;
				prev =temp;
				temp = temp.getLink();
			}
			if(temp.getLink() != null && temp.getLink() != prev)
				prev.setLink(temp.getLink()); 
			else if(prev == start)
				prev.setLink(prev); // looped onto itself, the only single node left
			else
				prev.setLink(start);// set prev's next to start
			temp.setLink(null);
		}
	}

	private static Node[] findLoopStart(Node start) {
		Node temp = start;
		Node runner = temp.getLink();
		while(temp != runner){ //finding the node where runner and temp meet, which will be in the loop
			temp = temp.getLink();
			runner = runner.getLink().getLink();
		}
		temp =start;
		Node start2 = runner;
		int size1 =0, size2=0;
		//The SLL is virtually divided into 2 lists, on from start to runner's prev
		//And another from runner to loop start.
		
		while(temp != runner) // finding size of 1st list
		{ 
			size1++;
			temp = temp.getLink();
		}
		
		while(runner!=temp) // finding size of 2nd list
		{
			size2++;
			runner = runner.getLink();
		}
		
		int d=size1-size2;
		temp = start;
		runner =start2;
		
		
		Node end = null;
		while(temp!=runner)
		{
			if(d>0)
			{
				while(d != 0) // forwarding the longer list to make the number of elments in both same
				{
					temp = temp.getLink();
					d--;
				}
			}
			else if(d<0)
			{
				while(d != 0)
				{
					runner = runner.getLink();
					d++;
				}
			}
			else
			{	
				temp = temp.getLink();
				end =runner;
				runner = runner.getLink();
			}
		}
		
		System.out.println("Reached " + temp.getData() + " Runner " + runner.getData());
		
		Node[] r = {temp,end};
		return r;
	}
	
}
