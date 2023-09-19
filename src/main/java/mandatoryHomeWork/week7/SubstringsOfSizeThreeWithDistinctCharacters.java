package mandatoryHomeWork.week7;

import org.junit.Assert;
import org.junit.Test;

public class SubstringsOfSizeThreeWithDistinctCharacters {

	
	/*
	 * 
	 * A string is good if there are no repeated characters. Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.
	 * 
	 * 1.Input String
	 *   Output int
	 *   Constraint 
	 *   	1 <= s.length <= 100
	 *   	s​​​​​​ consists of lowercase English letters.
	 *   
	 * 2. s="abcdefghijklmnopqrstuvwxyz", Output= 24
	 *    s="a", Output= 0
	 *    s="xyz", Output= 1
	 *    s="aaaaa" output=0
	 *    s="" output= 0
	 *    
	 * 3.Solution known
	 * 
	 * 4.a.Using two for loops of lengths of length of s and 3.
	 *   b.Using sliding window
	 *   
	 *   
	 * 5. Pseudocode
	 * 	 a.If the length of s is less than 3 return 0
	 * 	 b.Init variable i with value 2 and int goodStrings
	 *   c.Initialize while loop with condition i less than string length 
	 *   	a.If values in indices i and i-1 and i-2 are not equal increment variable goodStrings
	 *   	b.increment value of i
	 *   c.Return goodStrings
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
		Assert.assertEquals(24, countGoodSubstrings("abcdefghijklmnopqrstuvwxyz"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(0, countGoodSubstrings("a"));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(0, countGoodSubstrings("aaaaaaa"));
	}
	
	@Test
	public void test4()
	{
		Assert.assertEquals(1, countGoodSubstrings("xyz"));
	}
	
	@Test
	public void test5()
	{
		Assert.assertEquals(0, countGoodSubstrings(""));
	}
	
	public int countGoodSubstrings(String s)
	{
		int i=2,goodStrings=0;
		if(s.length()<3) return 0;
		while(i<s.length())
		{
			if(s.charAt(i)!=s.charAt(i-1)&&s.charAt(i)!=s.charAt(i-2)&&s.charAt(i-1)!=s.charAt(i-2))
			{
				goodStrings++;
			}
			i++;
		}
		
		return goodStrings;
	}
}
