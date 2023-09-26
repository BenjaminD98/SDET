package mandatoryHomeWork.week8;

import org.junit.Assert;
import org.junit.Test;

public class MinimumRecolorsToGetKConsecutiveBlackBlocks {

	/*
	 * 
	 * Given a 0-indexed string blocks of length n, where blocks[i] is either 'W' or 'B', representing the color of the ith block, Return the minimum number of operations needed such that there is at least one occurrence of k consecutive black blocks.
	 * 
	 * 1.Input String,int
	 *   Output int
	 *   Constraint 
	 *   	n == blocks.length
	 *   	1 <= n <= 100
	 *   	blocks[i] is either 'W' or 'B'
	 *   	1 <= k <= n
	 * 
	 * 2. s="BWWWBBWWWBBWBB" k=5, Output=1
	 *    s="BWWWWWB" k=4, Output= 3
	 *    s="W" k=1, Output= 1
	 *    s="BBBBBB" k=6, output= 0
	 * 
	 * 3.Solution known
	 * 
	 * 4.a.Using sliding window.
	 *   b.Using brute force
	 *   
	 *   
	 * 5. Pseudocode
	 * 	 a.Init variables count,left,right and result and assign their values to 0.
	 *   b.Initialize while loop with condition where right is less than k
	 *   	a.If value in index right in the string is W
	 *   		a.Increment count.
	 *   	b.Increment right.
	 *   c.Assign the value of count to result.
	 *   d.Initialize while loop with condition where right is less than k
	 *   	a.If value in index left in the string is W
	 *   		a.Decrement count.
	 *   	b.Increment left.
	 *   	c.If value in index right in the string is W
	 *   		a.Increment count.
	 *   	d.Increment right.
	 *   	e.If count is less than resul
	 *   		a.Assign value of count to result.
	 *   e.Return result.
	 *   
	 *   Time Complexity  - O(N)
	 *   Space Complexity - O(4) = O(1)
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
		Assert.assertEquals(1, minimumRecolors("BWWWBBWWWBBWBB",5));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(3, minimumRecolors("BWWWWWB",4));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(1, minimumRecolors("W",1));
	}
	
	@Test
	public void test4()
	{
		Assert.assertEquals(0, minimumRecolors("BBBBBB",6));
	}
	
	public int minimumRecolors(String blocks, int k) {
		int count=0,left=0,right=0,result=0;
		while(right<k)
		{
			if(blocks.charAt(right)=='W') count++;
			right++;
		}
		result=count;
		while(right<blocks.length())
		{
			if(blocks.charAt(left)=='W') count--;
			left++;
			if(blocks.charAt(right)=='W') count++;
			right++;
			if(count<result) result=count;
		}
		
		return result;
    }
}
