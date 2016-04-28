package stack;
import java.util.*;
public class PriorityQue {

	public static void main(String[] args)
	{
		PriorityQueue<Integer> myPrirorityQ = new PriorityQueue<Integer>();
		myPrirorityQ.add(12);
		myPrirorityQ.add(13);
		myPrirorityQ.offer(1);
		System.out.println(myPrirorityQ.peek());
		System.out.println(myPrirorityQ.peek());
		System.out.println(myPrirorityQ.poll());
		System.out.println(myPrirorityQ.poll());
		System.out.println(myPrirorityQ);
	}
}
