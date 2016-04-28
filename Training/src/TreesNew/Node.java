package TreesNew;

public class Node {

	protected int data;
	protected Node right;
	protected Node left;
	
	public Node()
	{
		data = 0;
		right = null;
		left =null;
	}
	public Node(int d, Node l, Node r)
	{
		data = d;
		right =r;
		left = l;
	}
	public void setRight(Node r)
	{
		right = r;
	}
	public void setLeft(Node l)
	{
		left=l;
	}
	public void setData(int d)
	{
		data =d;
	}
	public Node getRight()
	{
		return right;
	}
	public Node getLeft()
	{
		return left;
	}
	public int getData()
	{
		return data;
	}
}
