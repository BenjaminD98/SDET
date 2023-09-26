package mandatoryHomeWork.week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfArithmeticTriplets {
	
	/*
	 * 
	 * Given a 0-indexed, strictly increasing integer array nums and a positive integer diff, Return the number of unique arithmetic triplets.
	 * 
	 * 1.Input int[], int
	 *   Output int
	 *   Constraint 
	 *   	3 <= nums.length <= 200
	 *   	0 <= nums[i] <= 200
	 *   	1 <= diff <= 50
	 *   	nums is strictly increasing.
	 *   
	 * 2. nums={1,3,5,7,9,13} diff=4 output=2
	 *    nums={0,1,2,3,4,5,6,7,8} diff=1 output=7
	 *    nums={100,200,300} diff=2 output=0
	 *    nums={0,1,2,3,4,5,6} diff=3 output=1
	 *    nums={0,1,2,3,4,5} diff=6 output=0
	 *    
	 * 3.Solution known
	 * 
	 * 4.a.Using two for loops and two pointers
	 *   b.Using three pointers
	 *   
	 *   
	 * 5. Pseudocode
	 * 	 a.Initiate a hashset of type integer
	 * 	 b.Init variables first, second and count
	 *   c.Initialize for loop from 0 to length of nums 
	 *   	a.Add values in the index i of nums to the hashset
	 *   d.Initiate while loop with condition second pointer is less than length of nums
	 *   	a.If value in index second of nums is equal to the added value of index first of nums and diff
	 *   		1.And if the hashset contains added value of index second of nums and diff, then increment count.
	 *   		2.Increment first and second
	 *   		b.Else if the added vales of index first in nums and diff is less than value in index second of nums then increment first
	 *   		c.b.Else if the added vales of index first in nums and diff is greater than value in index second of nums then increment second
	 *   e.Return count
	 *    
	 * 6.Dry run successful for pseudocode on test data written.
	 * 7.Code written in notepad.
	 * 8.Dry running code successful.
	 * 9.Code written below in IDE.
	 * 10.Testing and debugging in IDE to be done.
	 * 11.Code Optimization to be done if needed.
	 */
	
	
	@Test
	public void test1()
	{
		Assert.assertEquals(2, arithmeticTriplets(new int[] {1,3,5,7,9,13},4));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(7, arithmeticTriplets(new int[] {0,1,2,3,4,5,6,7,8},1));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(0, arithmeticTriplets(new int[] {100,200,300},2));
	}
	
	@Test
	public void test4()
	{
		Assert.assertEquals(1, arithmeticTriplets(new int[] {0,1,2,3,4,5,6},3));
	}
	
	@Test
	public void test5()
	{
		Assert.assertEquals(0, arithmeticTriplets(new int[] {0,1,2,3,4,5},6));
	}
	
	public int arithmeticTriplets(int[] nums, int diff)
	{
		HashSet<Integer> arrList=new HashSet();
		int first=0,second=1,count=0;
		for(int num=0;num<nums.length;num++)
		{
			arrList.add(nums[num]);
		}
		while(second<nums.length)
		{
			if(nums[second]==nums[first]+diff)
			{
				if(arrList.contains(nums[second]+diff))count++;
				first++;
				second++;
			}
			else if(nums[second]<nums[first]+diff)
			{
				second++;
			}
			else
			{
				first++;
			}
		}
		
		return count;
	}

}
