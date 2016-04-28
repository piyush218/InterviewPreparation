package Trees;

public class MaxSumPathBT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		bt.insert(3);
		bt.insert(9);
		bt.insert(4);
		bt.insert(1);
		bt.insert(8);
		bt.insert(2);
		bt.insert(4);
		bt.insert(5);
		bt.insert(8);
		bt.insert(2);
		
		findMaxPath(bt.getRoot());

	}

	private static void findMaxPath(TreeNode root) {
		if(root == null)
			return;
		
		System.out.println(root.getData());
		if(root.getLeft() != null && root.getRight()!= null)
		{
			if(root.getLeft().getData() > root.getRight().getData())
				findMaxPath(root.getLeft());
			else
				findMaxPath(root.getRight());
		}else if(root.getLeft() == null)
			findMaxPath(root.getRight());
		else if(root.getRight() == null)
			findMaxPath(root.getLeft());
		
		
	}

}
