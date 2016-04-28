package TreesNew;
/*Given a binary tree and a number, return true if the tree has a root-to-leaf path such 
 * that adding up all the values along the path equals the given number. 
 * Return false if no such path can be found.
 * */
public class ContainsSum {

	public static void main(String[] args)
	{
		Tree myTree = new Tree();
		myTree.insert(10);
		myTree.insert(8);
		myTree.insert(12);
		myTree.insert(11);
		myTree.insert(6);
		myTree.insert(9);
		int sum = 33;
		System.out.println(checkSum(myTree.root, sum));
	}

	private static boolean checkSum(Node root, int sum) {
		if(root==null && sum!=0)
		{
			return false;
		}
		else
			{
			int subSum = sum - root.getData();
			if(root.left==null && root.right==null && subSum==0)
			{
				return true;
			}
			boolean answer = false;
			if(root.left!=null)
				answer = answer || checkSum(root.getLeft(), subSum);
			if(root.right != null)
				answer = answer || checkSum(root.getRight(), subSum);
			return answer;

			}
			}
}
