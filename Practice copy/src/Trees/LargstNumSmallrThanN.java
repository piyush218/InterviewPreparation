package Trees;

/*Find the largest number in a binary search tree that is less than a given number
 * */

public class LargstNumSmallrThanN {
	
	public static void main(String[] args)
	{
		BinarySearchTree bt = new BinarySearchTree();
		bt.insert(20);
	    bt.insert(10);
		bt.insert(30);
		bt.insert(8);
		bt.insert(12);
		bt.insert(25);
		bt.insert(34);
		bt.insert(31);
		bt.insert(22);
		bt.insert(6);
		bt.insert(9);
		bt.insert(26);
		int val = 27;
		TreeNode result = findNum(bt.getRoot(), val);
		if(result != null)
			System.out.println("Result: " + result.getData());
		else
			System.out.println("no such nodes");
	}

	private static TreeNode findNum(TreeNode root, int val) {
		// TODO Auto-generated method stub
		if(root == null)
			return null;
		
		if(root.getData() < val)
		{
			System.out.println("root smaller: " + root.getData());
			if((root.getRight() != null && root.getLeft().getData() > val) || root.getLeft() == null)
				{
					System.out.println("root left null " + root.getData());
					return root;
				}
			else 
				{
				if(root.getRight().getData() < val)
					{
						System.out.println("root has smaller right so recursing...");
						return findNum(root.getRight(), val);
					}
				else
					{
						System.out.println("root has larger right");
						return root;
					}
					
				}
			
		}
		else
		{
			System.out.println("root larger....");
			return findNum(root.getLeft(), val);
		}
			
		
		
	}

}
