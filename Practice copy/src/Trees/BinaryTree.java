package Trees;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {

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
		if(root == null)
			{
				root = newNode;
				return;
			}
		
		Queue<TreeNode> helper = new LinkedList<>();
		TreeNode temp = root;
		helper.add(temp);
		while(true)
		{

			temp = helper.poll();
			helper.add(temp.getLeft());
			helper.add(temp.getRight());
			if(temp.getLeft() == null)
			{
//				System.out.println("Inserting " + val + " to the left of " + temp.getData());
				temp.setLeft(newNode);
				return;
			}
			
			if(temp.getRight() == null)
			{
//				System.out.println("Inserting " + val + " to the right of " + temp.getData());
				temp.setRight(newNode);
				return;
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
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}
	
	public boolean buildPath(List<TreeNode> list, TreeNode root, int val)
	{
		if(root == null)
		{
			return false;
		}
		list.add(root);
		if(root.getData() == val)
			return true;
		else if(buildPath(list, root.getLeft(), val) || buildPath(list, root.getRight(), val))
			return true;
		else 
		{
			list.remove(list.size() - 1);
			return false;
			
		}
		
		
	}
}
