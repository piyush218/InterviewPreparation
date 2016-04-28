package OtherPrograms;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

//remove and display all duplicates from an array
//Approach first sort the array - O(nlogn) and then call removeDups - 0(n) => 0(n + nlogn)
public class DuplicateRemoval {

	public static void main(String[] args)
	{
		int[] a = {2,4,6,6,6,8,10};
//		for(int i=0; i<a.length; i++)
//		{
//			System.out.print(a[i] + " ");
//		}
		//removeDups(a);
		
		int[] b = {2,8,6,2,8,6,4,5,9};
		removeDups(b);
		deleteDuplicates1(b);
	}

	private static void removeDups(int[] a) {
		int i= 0;
		int j=i+1;
		while(j<a.length)
		{
			if(a[i] != a[j]) 
				//if a[i] != a[j], move i and j both and a[++i]=a[j]
 			{
				i++;
				a[i] = a[j];
				j++;
			}
			else//otherwise move only j
			{
				System.out.println("Removing duplicate: " + a[j]);
				j++;
			}
		}
		//System.out.println("-------" + a[i]);
		for(int k =0; k<=i; k++)
		{
			System.out.print(a[k] + " ");
		}
		
	}
	
	 public static void deleteDuplicates1(int[] arr){
         HashMap<Integer, Boolean> alreadyPresent = new HashMap<Integer, Boolean>();
         int count = 0;
         for(int i = 0; i < arr.length;i++){
                 if(alreadyPresent.containsKey(arr[i])){
                         i++;
                 }else{
                         alreadyPresent.put(arr[i], true);
                         count++;
                 }
         }
         for(int x =0; x< count; x++){
                 System.out.print(arr[x] + " ");
         }
         //return arr;
 }
	
	private static void removeDupsWList(Integer[] a)
	{
		ArrayList<Integer> myList = new ArrayList<Integer>();
		for(int i=0; i<a.length;i++)
		{
			if(!myList.contains(a[i]))
				myList.add(a[i]);		
		}
		int[] b =new int[myList.size()];
		for(int i=0; i<b.length; i++)
		{
			b[i] =myList.get(i);
		}
		
	}
}
