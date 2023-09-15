package mandatoryHomeWork.week6;

import org.junit.Test;
import org.junit.Assert;

public class SplitAStringInBalancedStrings {

	
	/*
	 * 
	 * 1.Understood question. A string is balanced if it contains equal number of L's and R's. Given string is balanced. Return the number of balanced strings that can be created by splitting the string
	 *   
	 *   Input String
	 *   Ouptut int
	 *   Constraints
	 *   	2 <= s.length <= 1000
	 *   	s[i] is either 'L' or 'R'
	 *   	s is a balanced string.
	 *   
	 *   
	 * 2."RLRLRRRLLLLLLRRRRL" output =5
	 * 	 "LRLRRL" output=3
	 *   "RLRLRL" output=3
	 *   "RRRRLLLL" output=1
	 *   
	 * 3.Solution known
	 * 
	 * 4.1.Adding balanced strings to a list and returning size 
	 *   2.Using a counter variable to check the number of balanced strings occurring
	 * 
	 * 5.Pseudocode
	 *   1.Using for loop to iterate from 0 to string length
	 *   	a.If the character at index of string has L increment the variable equalizer
	 *   	b.Else decrement the variable equalizer
	 *   	c.If equalizer is zero add to count
	 *   2.Return count
	 * 
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
		Assert.assertEquals(5, balancedStringSplit("RLRLRRRLLLLLLRRRRL"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(3, balancedStringSplit("LRLRRL"));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(3, balancedStringSplit("RLRLRL"));
	}
	
	@Test
	public void test4()
	{
		Assert.assertEquals(1, balancedStringSplit("RRRRLLLL"));
	}
			 
	public int balancedStringSplit(String s) {
		int count=0,equalizer=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='L') equalizer++;
			else equalizer--;
			if(equalizer==0) count++;
		}
		return count;
	}
	
}
