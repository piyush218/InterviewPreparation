package TreesNew;

import javax.annotation.PostConstruct;

public class BuildTreeINandPost {

	static int[] inOrder = {4, 2, 5, 1, 6, 3};
	static int[] postOrder = {4,5,2,6,3,1};
	static int postIndex = postOrder.length - 1;
	
	public static void main(String[] args)
	{
		Node newRoot = buildTree(inOrder, postOrder, 0, inOrder.length-1, 0, postOrder.length-1);
		Tree myTree = new Tree(newRoot);
		
		myTree.BFS();
		
	}
	
private static Node buildTree(int[] inOrder, int[] postOrder, int inStrt, int inEnd, int postStart, int postEnd) {
		
		
		if(inStrt > inEnd || postStart > postEnd)
			return null;
		
		
		Node myNode = new Node(postOrder[postEnd], null, null);
		
		/* If this node has no children then return */
		if(inStrt == inEnd)
			return myNode;
		
		int inIndex = search(inOrder, inStrt, inEnd, myNode.data);
		
		// Using index in Inorder traversal, construct left and right subtress 
		myNode.setLeft(buildTree(inOrder, postOrder, inStrt, inIndex-1, postStart, postStart+inIndex-(inStrt+1)));
		//Becuase k is not the length, it it need to -(inStart+1) to get the length
		
		myNode.setRight(buildTree(inOrder, postOrder, inIndex+1, inEnd, postStart+inIndex-inStrt, postEnd-1));
		//postStart+k-inStart = postStart+k-(inStart+1) +1
		
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
