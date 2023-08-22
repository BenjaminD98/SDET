package mandatoryHomeWork.week4;

import java.util.Arrays;
import org.junit.Test;

import org.junit.Assert;

public class setMismatch {
	
	/*
	 * 1.Given an array of unsorted integers. One of the number is repeated twice and one other is missing in it's place. Return an array of repeated number and the missing number. 
	 * 2.Positive: {1,5,6,2,3,4,6,8} result {6,7}
	 *   Positive: {1,3,2,4,3} result {3,5}
	 * 3.Solution known
	 * 4.a.Using two for loops to check if each element is present.
	 *   b.Using a for loop and an array to check the occurrence of each integer and another for loop to check which integer occurs once and which integer occurs twice  
	 *   c.Using a for loop and an array and in the same loop find the total sum of the array and subtract the value which occurs twice and return the values.
	 *   d.Using map since it does not accept duplicate values as key.  
	 * 5.Pseudocode:
	 *   1. Using solution c, initialize variables sumTotal and array newArr with size n+1.
	 *   2. Initialize for loop from 0 to length of array-1. 
	 *      a. Assign newArr with values from the original array by plus 1.
	 *      b. Using if condition to check if an integer occurs twice and store to duplicate
	 *      c. Add the value of i+1 to SumTotal
	 *      d. Assign values of duplicate and missing value to first two positions of array.
	 *   3. return a copy of the array with only two values..
	 * 7.Code written in notepad.
	 * 8.Dry running code successful.
	 * 9.Code written below in IDE.
	 * 10.Testing and debugging in IDE to be done.
	 * 11.Code Optimization to be done if needed.
	 * 
	 */
	
	@Test
	public void test1()
	{
		int[] nums= {1,5,6,2,3,4,6,8};
		int[] result={6,7};
		Assert.assertArrayEquals(result, findErrorNums(nums));
	}
	
	@Test
	public void test2()
	{
		int[] nums= {1,3,2,4,3};
		int[] result={3,5};
		Assert.assertArrayEquals(result, findErrorNums(nums));
	}
	
	public int[] findErrorNums(int[] nums)
	{
		int sumTotal=0;
		int[] newArr= new int[nums.length+1];
		
		for(int i=0;i<nums.length;i++) {
			newArr[nums[i]]++;
			sumTotal+=(i+1);
			sumTotal-=nums[i];
			if(newArr[nums[i]]==2)
			{
				nums[0]=nums[i];
				sumTotal+=nums[i];
			}
		}
		nums[1]=sumTotal;
		return Arrays.copyOf(nums, 2);
		
	}

}
