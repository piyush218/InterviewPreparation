package PracticeSet;

public class NodeLL {
	
	protected int data;
	protected NodeLL next;
	protected NodeLL arbiter;
	
	public NodeLL()
	{
		data =0;
		next = null;
		arbiter = null;
	}
	public NodeLL(int d, NodeLL n, NodeLL a)
	{
		data = d;
		next = n;
		arbiter = a;
	}
	public void setData(int d)
	{
		data = d;
	}
	public void setNext(NodeLL n)
	{
		next = n;
	}
	public void setArbiter(NodeLL a)
	{
		arbiter = a;
	}
	public int getData()
	{
		return data;
	}
	public NodeLL getNext()
	{
		return next;
	}
	public NodeLL getArbiter()
	{
		return arbiter;
	}
}
