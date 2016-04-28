package TreesNew;

public class TreeIteratorImplementation {

	public static void main(String args[])
	{
		Tree myTree = new Tree();
		myTree.insert(10);
		myTree.insert(8);
		myTree.insert(12);
		myTree.insert(6);
		myTree.insert(9);
		myTree.insert(11);
		TreeIterator myIterator = new TreeIterator(myTree.root);
		System.out.println(myIterator.next());
		System.out.println(myIterator.next());
		System.out.println(myIterator.next());
		System.out.println(myIterator.next());
		System.out.println(myIterator.next());
		System.out.println(myIterator.hasNext());
		System.out.println(myIterator.next());
		System.out.println(myIterator.hasNext());
		System.out.println(myIterator.next());
		System.out.println(myIterator.hasNext());
		System.out.println(myIterator.hasNext());
	}
}
