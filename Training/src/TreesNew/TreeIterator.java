package TreesNew;

public class TreeIterator {
	Node root;
	int[] inOrder;
	int size = 0;
	int i = 0;//This helps in adding all the nodes in inorder into the array
	int current = -1;
	
	TreeIterator(Node r)
	{
		size = getSize(r);
		inOrder = new int[size];
		root =r;
		fillInOrder(inOrder, root);
	}
	
	private void fillInOrder(int[] inOrder, Node current) {
		if(current == null)
			return;
		else
		{
			inOrder[i] = current.data;
			i++;
			fillInOrder(inOrder, current.left);		
			fillInOrder(inOrder, current.right);
			
		}
	}

	private int getSize(Node r) {
		if(r==null)
			return 0;
		else
			return (getSize(r.left) + 1 + getSize(r.right));
	}
	
	public int next()
	{
		if(current < size-1)
		{
			current++;
			return inOrder[current];
		}
		else
		{
			System.out.println("Tree reached end....Starting iteration again");
			current = 0;
			return inOrder[current];
		}
	}
	
	public boolean hasNext()
	{
		boolean flag = true;
		if(current>=size-1)
		{
			flag = false;
		}
		return flag;
		
	}
	
}