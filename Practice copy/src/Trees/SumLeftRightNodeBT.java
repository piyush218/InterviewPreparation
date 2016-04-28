package Trees;
/*Given a Binary Tree where each node has positive and negative values. 
 * Convert this to a tree where each node contains the sum of the left and right sub trees in the original tree. 
 * The values of leaf nodes are changed to 0.
 * 
 * */
public class SumLeftRightNodeBT {
	
	public static void main(String[] args)
	{
		BinaryTree bt = new BinaryTree();
		bt.insert(10);
		bt.insert(-2);
		bt.insert(6);
		bt.insert(8);
		bt.insert(-4);
		bt.insert(7);
		bt.insert(5);
		
		bt.preOrder(bt.getRoot());
		bt.getRoot().setData(buildTree(bt.getRoot()));
		
		
		
		System.out.println("-----");
		
		bt.preOrder(bt.getRoot());
	}

	private static int buildTree(TreeNode root) {
		
		if(root == null)
			return 0;
		
		int newVal = buildTree(root.getLeft()) + buildTree(root.getRight());
		System.out.println("&& " + root.getData() + " to " + newVal);
		root.setData(newVal);
		
		if(root.getLeft() == null && root.getRight() == null)
			{
			
				System.out.println("** "+root.getData());
				root.setData(0);
			}
		
		return newVal;
		
	}

}
