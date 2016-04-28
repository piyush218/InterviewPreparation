package TreesNew;

public class BuildTreeINandPre {

	static int preIndex = 0;
	public static void main(String[] args)
	{
		int[] inOrder = {4, 2, 5, 1, 6, 3};
		int[] preOrder = {1,2,4,5,3,6};
		Node newRoot = buildTree(inOrder, preOrder, 0, inOrder.length-1);
		Tree myTree = new Tree(newRoot);
		
		myTree.BFS();
		
	}

	private static Node buildTree(int[] inOrder, int[] preOrder, int inStrt, int inEnd) {
		
		if(inStrt > inEnd)
			return null;
		
		Node myNode = new Node(preOrder[preIndex++], null, null);
		
		/* If this node has no children then return */
		if(inStrt == inEnd)
			return myNode;
		
		int inIndex = search(inOrder, inStrt, inEnd, myNode.data);
		
		/* Using index in Inorder traversal, construct left and
	     right subtress */
		myNode.setLeft(buildTree(inOrder, preOrder, inStrt, inIndex-1));
		myNode.setRight(buildTree(inOrder, preOrder, inIndex+1, inEnd));
		
		return myNode;
	}

	private static int search(int[] inOrder, int inStrt, int inEnd, int data) {
		int position = -1;
		for(int i = inStrt; i<=inEnd; i++)
		{
			if(inOrder[i] == data)
			{
				position = i;
				return position;
			}
		}
		return position;
	}
}
