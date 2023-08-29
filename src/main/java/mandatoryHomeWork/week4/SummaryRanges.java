package mandatoryHomeWork.week4;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

	
	/*
	 * 
	 * 1.Understood question. Split the array into ranges from the array..
	 * 2.{-25,-22,-21,-20,-19,-18.-17,-16,0,1,2,3,4,88,89,90,91} output= {"-25","-22->-16,"0->4","88->91"}
	 *   {0,1,2,3,4,5,6,7,8,9,10} output= {"0->10"}
	 *   {0} output= {"0"}
	 *   {-19,-18,-17,-16,-15,-14,-13,-12,-11} output= {"-19->-11"}
	 *   {} output={}
	 * 3.Solution known
	 * 4.1.Using for loop to check if each number is consecutive
	 *   2.Using ascii value to check if the numbers aare consecutive
	 * 5.Pseudocode
	 *   1.Initialize ArrayList of type string with name newList and variables min,max.
	 *   2.Initialize for loop from 0 to length
	 *     1.initialize min and max with ith element of the array nums.
	 *     2.if the i plus 1st element is equal to ith element plus 1 vale of i plus 1st element is assigned to max
	 *     3.if 
	 *   4.Return sum
	 * 6.Dry run successful for pseudocode on test data written.
	 * 7.Code written in notepad.
	 * 8.Dry running code successful.
	 * 9.Code written below.
	 * 10.Testing and debugging in IDE to be done.
	 * 11.Code Optimization to be done if needed.
	 * 
	 */
	
	public List<String> summaryRanges_lc228(int[] nums)
	{
		List<String> newList= new ArrayList<String>();
		int min=0,max=0;
		boolean flag=false;
		for(int i=0;i<nums.length-1;i++)
		{
			if(flag==false)
			{
				min=nums[i];
				flag=true;
			}
			if((nums[i]+1)==nums[i+1])
			{
				continue;
			}
			else {
				max=nums[i];
				if(min==max)newList.add("max");
				else newList.add(min+"->"+max);
				flag=false;
			}
			
		}
		return newList;
		
	}
	
}
