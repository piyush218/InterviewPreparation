package Trees;

import java.util.LinkedList;
import java.util.List;

public class LCAofBT {
	
	public static void main(String[] args)
	{
		BinaryTree st = new BinaryTree();
		st.insert(1);
		st.insert(2);
		st.insert(3);
		st.insert(4);
		st.insert(5);
		st.insert(6);
		st.insert(7);
		st.insert(8);
		int n1 = 7;
		int n2 = 1;
		
		TreeNode lca = getLCA(st, n1, n2);
		System.out.println("LCA for " + n1 + " & " + n2 + " is: " + lca.getData());
	}

	private static TreeNode getLCA(BinaryTree st, int small, int large) {
		// TODO Auto-generated method stub
		if(st.getRoot() == null)
			return null;
		
		List<TreeNode> list1 = new LinkedList<>();
		Boolean pathFound1 = st.buildPath(list1, st.getRoot(), small);
		
		List<TreeNode> list2 = new LinkedList<>();
		Boolean pathFound2 = st.buildPath(list2, st.getRoot(), large);
		
		int i=0,j=0;
		while(i<list1.size() && j<list2.size())
		{
			System.out.println(list1.get(i).getData() + "  " + list2.get(j).getData());
			if(list1.get(i) != list2.get(j))
				break;
			i++;
			j++;
		}
		return list1.get(i-1);
	}

}
