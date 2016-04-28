package Trees;

public class MinHeight {

	public static void main(String[] args)
	{
		BinaryTree tree = new BinaryTree();
		tree.insert(1);
		tree.insert(2);
		tree.insert(3);
		tree.insert(4);
		tree.insert(5);
		tree.insert(6);
		tree.insert(7);
		tree.insert(8);
		System.out.println(MinHeightFinder(tree.getRoot()));
	}

	private static int MinHeightFinder(TreeNode root) {
		// TODO Auto-generated method stub
		if(root == null)
			return 0;
		
		return Math.min(MinHeightFinder(root.getLeft()), MinHeightFinder(root.getRight())) + 1;
	}
}
