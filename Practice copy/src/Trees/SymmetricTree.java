package Trees;

public class SymmetricTree {

	public static void main(String[] args)
	{
		BinaryTree myTreeLeft = new BinaryTree();
		myTreeLeft.insert(1);
		myTreeLeft.insert(2);
		myTreeLeft.insert(3);
		myTreeLeft.insert(4);
		myTreeLeft.insert(5);
		myTreeLeft.insert(6);
		myTreeLeft.insert(7);
		myTreeLeft.insert(8);
		myTreeLeft.insert(9);
		System.out.println("PreOrder for TreeLeft");
		myTreeLeft.preOrder(myTreeLeft.getRoot());
		
		
		BinaryTree myTreeRight = new BinaryTree();
		System.out.println("-------------------------");
		System.out.println("PreOrder for TreeRight");
		myTreeRight.insert(1);
		myTreeRight.insert(2);
		myTreeRight.insert(3);
		myTreeRight.insert(4);
		myTreeRight.insert(5);
		myTreeRight.insert(6);
		myTreeRight.insert(7);
		myTreeRight.insert(8);
		myTreeRight.insert(10);
//System.out.println(myTreeRight.getRoot().getData());
		myTreeRight.preOrder(myTreeRight.getRoot());
		System.out.println("-------------------------");
		
		BinaryTree tree = new BinaryTree();
		TreeNode rootNode = new TreeNode();
		rootNode.setData(11);
		tree.setRoot(rootNode);
		rootNode.setLeft(myTreeLeft.getRoot());
		rootNode.setRight(myTreeRight.getRoot());
		
		System.out.println("Is Symmetric: " + isSymmeteric(tree.getRoot().getLeft(), tree.getRoot().getRight()));
		
	}

	private static boolean isSymmeteric(TreeNode left, TreeNode right) {
		// TODO Auto-generated method stub
		if(left == null && right == null)
			{
				//System.out.println("Both are null");
				return true;
			}
		else if((left != null && right == null) || (left == null && right != null))
		{
			//System.out.println("Both are not null");
			return false;
		}
		
		
		
		return ((left.getData() == right.getData()) && isSymmeteric(left.getLeft(), right.getLeft()) && isSymmeteric(left.getRight(), right.getRight()));
		
		
	}
}
