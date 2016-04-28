package Trees;

public class DuplicateSubTreesBT {

	static int element = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		bt.insert(1);
		bt.insert(2);
		bt.insert(3);
		bt.insert(4);
		bt.insert(4);
		bt.insert(5);
		bt.insert(6);
		bt.insert(7);
		bt.insert(8);
		bt.insert(7);
		bt.insert(9);
		
		int[] inOrder = new int[getSize(bt.getRoot())];
		getInOrder(inOrder, bt.getRoot());
		
		for(int i=0; i<inOrder.length; i++)
			System.out.print(inOrder[i] + " ");
		
		System.out.println();
		boolean result = checkDuplicacy(bt.getRoot());
		System.out.println("Contains duplacte tree: " + result);
	}

	private static boolean checkDuplicacy(TreeNode root) {
		if(root == null)
			return false;
		
		System.out.println("checking for " + root.getData());
		
		if(checkSymmetery(root.getLeft(), root.getRight()))
			{
				System.out.println("***********got true for: " + root.getData());
				return true;
			}
		else
		{
			
			return checkDuplicacy(root.getLeft()) && checkDuplicacy(root.getRight());
		}
		
	}

	
	private static boolean checkSymmetery(TreeNode left, TreeNode right) {
		if(left == null && right == null)
			return true;
		else if((left != null && right == null) || (left == null && right != null))
			return false;
		else
			return (left.getData() == right.getData()) && checkSymmetery(left.getLeft(), right.getLeft()) && checkSymmetery(left.getRight(), right.getRight());
	}

	private static int getSize(TreeNode root) {
		// TODO Auto-generated method stub
		if(root == null)
			return 0;
		return getSize(root.getLeft()) + 1 + getSize(root.getRight());
	}

	private static int[] getInOrder(int[] inOrder, TreeNode root) {
		if(root == null)
			return null;
		
		getInOrder(inOrder, root.getLeft());
		inOrder[element++] = root.getData();
		System.out.println(root.getData() + "   element: " + (element-1));
		getInOrder(inOrder, root.getRight());
		
		return inOrder;
	}

}
