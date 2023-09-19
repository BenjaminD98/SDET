package mandatoryHomeWork.week7;

import org.junit.Assert;
import org.junit.Test;

public class SortArrayByParity {

	
	/*
	 * 
	 * Given an array of integers , sort the array by parity with even numbers followed by odd numbers
	 * Input: nums = [2,3,5,7,1,6,8,2] output={2,6,8,2,3,5,7,1}
	 * 
	 * 1.Input int[]
	 *   Output int[]
	 *   Constraint 
	 *   	1 <= nums.length <= 5000
	 *   	0 <= nums[i] <= 5000
	 *   
	 * 2. nums = [2,3,5,7,1,6,8,2], Output= {2,6,8,2,3,5,7,1}
	 *    nums = [8,2,4,6,1,7,4,9,2], Output: {8,2,4,6,4,2,1,7,9}
	 *    nums = [1,2,3,4], Output: {2,4,1,3}
	 *    nums = [2,6,3,7,1,5,9], Output: {2,6,3,7,1,5,9}
	 *    nums = [0,0,0,0,0], Output: {0,0,0,0,0}
	 *    
	 * 3.Solution known
	 * 
	 * 4.a.Using two for loops and swap variables
	 *   b.Using two pointers
	 *   
	 *   
	 * 5. Pseudocode
	 * 	 a.Initialize variables i,temp and j with values 0,0 and 1 respectively
	 * 	 b.Init while loop with condition i less than length of nums or j less than length of nums
	 *   	a.If i is even increment i and j
	 *   	b.Else increment j till it becomes even
	 *   		1.Swap values in indices i and j with assistance from temp
	 *   		2.Increment i.
	 *   c.Return nums
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
		Assert.assertArrayEquals(new int[]{2,4,3,1}, sortArrayByParity(new int[] {3,1,2,4}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertArrayEquals(new int[]{2,6,8,2,1,3,5,7}, sortArrayByParity(new int[] {2,3,5,7,1,6,8,2}));
	}
	
	@Test
	public void test3()
	{
		Assert.assertArrayEquals(new int[]{8,2,4,6,4,2,1,9,7}, sortArrayByParity(new int[] {8,2,4,6,1,7,4,9,2}));
	}
	
	@Test
	public void test4()
	{
		Assert.assertArrayEquals(new int[]{4,2,3,1}, sortArrayByParity2(new int[] {1,2,3,4}));
	}
	
	@Test
	public void test5()
	{
		Assert.assertArrayEquals(new int[]{2,6,3,7,1,5,9}, sortArrayByParity2(new int[] {2,6,3,7,1,5,9}));
	}
	
	@Test
	public void test6()
	{
		Assert.assertArrayEquals(new int[]{0,0,0,0,0}, sortArrayByParity2(new int[] {0,0,0,0,0}));
	}
	
	public int[] sortArrayByParity(int[] nums)
	{
		int first=0,second=1;
		while(second<nums.length)
		{
			if(nums[first]%2==0)
			{
				first++;
				second++;
			}
			else if((nums[first]%2!=0)&&(nums[second]%2==0))
			{
				int temp=nums[first];
				nums[first++]=nums[second];
				nums[second++]=temp;
			}
			else
			{
				second++;
			}
		}
		
		return nums;
	}
	
	public int[] sortArrayByParity2(int[] nums)
	{
		int first=0,second=nums.length-1;
		while(first<second)
		{
			if(nums[first]%2==0)
			{
				first++;
			}
			if(nums[second]%2!=0)
			{
				second--;
			}
			else if((nums[first]%2!=0)&&(nums[second]%2==0))
			{
				int temp=nums[first];
				nums[first++]=nums[second];
				nums[second--]=temp;
			}
		}
		return nums;
	}
}
