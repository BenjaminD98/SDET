package mandatoryHomeWork.week7;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThreshold {

	
	/*
	 * 
	 * Given an array of integers arr and two integers k and threshold, return the number of sub-arrays of size k and average greater than or equal to threshold.
	 * 
	 * 
	 * 1.Input int[],int,int
	 *   Output int
	 *   Constraint 
	 *   	1 <= arr.length <= 10^5
	 *   	1 <= arr[i] <= 10^4
	 *   	1 <= k <= arr.length
	 *   	0 <= threshold <= 10^4
	 *   
	 * 2.arr = [11,13,17,23,29,31,7,5,2,3] k=3 threshold= 5 output=6
	 *   arr = {2,2,2,2,5,5,5,8} k=3 threshold= 4 output=3
	 *   arr = {5,5,5,5,5,5,5} k=4 threshold= 4 output=4
	 *   arr = {1} k=2 threshold=2 output=0
	 *    
	 * 3.Solution known
	 * 
	 * 4.a.Using sliding window
	 *   b.Using brute force
	 *   
	 *   
	 * 5. Pseudocode
	 * 	 a.If length of array is less than k return 0
	 * 	 b.Init variables left, right, total and subStringCount as 0
	 *   c.Initialize while loop with condition right less than string length 
	 *   	a.If right is less than k add values in index right to total and if average is less than threshold increment subStringCount 
	 *   	b.Else
	 *   		1.Remove the value in index left from total and increment
	 *   		2.Add the value in index right to total and increment
	 *   		3.If average is less than threshold increment subStringCount
	 *   c.Return subStringCount
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
		Assert.assertEquals(6, numOfSubarrays(new int[] {11,13,17,23,29,31,7,5,2,3},3,5));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(3, numOfSubarrays(new int[] {2,2,2,2,5,5,5,8},3,4));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(3, numOfSubarrays(new int[] {5,5,5,5,5,5,5},4,4));
	}
	
	@Test
	public void test4()
	{
		Assert.assertEquals(0, numOfSubarrays(new int[] {1},2,2));
	}
	
	public int numOfSubarrays(int[] arr, int k, int threshold)
	{
		if(arr.length<k) return 0;
		int subStringCount=0,left=0,right=0,total=0;
		while(right<arr.length)
		{
			if(right<k)
			{
				total+=arr[right++];
				if(right==k-1&&total/k>=threshold) subStringCount++;
			}
			else
			{
				total-=arr[left++];
				total+=arr[right++];
				if(total/k>=threshold) subStringCount++;
			}
		}
		return subStringCount;
	}
}
