package Trees;

public class TreeNode {

	protected int data;
	//protected TreeNode parent;
	protected TreeNode right;
	protected TreeNode left;
	
	public TreeNode()
	{
		data = 0;
		//parent = null;
		right = null;
		left = null;
	}
	
	public TreeNode(int d, TreeNode r, TreeNode l)
	{
		data = d;
		//parent = p;
		right = r;
		left = l;
	}
	
	public void setData(int d)
	{
		data = d;
	}
	
	/*public void setP(TreeNode p)
	{
		parent = p;
	}*/
	
	public void setR(TreeNode r)
	{
		right = r;
	}
	
	public void setL(TreeNode l)
	{
		left = l;
	}
	
	public int getData()
	{
		return data;
	}
	
	/*public TreeNode getP()
	{
		return parent;
	}*/
	
	public TreeNode getL()
	{
		return left;
	}
	
	public TreeNode getR()
	{
		return right;
	}
}
