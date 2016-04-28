package Trees;

public class LCAofBST {
	
	public static void main(String[] args)
	{
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(20);
		bst.insert(10);
		bst.insert(30);
		bst.insert(8);
		bst.insert(25);
		bst.insert(12);
		bst.insert(6);
		bst.insert(9);
		bst.inOrder(bst.getRoot());
		int n1 = 6;
		int n2 = 9;
		int small, large;
		if(n1 > n2)
		{
			small = n2;
			large = n1;
		}
		else
		{
			small = n1;
			large = n2;
		}
		TreeNode lca = getLCA(bst.getRoot(), small, large);
		System.out.println("LCA for " + small + " & " + large + " is: " + lca.getData());
	}

	private static TreeNode getLCA(TreeNode root, int n1, int n2) {
		// TODO Auto-generated method stub
		if(root == null)
		{
			return null;
		}
		if((root.getData() > n1 && root.getData() < n2))
			return root;
		else if(root.getData() == n1 || root.getData() == n2)
			return root;
		if(root.getData() > n1 && root.getData() > n2)
			return getLCA(root.getLeft(), n1, n2);
		else
			return getLCA(root.getRight(), n1, n2);
	}

}
