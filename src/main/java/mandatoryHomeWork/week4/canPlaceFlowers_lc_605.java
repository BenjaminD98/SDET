package mandatoryHomeWork.week4;

import org.junit.Assert;
import org.junit.Test;

public class canPlaceFlowers_lc_605 {
	
	/*
	 * 1.Understood the question. If a flower can be placed in a flowerbed. But not next to each other. Given an array and maximum flowers expectation. Return true of ralse.
	 * 2.Positive: {0,1,0,1} n=0 True
	 *   Negative: {1,0,1,0} n=5 False
	 *   Edge case: {0} n=1 true
	 *   Edge case: {0,0,0,0} n=2 true
	 * 3.Solution known
	 * 4.a.if 3 consecutive plots are available it can be planted using array and counter
	 *   b.Convert to String and use trim function using 1 to check the number of consecutive zeroes and add to counter.
	 * 5.Pseudocode:
	 *   1. Using solution a, we check if the first and last elements and the next and previous elements are zero respectively.
	 *   2. If they are 0 add to counter and set to 1.
	 *   3. Using for loop traverse through through the array
	 *      a. If the previous and next elements are zero and current element is also zero set to one and add 1 to counter
	 *   4. Check if expected value and counter are equal and return.
	 * 6.Dry run successful for pseudocode on test data written.
	 * 7.Code written in notepad.
	 * 8.Dry running code successful.
	 * 9.Code written below.
	 * 10.Testing and debugging in IDE to be done.
	 * 11.Code Optimization to be done if needed.
	 *   
	 */

	@Test
	public void test1()
	{
		int[] flowerbed= {0,1,0,1};
		Assert.assertTrue(canPlaceFlowers(flowerbed,0));
	}
	
	@Test
	public void test2()
	{
		int[] flowerbed= {1,0,1,0};
		Assert.assertFalse(canPlaceFlowers(flowerbed,5));
	}
	
	@Test
	public void test3()
	{
		int[] flowerbed= {0};
		Assert.assertTrue(canPlaceFlowers(flowerbed,1));
	}
	
	@Test
	public void test4()
	{
		int[] flowerbed= {0,0,0,0};
		Assert.assertTrue(canPlaceFlowers(flowerbed,2));
	}
	
	public boolean canPlaceFlowers(int[] flowerbed,int n)
	{
		int count=0;
		int i=0;
		if(flowerbed.length==1&&(flowerbed[0]==1))return n==0;
		if(flowerbed.length==1)return n<=1;
		if(flowerbed[1]==1)i=1;
		if((flowerbed[0]==0)&&(flowerbed[1]==0))
		{
			flowerbed[0]=1;
			count+=1;
			i=0;
		}
		if((flowerbed[flowerbed.length-1]==0)&&(flowerbed[flowerbed.length-2]==0))
		{
			flowerbed[flowerbed.length-1]=1;
			count+=1;
		}
		for(;i<flowerbed.length-1;i+=2)
		{
			if((flowerbed[i]==0)&&(flowerbed[i-1]==0)&&(flowerbed[i+1]==0))
			{
				flowerbed[i]=1;
				count+=1;
			}
			if(flowerbed[i+1]==1)i++;
		}
		return n<=count;
		
	}
}
