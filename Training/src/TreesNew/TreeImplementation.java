package TreesNew;

public class TreeImplementation {

	public static void main(String[] args)
	{
		System.out.println("Welcome");
		Tree myTree = new Tree();
		myTree.insert(10);
		myTree.insert(8);
		myTree.insert(12);
		myTree.insert(6);
		//myTree.insert(8);
		//myTree.insert(11);
//		System.out.println("Tree constructed of Size " + myTree.size);
//		System.out.println(myTree.countNodes());
//		System.out.println("After countNode Size is: " + myTree.size);
//		System.out.println(myTree.countNodes());
		//myTree.insert(15);
		myTree.insert(11);
		myTree.insert(15);
		myTree.insert(9);
		
		
//		System.out.println(myTree.countNodes());
//		System.out.println("height is " + myTree.height());
//		System.out.println(myTree.countNodes());
		
		//Tree Traversals
//		System.out.println("Inorder Traversal: ");
//		myTree.inOrder();
//		System.out.println("PreOrder Traversal");
//		myTree.preOrder();
//		System.out.println("postOrder Traversal");
//		myTree.postOrder();
		
		//Min and Max value:
//		System.out.println(myTree.minVal());
//		System.out.println(myTree.maxVal());
		
		//Iterative Traversals
//		System.out.println("Inorder");
//		myTree.inOrderIterative();
//		System.out.println("PostOrder");
//		myTree.postOrderIterative();
//		System.out.println("PreOrder");
//		myTree.preOrderIterative();
//		System.out.println("BFS Traversal");
//myTree.BFS();
//System.out.println("--------------------");
//		System.out.println("Spiral BFS Traversal");
//		myTree.spiralBFS();
//		System.out.println("Spiral BFS without Stacks: ");
//		myTree.spiralBFSWOStack(); ---------->Spiral BFS without using Stacks, Does not work!!
		
		//Printing pathArray
//		System.out.println(myTree.pathArray(7));
		
		//System.out.println("Is the tree Binary Tree: " + myTree.isBinaryTree());
		//System.out.println("Is the tree Binary Search Tree: " + myTree.isBinarySearchTree());
		
//		Printing Sum of all the nodes:
//		System.out.println(myTree.sumOfAllNodes());
		
		//Printing sum of all the left leaves:
//		System.out.println(myTree.sumOfLeftLeaves());
		
		//Printing bottom view or only leaves:
		//myTree.bottomView();
		
//		myTree.BFSLevelByLevel();
		
		//Is my tree balanced:
		//System.out.println("Balancing of three is " + myTree.isHeightBalanced());
		
		//print reverse BFS
		myTree.ReverseBFS();
		
		//Print max diameter:
		//System.out.println(myTree.maxDiameter());
	}
}
