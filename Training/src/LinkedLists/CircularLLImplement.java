package LinkedLists;

import java.util.Scanner;

public class CircularLLImplement {

	public static void main(String[] args)
	{
		CircularLL myList = new CircularLL();
		Scanner scan = new Scanner(System.in);
		char ch;
		int choice, val;
		do{
			System.out.println("Welcome");
			System.out.println("1. Insert at Begining");
			System.out.println("2. Insert at End");
			System.out.println("3. Display");
			choice = scan.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the value");
				val = scan.nextInt();
				myList.insertAtBeg(val);
				break;
			
			case 2:
				System.out.println("Enter the value");
				val = scan.nextInt();
				myList.insertAtEnd(val);
				break;
				
			case 3:
				myList.display();
			}
			System.out.println("Do you want to continue?(y or n)");
			ch = scan.next().charAt(0);
		}while(ch=='y' || ch=='Y');
	}
}
