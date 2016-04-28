package Trees;

import java.util.LinkedList;
import java.util.List;

public class TreeTester {

	public static void main(String[] args)
	{
		System.out.println("Tree Implementation...");
		BinarySearchTree bt = new BinarySearchTree();
		bt.insert(4);
	    bt.preOrder(bt.getRoot());
		bt.insert(2);
		bt.insert(3);
		bt.insert(1);
		bt.insert(8);
		bt.preOrder(bt.getRoot());
		System.out.println("--------------");
		bt.postOrder(bt.getRoot());
		System.out.println("--------------");
		bt.inOrder(bt.getRoot());
		System.out.println("--------------");
		System.out.println(bt.getRoot().getData());
		System.out.println("--------------");
		System.out.println("Height: " + bt.getHeight(bt.getRoot()));
		System.out.println("--------------");
		System.out.println("Number of nodes: " + bt.getSize(bt.getRoot()));
		System.out.println("--------------");
		System.out.println("8 is present: " + bt.search(8));
		System.out.println("5 is present: " + bt.search(5));
		System.out.println("-----------------------------");
		System.out.println("Preorder using iteration");
		bt.preOrderIteration(bt.getRoot());
		System.out.println("-----------------------------");
		System.out.println("Preorder using recursion");
		bt.preOrder(bt.getRoot());
		
		
	}
}
