package Trees;

import java.util.Stack;

public class PrintAllPaths {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.insert(0);
		bt.insert(1);
		bt.insert(2);
		bt.insert(3);
		bt.insert(4);
		bt.insert(5);
		bt.insert(6);
		
		int[] paths = new int[getSize(bt.getRoot())];
		getPaths(bt.getRoot(), paths, 0);

	}

	private static void getPaths(TreeNode root, int[] paths, int pathLength) {
		// TODO Auto-generated method stub
		if(root == null)
			return;
		
		paths[pathLength++] = root.getData();
		
		if(root.getLeft() == null && root.getRight() == null){
			printPaths(paths, pathLength);
		}else{
			getPaths(root.getLeft(), paths, pathLength);
			getPaths(root.getRight(), paths, pathLength);
		}
		
		
	}
	
	private static void printPaths(int[] paths, int pathLength) {
		for(int i=0; i<pathLength; i++)
			System.out.print(paths[i] + "  ");
		
		System.out.println();
	}

	private static int getSize(TreeNode root)
	{
		if(root ==  null)
			return 0;
		
		return getSize(root.getLeft()) + 1 + getSize(root.getRight());
	}

	

}
