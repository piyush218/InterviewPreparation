package Trees;

import java.util.ArrayList;
import java.util.List;

import Hackathon.FindMax;

public class MinDiff {

	public static void main(String[] args) {
		
		BinarySearchTree bt = new BinarySearchTree();
		bt.insert(10);
		bt.insert(5);
		bt.insert(16);
		bt.insert(12);
		bt.insert(20);
		//int size = getSize(bt.getRoot());
		//System.out.println(size);
		List<Integer> inOrder = new ArrayList<>();
		//getInOrder(inOrder, bt.getRoot());
		getInOrder(inOrder, bt.getRoot());
		//System.out.println(inOrder);
		int minDiff = findMinDiff(inOrder);
		System.out.println(minDiff);
	}

	private static int findMinDiff(List<Integer> inOrder) {
		
		if(inOrder.size() <= 1)
			return inOrder.get(0);
		
		int minDiff = inOrder.get(1) - inOrder.get(0);
		for(int i=2; i<inOrder.size(); i++)
		{
			if(minDiff > inOrder.get(i) - inOrder.get(i-1))
			{
				minDiff = inOrder.get(i) - inOrder.get(i-1);
			}
		}
		return minDiff;
	}

	public static void getInOrder(List<Integer> inOrder, TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		
		//TreeNode temp = root;
		getInOrder(inOrder, root.getLeft());
		//System.out.println(root.getData());
		inOrder.add(root.getData());
		getInOrder(inOrder, root.getRight());
		
	}
	

}
