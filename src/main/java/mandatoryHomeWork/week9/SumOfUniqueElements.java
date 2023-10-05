package mandatoryHomeWork.week9;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class SumOfUniqueElements {

	/*
	 * 
	 * You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array. Return the sum of all the unique elements of nums.
	 * 
	 * 1.Input  int[]
	 *   Output int
	 *   Constraint 
	 *   	1 <= nums.length <= 100
	 *   	1 <= nums[i] <= 100
	 * 
	 * 2. nums = {1,2,3,3,3,3,4,4}, Output = 3
	 *    nums = {1,2,3,4,5}, Output = 15
	 *    nums = {1,1,2,2,3,3}, Output = 0
	 *    nums = {1}, Output = 1
	 *    nums = {1,1,1,1,1}, Output=0
	 * 
	 * 3.Solution known
	 * 
	 * 4.a.Using HashMap
	 *   b.Using brute force
	 *   
	 *   
	 * 5. Pseudocode
	 * 	 a.Init int variables sum and pointer and assign their values to 0 .
	 * 	 b.Initialize new hashset with type integer.
	 *   c.Initialize while loop with condition where pointer is less than length of nums.
	 *   	a.Increment value for each key in hashmap.
	 *   	b.Increment pointer
	 *   d.Initialize for each loop for all keys in the keyset of the map
	 *   	a.If the value in key in hashmap is 1, add key to sum..
	 *   e.Return sum.
	 *   
	 *   Time Complexity  - O(N)
	 *   Space Complexity - O(N)
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
		Assert.assertEquals(3, sumOfUnique(new int[] {1,2,3,3,3,3,4,4}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(15, sumOfUnique(new int[] {1,2,3,4,5}));
	}
	 
	@Test
	public void test3()
	{
		Assert.assertEquals(0, sumOfUnique(new int[] {1,1,2,2,3,3}));
	}

	@Test
	public void test4()
	{
		Assert.assertEquals(1, sumOfUnique(new int[] {1}));
	}
	
	@Test
	public void test5()
	{
		Assert.assertEquals(0, sumOfUnique(new int[] {1,1,1,1,1}));
	}
	
	public int sumOfUnique(int[] nums)
	{
		int sum = 0, pointer = 0;
		Map<Integer,Integer> map = new HashMap();
		while(pointer<nums.length)
		{
			map.put(nums[pointer],map.getOrDefault(nums[pointer], 0)+1);
			pointer++;
		}
		for(int key : map.keySet())
		{
			if(map.get(key)==1) sum += key;
		}
		return sum;
	}
}
