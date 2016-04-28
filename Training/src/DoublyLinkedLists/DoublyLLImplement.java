package DoublyLinkedLists;

import java.util.Scanner;

public class DoublyLLImplement {

	public static void main(String[] args)
	{
		DoublyLL myList = new DoublyLL();
		Scanner scan = new Scanner(System.in);
		char ch;
		int choice, val;
		
		do{
			System.out.println("Welcome");
			System.out.println("1. Insert element at beginging");
			System.out.println("2. Insert element at a position");
			System.out.println("3. Display");
			System.out.println("4. Delete using data");
			choice = scan.nextInt();
			switch(choice)
			{
			case 1: 
				System.out.println("Eneter the value:");
				val = scan.nextInt();
				myList.insertAtStart(val);
				break;
			
			case 2:
				System.out.println("Enter the value: ");
				val = scan.nextInt();
				System.out.println("Enter the position: ");
				int pos = scan.nextInt();
				myList.insertAtPos(val, pos);
				break;
				
			case 3:
				myList.display();
				break;
				
			case 4:
				System.out.println("Enter the value to be deleted");
				val = scan.nextInt();
				myList.deleteData(val);
				break;
			}
			System.out.println("Do you want to continue?(y/n)");
			ch = scan.next().charAt(0);
		}while(ch=='y' || ch=='Y');
	}
}
