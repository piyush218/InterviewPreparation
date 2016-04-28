package Trees;

import java.util.Stack;

public class BinarySearchTree {

	private TreeNode root;

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}
	
	public void insert(int val)
	{
		TreeNode newNode = new TreeNode();
		newNode.setData(val);
		newNode.setLeft(null);
		newNode.setRight(null);
		if(root== null)
		{
			root = newNode;
			return;
		}
		
		//System.out.println("root present");
		TreeNode temp = root;
		while(temp != null)
		{
			if(newNode.getData() < temp.getData())
			{
				//System.out.println("smaller");
				if(temp.getLeft() == null)
					{
					//System.out.println("left is null so inserting " + newNode.getData());
					temp.setLeft(newNode);
					return;
					}
				else
					{
					//System.out.println("Going left further");
					temp = temp.getLeft();
					}
			}
			else if(newNode.getData() > temp.getData())
			{
				if(temp.getRight() == null)
					{
					temp.setRight(newNode);
					return;
					}
				else
					temp = temp.getRight();
			}
		}
		
	}
	
	public void preOrder(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		System.out.println(root.getData());
		//TreeNode temp = root;
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}
	
	public void postOrder(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		
		//TreeNode temp = root;
		postOrder(root.getLeft());
		postOrder(root.getRight());
		System.out.println(root.getData());
	}
	
	public void inOrder(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		
		//TreeNode temp = root;
		inOrder(root.getLeft());
		System.out.println(root.getData());
		inOrder(root.getRight());
		
	}

	public int getHeight(TreeNode root)
	{
		if(root == null)
			return 0;
		
		return Math.max(getHeight(root.getLeft()), getHeight(root.getRight())) + 1;
	}

	public int getSize(TreeNode root)
	{
		if(root == null)
			return 0;
		
		return getSize(root.getLeft()) + 1 + getSize(root.getRight());
	}

	public boolean search(int val)
	{
		if(root == null)
			return false;
		
		TreeNode temp = root;
		boolean isPresent = false;
		while(temp != null)
		{
			if(temp.getData() == val)
			{
				isPresent = true;
				break;
			}
			else if(temp.getData() > val)
			{
				temp = temp.getLeft();
			}
			else
			{
				temp = temp.getRight();
			}
		}
		
		return isPresent;
	}

	public void preOrderIteration(TreeNode root)
	{
		Stack<TreeNode> stack = new Stack<>();
		
		stack.push(root);
		TreeNode helper;
		while(!stack.isEmpty())
		{
			helper = stack.pop();
			System.out.println(helper.getData());
			
			if(helper.getRight()!= null)
				stack.push(helper.getRight());
			if(helper.getLeft() != null)
				stack.push(helper.getLeft());
			
			
		}
	}
	
	
	
	
}
