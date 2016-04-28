package LinkedLists;

import java.util.Scanner;

public class SingleLLImplement {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		SingleLinkedList myList = new SingleLinkedList();
		char ch;
		int choice;
		int val, pos;
		myList.insertAtStart(4);
		myList.insertAtEnd(6);
		myList.insertAtEnd(8);
		myList.insertAtEnd(4);
		myList.insertAtEnd(6);
		myList.insertAtEnd(6);
		myList.insertAtEnd(8);
		myList.insertAtEnd(4);
		myList.insertAtEnd(6);
		myList.insertAtEnd(6);
		myList.insertAtEnd(6);
		Node tempStart = myList.start;
		myList.ReverseRec(tempStart);
		myList.display();
		
//		do{
//			System.out.println("Welcome:");
//			System.out.println("1. To enter node in the begining");
//			System.out.println("2. To enter node at the end");
//			System.out.println("3. To enter node in a position");
//			System.out.println("4. To delete a node");
//			System.out.println("5. To get the number of nodes");
//			System.out.println("6. To display all the nodes");
//			System.out.println("7. To check if the Linked List is empty");
//			System.out.println("8. To delete the entire list");
//			System.out.println("9. To reverse the list");
//			choice = scan.nextInt();
//			switch(choice)
//			{
//			case 1:
//				System.out.println("Enter the data of first node");
//				val = scan.nextInt();
//				myList.insertAtStart(val);
//				break;
//				
//			case 2:
//				System.out.println("Enter the data of last node");
//				val = scan.nextInt();
//				myList.insertAtEnd(val);
//				break;
//				
//			case 3:
//				System.out.println("Enter the data");
//				val = scan.nextInt();
//				System.out.println("Enter the position of node");
//				pos = scan.nextInt();
//				myList.insertAtPosition(val, pos);
//				break;
//				
//			case 4:
//				System.out.println("Enter the node to be deleted");
//				pos = scan.nextInt();
//				myList.deleteAtPos(pos);
//				break;
//				
//			case 5:
//				System.out.println("No. of nodes in the List are: " + myList.getSize());
//				break;
//				
//			case 6:
//				myList.display();
//				break;
//				
//			case 7:
//				System.out.println("Is my List empty: " + myList.isEmpty());
//				break;
//			
//			case 8:
//				System.out.println("Your list is being deleted...");
//				myList.deleteEntireList();
//				break;
//			
//			case 9:
//				myList.reverseLL();
//				break;
//			}
//			
//			System.out.println("Do you want to continue? (Enter y/n or Y/N)");
//			ch = scan.next().charAt(0);
//		}while(ch=='y' || ch=='Y');
	}
}
