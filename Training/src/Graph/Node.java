package Graph;

public class Node {

		private int data;
		private Node next;
		
		public Node()
		{
			data = 0;
			next = null;
		}
		
		public Node(int d, Node n)
		{
			data = d;
			next = n;
		}
		
		public void setNext(Node n)
		{
			next = n;
		}
		
		public void setData(int d)
		{
			data = d;
		}
		
		public Node getNext()
		{
			return next;
		}
		
		public int getData()
		{
			return data;
		}
		

	}
