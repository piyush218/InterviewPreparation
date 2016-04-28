package Trees;

public class BinaryTree {

	protected TreeNode root;
	
	public BinaryTree()
	{
		root = null;
	}
	
	public boolean isEmpty()
	{
		return root == null;
	}
	
	public void insertNode(int val)
	{
		TreeNode r = root;
		insertNode(r, val);
	}
	
	public void search(int val)
	{
		TreeNode r =root;
		search(r, val);
	}
	
public void insertNode(TreeNode r, int val)
	{
		TreeNode myNode = new TreeNode(val, null, null);

		
		if(isEmpty())
		{
			System.out.println("Node is being created...");
			//node = new TreeNode(val, null, null, null);
			root = myNode;
//			t = root;
		}
		
		else
		{
			r = root;
			while(r!=null)
			{
				if(r.getData() >= val)
				{
					if(r.getL() == null){
//					r = r.getL();
						r.setL(myNode);
						break;
					}
					else
					{
						r = r.getL();
					}
				}
				else
					{
					if(r.getR() == null){
//						r = r.getL();
							r.setR(myNode);
							break;
						}
						else
						{
							r = r.getR();
						}
					}
			}
//			r = myNode;
		}
	}
	
	public void search(TreeNode r, int val)
	{	System.out.println("The value to be searched is: " + val);
		System.out.println("The value of root is: " + root.getData());
		boolean f = false;
		if(isEmpty())
		{
			System.out.println("Tree is empty...");
			return;
		}
		
		else
		{
			r = root;
			
			while(true)
			{
				System.out.println("loop");
				if(r.getData() > val && r.getL()!=null)
				{
					System.out.println("checking left");
					r = r.getL();
					continue;
				}
				else if(r.getData() < val && r.getR()!=null)
					{
					System.out.println("cheking right");
					r = r.getR();
					continue;
					}
					
				else
				{
					f = true;
					System.out.println("The node is present...");
					break;
				}
			}
	
			}
		}
	public int TreeSize()
	{
		TreeNode r = root;
		return TreeSize(r);
	}
	
	public int TreeSize(TreeNode t)
	{
		if (t!=null)
		{
			return(TreeSize(t.getL()) + 1 + TreeSize(t.getR()));
		}
		else
		{
			return 0;
		}
	}
	
	public int TreeHt()
	{
		TreeNode r = root;
		return TreeHt(r);
	}
	
	
	public int TreeHt(TreeNode t)
	{
		if(t!=null)
		{
			return (Math.max(TreeHt(t.getL()), TreeHt(t.getR())) + 1);
		}
		else
		{
			return 0;
		}
	}
	
	public void Inorder()
	{
		TreeNode r = root;
		Inorder(r);
	}
	
	public void Inorder(TreeNode t)
	{
		if(t!=null)
		{
			Inorder(t.getL());
			System.out.println(t.getData());
			Inorder(t.getR());
		}
		else
		{
			return;
		}
	}
	
	public void Preorder()
	{
		TreeNode r = root;
		Preorder(r);
	}
	public void Preorder(TreeNode t)
	{
		if(t!=null)
		{
			System.out.println(t.getData());
			Inorder(t.getL());
			Inorder(t.getR());
		}
		else
		{
			return;
		}
	}
	
	public void Postorder()
	{
		TreeNode r = root;
		Postorder(r);
	}
	public void Postorder(TreeNode t)
	{
		if(t!=null)
		{
			Postorder(t.getL());
			Postorder(t.getR());
			System.out.println(t.getData());
			
		}
		else
		{
			return;
		}
	}
	
	}
	
	

