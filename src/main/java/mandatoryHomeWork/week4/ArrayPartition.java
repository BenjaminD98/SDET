package mandatoryHomeWork.week4;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartition {
	
	/*
	 * 
	 * 1.Understood question. Divide the input elements into pairs and take the minimum elements from the pairs to return the maximum sum.
	 * 2.{1,2,3,4,5,6} output= 9
	 *   {610,220,830,340,110,480,590,770} output= 1810
	 *   {0,0,0,0,0,0} output= 0
	 *   {-10,10,10,-10,10,-10} output=-10
	 * 3.Solution known
	 * 4.1.Using two for loops to split to pairs and finding min of each set and check max of these values
	 *   2.Sort the array and add the values in the even indexes in the array
	 * 5.Pseudocode
	 *   1.Initialize variable sum=0
	 *   2.Using Arrays.sort to sort the array nums
	 *   3.Initialize for loop from 0 to length-1 with iteration of i+2
	 *     1.Add values in the array in i indexes to sum
	 *   4.Return sum
	 * 6.Dry run successful for pseudocode on test data written.
	 * 7.Code written in notepad.
	 * 8.Dry running code successful.
	 * 9.Code written below.
	 * 10.Testing and debugging in IDE to be done.
	 * 11.Code Optimization to be done if needed.
	 */
	
	@Test
	public void test1()
	{
		int[] nums= {1,2,3,4,5,6};
		Assert.assertEquals(9, arrayPairSum(nums));
	}
	
	@Test
	public void test2()
	{
		int[] nums= {610,220,830,340,110,480,590,770};
		Assert.assertEquals(1810, arrayPairSum(nums));
	}
	
	@Test
	public void test3()
	{
		int[] nums= {0,0,0,0,0,0};
		Assert.assertEquals(0, arrayPairSum(nums));
	}
	
	@Test
	public void test4()
	{
		int[] nums= {-10,10,10,-10,10,-10};
		Assert.assertEquals(-10, arrayPairSum(nums));
	}
	
	public int arrayPairSum(int[] nums)
	{
		int sum=0;
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i+=2)
		{
			sum+=nums[i];
		}
		return sum;
		
	}

}
