package mandatoryHomeWork.week6;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

public class HeightChecker {

	

	/*
	 * 
	 * 1.Understood question. Given an array of height of students supposed to be in increasing order. But it is not. find the number of students who are not in order
	 *   Input int[]
	 *   Output int
     *   Constraints 1 <= heights.length <= 100
     *               1 <= heights[i] <= 100
	 * 2.{10,1,65,32,21,99} output =4
	 *   {1,1,1,1,1,1} output=0
	 *   {10,20,30,40} output =0
	 * 3.Solution known
	 * 4.1.Using sort creating a clone array and find varying values in each position in array and count
	 *   2.Using mismatch and copyOfRange methods to find the mismatched indices after sorting
	 * 5.Pseudocode
	 *   1.Initializing variable count  to count mismatches
	 *   2.Initializing int array expected and cloning the values of heights to expected and sort expected array
	 *   3.Initialize for loop from 1 to length of heights
	 *   	a. Check if values in index of i in heights and index of i in expected do not match
	 *   		1. If it returns true increment the value of count.
	 *   4.Return count.
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
		int[] newArr={10,1,65,32,21,99};
		Assert.assertEquals(4, heightChecker(newArr));
	}
			 
	@Test
	public void test2()
	{
		int[] newArr={1,1,1,1,1,1};
		Assert.assertEquals(0, heightChecker(newArr));
	}
	
	@Test
	public void test3()
	{
		int[] newArr={10,20,30,40};
		Assert.assertEquals(0, heightChecker(newArr));		
	}
	
	public int heightChecker(int[] heights) {
		int count=0;
		int[] expected=heights.clone();
		Arrays.sort(expected);
		for(int i=0;i<heights.length;i++)
		{
			if(heights[i]!=expected[i])count++;
		}
		return count;
	}
}
