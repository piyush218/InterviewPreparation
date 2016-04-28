package Trees;

import java.util.Scanner;

public class BstImplement {

	public static void main(String[] args)
	{
		BinaryTree bt = new BinaryTree();
		Scanner scan= new Scanner(System.in);
		char ch;
		int choice, val;
		do{
			System.out.println("Welcome");
			//System.out.println("1. Insert");
			bt.insertNode(5);
			bt.insertNode(3);
			bt.insertNode(8);
			bt.insertNode(2);
			bt.insertNode(4);
			System.out.println("2. Search");
			System.out.println("3. Size");
			System.out.println("4. Height");
			System.out.println("5. Inorder Traversal");
			System.out.println("6. Preorder Traversal");
			System.out.println("7. Postorder Traversal");
			
			choice = scan.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Please enter the value:");
				val= scan.nextInt();
				bt.insertNode(val);
				//System.out.println(bt.root);
				break;
			
			case 2:
				System.out.println("Enter the value to be searched:");
				val = scan.nextInt();
				bt.search(val);
				break;
			
			case 3:
				int s = bt.TreeSize();
				System.out.println("Size of tree is: " + s);
				break;
			
			case 4:
				int h = bt.TreeHt();
				System.out.println("Height of tree is: " + h);
				break;
				
			case 5:
				bt.Inorder();
				System.out.println("-----------Root: " + bt.root.getData());
				break;
			
			case 6:
				bt.Preorder();
				System.out.println("-----------Root: " + bt.root.getData());
				break;
			
			case 7:
				bt.Postorder();
				break;
			
			}
			System.out.println("Do you want to continue? (y/n)");
			ch = scan.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
	}
}
