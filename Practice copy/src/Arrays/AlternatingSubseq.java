package Arrays;

/*Given an array of numbers, find the longest alternating subsequence. 
 * That is, a subsequence [a1, a2, a3, ..., ak] where a1 > a2, a3 < a2, a4 > a3, ... 
 * or vice versa (Graphically looks like /\/\/\... or \/\/\/\....
 * 
 * */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AlternatingSubseq {
	
	public static void main(String[] args)
	{
		int[] nums = {1, 2, 51, 50, 60, 55, 70, 68, 80, 76, 75, 12, 45};
		printSeq(nums);
	}

	private static void printSeq(int[] nums) {
		boolean nxtAscDir = false;
		boolean dirFix = false;
		int start = 0;
		HashMap< Integer, Integer> tracker = new HashMap<>();
		int i=1;
		int numOfElements = 0;
		for(; i<nums.length; i++)
		{
			//Fixing the direction 
			if(!dirFix && nums[start] < nums[i])
			{
				nxtAscDir = false;
				dirFix = true;
				continue;
			}else if(!dirFix && nums[start] > nums[i]){
				nxtAscDir = true;
				dirFix = true;
				continue;
			}
			
			//check if the next node is appropriate
			if(!nxtAscDir && nums[i-1] > nums[i])
			{
				System.out.println("1Good pair: " + nums[i-1] + "  &  " + nums[i] + "  supposed to be  "+ nxtAscDir);
				//its good
				nxtAscDir = true;
				System.out.println("-----------> nxtAscDir:" + nxtAscDir);
			}else if(!nxtAscDir && nums[i-1] < nums[i]){
				//not good
				System.out.println("2Bad pair: " + nums[i-1] + "  &  " + nums[i] + "  supposed to be  "+ nxtAscDir);
				if(tracker.isEmpty())
				tracker.put(start, i-1);
				start = i-1;
				nxtAscDir = false;
				System.out.println("-----------> nxtAscDir:" + nxtAscDir + "  start: " + start);
			}else if(nxtAscDir && nums[i-1] < nums[i]){
				System.out.println("3Good pair: " + nums[i-1] + "  &  " + nums[i] + "  supposed to be  "+ nxtAscDir);
				//its good
				nxtAscDir = false;
				System.out.println("-----------> nxtAscDir:" + nxtAscDir);
			}else if(nxtAscDir && nums[i-1] > nums[i]){
				System.out.println("4Bad pair: " + nums[i-1] + "  &  " + nums[i] + "  supposed to be  "+ nxtAscDir);
				//not good
				tracker.put(start, i-1);
				start = i-1;
				nxtAscDir = false;
				System.out.println("-----------> nxtAscDir:" + nxtAscDir + "  start: " + start);
			}
			
		}
		tracker.put(start, i-1);
		System.out.println(tracker);
		
		Iterator itr = tracker.entrySet().iterator();
		Map.Entry<Integer, Integer> pair1 = (Map.Entry) itr.next();
		Map.Entry<Integer, Integer> pair2;
		int maxSubLen = pair1.getValue() - pair1.getKey();
		//System.out.println(pair);
		while(itr.hasNext()){
			pair2 = (Map.Entry) itr.next();
			if(maxSubLen < pair2.getValue() - pair2.getKey()){
				pair1 = pair2;
				maxSubLen = pair2.getValue() - pair2.getKey();
			}
		}
		System.out.print("{ ");
		int k=pair1.getKey();
		for(; k < pair1.getValue(); k++)
		{
			System.out.print(nums[k] + ", ");
		}
		System.out.println(nums[k] + " }");
		
		
	}

}
class tracker{
	int start;
	int end;
	int diff = end - start;
}
