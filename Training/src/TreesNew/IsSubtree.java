package TreesNew;
//Find if the given tree is the subtree of the big tree
public class IsSubtree {

	public static void main(String[] args)
	{
		Tree tree = new Tree();
		Tree sub = new Tree();
		tree.insert(10);
		tree.insert(8);
		tree.insert(12);
		tree.insert(6);
		tree.insert(9);
		tree.insert(11);
		tree.insert(15);
		sub.insert(8);
		sub.insert(6);
		sub.insert(20);
		
		System.out.println("IsSubtree: " + checkSubTree(tree.root, sub.root));
	}

	private static boolean checkSubTree(Node root1, Node root2) {
		if(root2 == null)
			return true;
		if(root1 == null)
			return false;
		if(root1.getData() == root2.getData())
		{
			return checkSubTree(root1.left, root2.left) && checkSubTree(root1.right, root2.right);
		}
		else if(root1.getData() > root2.getData())
			return checkSubTree(root1.left, root2);
		else
			return checkSubTree(root1.right, root2);
		
	}
}
/*  10,20,30
 *  40,50,60
 *  70,80,90
 */
 