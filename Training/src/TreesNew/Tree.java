package TreesNew;
import java.util.*;

public class Tree {
	
	protected Node root;
	protected int size;
	
	public Tree()
	{
		root =null;
		size =0;
	}
	public Tree(Node newRoot)
	{
		root = newRoot;
	}
	public boolean isEmpty()
	{
		return root == null;
	}
	public void insert(int val)
	{
		Node myNode = new Node(val, null, null);
		size++;
		if(isEmpty())
		{
			root = myNode;
			root.setLeft(null);
			root.setRight(null);
		}
		else
		{
			Node r = root;
			while(r != null)
			{
				if(r.getData() > val)
				{
					if(r.getLeft() == null)
					{
						r.setLeft(myNode);
						break;
					}
					r = r.getLeft();
				}
				else
				{
					if(r.getRight() == null)
					{
						r.setRight(myNode);
						break;
					}
					r = r.getRight();
				}
			}
			
		}
	}

	public int countNodes()
	{
		Node r = root;
		return countNodes(r);
	}
	
	private int countNodes(Node r) {
		if(r == null)
		{
			return 0;
		}
		else
		{
			return (countNodes(r.getLeft()) + 1 + countNodes(r.getRight()));
		}
	}

	public int height()
	{
		Node r =root;
		return height(r);
	}
	
	private int height(Node r) {
		if(r == null)
		{
			return 0;
		}
		else
		{
			return 1+Math.max(height(r.getLeft()), height(r.getRight()));
		}
	}

	public void inOrder()
	{
		Node r =root;
		inOrder(r);
	}
	
	private void inOrder(Node r) {
		if(r==null)
		{
			return;
		}
		else
		{
			inOrder(r.getLeft());
			System.out.println(r.getData());
			inOrder(r.getRight());
		}
	}

	public void preOrder()
	{
		Node r =root;
		preOrder(r);
	}
	
	private void preOrder(Node r) {
		if(r == null)
		{
			return;
		}
		else
		{
			System.out.println(r.getData());
			preOrder(r.getLeft());
			preOrder(r.getRight());
		}
	}

	public void postOrder()
	{
		Node r =root;
		postOrder(r);
	}
	
	private void postOrder(Node r) {
		if(r==null)
		{
			return;
		}
		else
		{
			postOrder(r.getLeft());
			postOrder(r.getRight());
			System.out.println(r.getData());
		}
	}
	
	public int minVal() {
		Node r =root;
		return minVal(r);
	}
	private int minVal(Node r) {
		int s = 0;
		if(r!=null)
		{
			if(r.getLeft() == null)
			{
				s = r.getData();
				return s;
			}
			else
			{
				s = minVal(r.getLeft());
			}
		}
		return s;
	}

	public int maxVal(){
		Node r =root;
		return maxVal(r);
	}
	private int maxVal(Node r) {
		int s =0;
		if (r!=null) {
			if (r.getRight() == null) {
				s = r.getData();
				return s;
			} else {
				s = maxVal(r.getRight());
			}
		}
		return s;
	}

	public void inOrderIterative(){
	    
	    Node r = root;
	    inOrderIterative(r);

	}

	private void inOrderIterative(Node node)
	{
		if(node == null)
        {
            return;
        }
	    Stack<Node> myStack = new Stack<Node>();
	    Node current = node;
	    while(true)
	    {
	        if(current != null)
	        {
	            myStack.push(current);
	            current = current.getLeft();
	        }
	        else
	        {
	        	if(!myStack.isEmpty())
		        {	
	        		current = myStack.pop();
		            System.out.println(current.getData());
		            current = current.getRight();
	            }
	        	else
	        	{
	        		return;
	        	}
	        }
	    }

	}
	
	public void postOrderIterative()
	{
		Node r =root;
		postOrderIterative(r);
	}

	private void postOrderIterative(Node node)
{
	System.out.println("generating Post order");
    if(node == null)
        {
            return;
        }
    Stack<Node> midStack = new Stack<Node>();
    Stack<Node> outputStack = new Stack<Node>();
    midStack.push(node);
    while(!midStack.isEmpty())
    {
        node = midStack.pop();
        outputStack.push(node);
        
        if(node.getLeft() != null)
            midStack.push(node.getLeft());
        if(node.getRight() != null)
            midStack.push(node.getRight());
    }
    
    while(!outputStack.isEmpty())
    {
        node = outputStack.pop();
        System.out.println(node.getData());
    }

}

	public void preOrderIterative(){
	    
	    Node r = root;
	    preOrderIterative(r);

	}

	private void preOrderIterative(Node r)
	{
	    if(r==null)
	        {
	            return;
	        }
	    Stack<Node> myStack = new Stack<Node>();
	    System.out.println("Root is: " + r.getData());
	    myStack.push(r);
	    while(!myStack.isEmpty())
	    {
	        r = myStack.pop();
	        System.out.println(r.getData());
	        // Push the right child first
	        if(r.getRight() != null)
		        myStack.push(r.getRight());
	        // Then push the left child
	        if(r.getLeft() != null)
	        	myStack.push(r.getLeft());
	           
	    }
	}

	public void BFS()
	{
		Node r = root;
		BFS(r);
	}
	
	private void BFS(Node r) {
		if(r == null)
			return;
		
		Queue<Node> myQueue = new LinkedList<Node>();
		myQueue.add(r);
		while(!myQueue.isEmpty())
		{
			r = myQueue.poll();
			System.out.print(r.getData() + " ");
			
			
			if(r.getLeft() != null)
				{
				myQueue.add(r.getLeft());
				}
			if(r.getRight() != null)
				{
				myQueue.add(r.getRight());
				}
						
		}
		
		System.out.println();
	}
	
	
	public void BFSLevelByLevel()
	{
		Node r = root;
		BFSLevelByLevel(r);
	}

	private void BFSLevelByLevel(Node r)  
	{
		if(r == null)
			return;
		
		int cur = 1;
		int nxt = 0;
		Queue<Node> myQueue = new LinkedList<Node>();
		myQueue.add(r);
		while(!myQueue.isEmpty())
		{
			r = myQueue.poll();
			
			
			if(r.getLeft() != null)
				{
				myQueue.add(r.getLeft());
				nxt++;
				}
			if(r.getRight() != null)
				{
				myQueue.add(r.getRight());
				nxt++;
				}
			
			System.out.print(r.getData() + " ");
			cur--;
			
			if (0 == cur) {
	            cur = nxt;
	            nxt = 0;
	            System.out.println();
	        }
			
		}
		

	}
	
	public void ReverseBFS(){
		Node r = root;
		ReverseBFS(r);
	}
	
	private void ReverseBFS(Node r) {
		if(r == null)
			return;
		
		Queue<Node> myQueue = new LinkedList<Node>();
		Stack<Node> myStack = new Stack<Node>();
		myQueue.add(r);
		int parent=1, child = 0;
		while(!myQueue.isEmpty())
		{
			r = myQueue.poll();
			//System.out.print(r.getData() + " ");
			myStack.add(r);
			//myStack.add(null);
			if(r.getRight() != null)
			{
			myQueue.add(r.getRight());
			}
			
			if(r.getLeft() != null)
				{
				myQueue.add(r.getLeft());
				}
			
				//myQueue.add(null);		
		}
		
		while(!myStack.isEmpty())
		{
			System.out.print(myStack.pop().getData() + " ");
		}
		
	}
	
	public void spiralBFS()
	{
		Node r = root;
		spiralBFS(r);
	}
	
	private void spiralBFS(Node r) {
		if(r == null)
			return;
		Stack<Node> stack1 = new Stack<Node>();
		Stack<Node> stack2 = new Stack<Node>();
		stack1.push(r);
		while(stack1.isEmpty() == false || stack2.isEmpty() == false)
		{
			while(stack1.isEmpty() == false)
			{
				r = stack1.pop();
				System.out.println(r.getData());
				if(r.getRight()!=null)
					stack2.push(r.getRight());
				if(r.getLeft()!= null)
					stack2.push(r.getLeft());
			}
			
			while(stack2.isEmpty() == false)
			{
				r=stack2.pop();
				System.out.println(r.getData());
				if(r.getLeft() != null)
					stack1.push(r.getLeft()); 
				if(r.getRight() != null)
					stack1.push(r.getRight());
			}
		}
	}

	public String pathArray(int val)
	{
		Node r = root;
		String path = null;
		return pathArray(r, val, path);
	}
	private String pathArray(Node r, int val, String path) {
		boolean found = false;
		if(r == null)
		{
			path = "-1";
		}
		while(r!=null)
		{
			if(r.getData() == val)
			{
				found = true;
				break;
			}
			else if(r.getData()>val)
			{
				if(path == null)
					path = "1";
				else
					path+=1;
				r = r.getLeft();
			}
			else
			{
				if(path == null)
					path = "0";
				else
				{
					path = path + "0";
				}
				r=r.getRight();
			}
		}
		if(!found)
		{
			path = "-1";
		}
		return path;
	}

	public void BFSWOStack()//reverse BFS
	{
		int h  = height();
		Node r =root;
		for(int i = h;i>=1;i--)
			BFSWOStack(r,i);
	}
	
	private void BFSWOStack(Node r, int level)
	{
		if(r == null)
			return;
		if(level == 1)
			System.out.print(r.getData());
		else if(level>1)
		{
			BFSWOStack(r.left, level-1);
			BFSWOStack(r.left, level-1);
		}
				
	}
	
	private void printLevel(Node r, int level, boolean ltr) {//Doesnt work
		if(level == 0)
		{
			return;
		}
		else if(level == 1)
		{
			System.out.println(r.getData());
			return;
		}
		else if(level>1)
		{
			if(ltr)
			{
				System.out.println("LTR");
				printLevel(r.getLeft(), level-1, ltr);
				printLevel(r.getRight(), level-1, ltr);
				return;
			}
			else
			{
				System.out.println("RTL");
				printLevel(r.getRight(), level-1, ltr);
				printLevel(r.getLeft(), level-1, ltr);
				return;
			}
		}
	}

	public boolean isBinaryTree()
	{
		Node r = root;
		return isBinaryTree(r);
	}
	private boolean isBinaryTree(Node r) {
		boolean isBinary = true;
		if(r == null)
		{
			return isBinary;
		}
		if(r!=null)
		{
			if((r.getLeft() == null && r.getRight()!=null) || (r.getLeft()!=null && r.getRight() == null))
			{
				isBinary = false;
				return isBinary;
			}
			else
			{
				return isBinaryTree(r.getLeft()) && isBinaryTree(r.getRight());
				
			}
		}		
		return isBinary;
	}

	public boolean isBinarySearchTree(){
		Node r =root;
		boolean isBinary = true;
		//r.getLeft().setData(30);//This is done to mess up binary search tree.
		return isBinarySearchTree(r);
	}
	private boolean isBinarySearchTree(Node r) {
		if(r == null)
		{
			return true;
		}
		else
		{
			if(r.getLeft()!=null && (r.getLeft().getData()>r.getData()))
				return false;
			else if(r.getRight()!=null && (r.getRight().getData() < r.getData()))
				return false;
			else
				return isBinarySearchTree(r.getLeft()) && isBinarySearchTree(r.getRight());
		}
		//return isBinary;
	}

	public int sumOfAllNodes()
	{
		Node r =root;
		return sumOfAllNodes(r);
	}
	
	private int sumOfAllNodes(Node r) {
		if(r==null)
			return 0;
		else
			{
			return r.data + sumOfAllNodes(r.getLeft()) + sumOfAllNodes(r.getRight());
			}
	}

	public int sumOfLeftLeaves()
	{
		Node r = root;
		int sum = 0;
		return sumOfLeftLeaves(r);
	}
	private int sumOfLeftLeaves(Node r) {

		if(r==null)
			return 0;
		else
			if(r.left==null && r.right==null)
				return r.data;
		return sumOfLeftLeaves(r.getLeft()) + sumOfLeftLeaves(r.getRight());
		
	}

	public void bottomView()
	{
		Node r = root;
		bottomView(r);
	}
	private void bottomView(Node r) {
		if(r==null)
			return;
		else
		{
			if(r.getLeft() == null && r.getRight() == null)
				System.out.println(r.getData());
			bottomView(r.getLeft());
			bottomView(r.getRight());
		}
	}


	public boolean isHeightBalanced(){
		Node r =root;
		return isHeightBalanced(r);
	}
	private boolean isHeightBalanced(Node r) {
		if(r==null)
			return true;
		else
			if(height(r.left) - height(r.right) == 1 || height(r.left) - height(r.right) == 0)
			{
				return true;
			}
			else
				return false;
	}
	
	public int maxDiameter()
	{
		Node r = root;
		return maxDiameter(r);
	}
	private int maxDiameter(Node r) {
		if(r==null)
			return 0;
		else
			return Math.max(Math.max(maxDiameter(r.left), maxDiameter(r.right)), 1+height(r.left)+height(r.right));
		
	}
}
