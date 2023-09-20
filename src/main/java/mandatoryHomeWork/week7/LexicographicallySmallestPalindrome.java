package mandatoryHomeWork.week7;

import org.junit.Assert;
import org.junit.Test;

public class LexicographicallySmallestPalindrome {

	/*
	 * 
	 * Given a string s consisting of lowercase English letters, you are allowed to perform operations on it. Make s a palindrome with the minimum number of operations possible.
	 * 
	 * 1.Input String
	 *   Output String
	 *   Constraint 
	 *   	1 <= s.length <= 1000
	 *   	s​​​​​​ consists of only lowercase English letters.
	 *   
	 * 2. s="abcdefghijklmnopqrstuvwxyz", Output= "abcdefghijklmmlkjihgfedcba"
	 *    s="a", Output= "a"
	 *    s="xyz", Output= "xyx"
	 *    s="aaaaa" output= "aaaaa"
	 *    
	 * 3.Solution known
	 * 
	 * 4.a.Using two pointers and string builder.
	 *   b.Using two pointers and char array
	 *   
	 *   
	 * 5. Pseudocode
	 * 	 a.Init string builder with s as input and left as 0 and right as index prior to string length
	 *   b.Initialize while loop with condition where left is less than right
	 *   	a.If value in index left is less than value in index right use setCharAt method to assign the value at left index to right index
	 *   	b.Else If value in index left is greater than value in index right use setCharAt method to assign the value at right index to left index
	 *   	c.Increment left
	 *   	d.Decrement right
	 *   c.Return after converting stringBuilder to String.
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
		Assert.assertEquals("abcdefghijklmmlkjihgfedcba", makeSmallestPalindrome("abcdefghijklmnopqrstuvwxyz"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals("a", makeSmallestPalindrome("a"));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals("aaaaa", makeSmallestPalindrome("aaaaa"));
	}
	
	@Test
	public void test4()
	{
		Assert.assertEquals("xyx", makeSmallestPalindrome("xyz"));
	}
	
	@Test
	public void test5()
	{
		Assert.assertEquals("abcdefghijklmmlkjihgfedcba", makeSmallestPalindrome2("abcdefghijklmnopqrstuvwxyz"));
	}
	
	@Test
	public void test6()
	{
		Assert.assertEquals("a", makeSmallestPalindrome2("a"));
	}
	
	@Test
	public void test7()
	{
		Assert.assertEquals("aaaaa", makeSmallestPalindrome2("aaaaa"));
	}
	
	@Test
	public void test8()
	{
		Assert.assertEquals("xyx", makeSmallestPalindrome2("xyz"));
	}
	
	
	public String makeSmallestPalindrome(String s)
	{
		StringBuilder sb= new StringBuilder(s);
		int left=0,right=sb.length()-1;
		while(left<right)
		{
			if(sb.charAt(left)<sb.charAt(right)) sb.setCharAt(right, sb.charAt(left));
			else if(sb.charAt(left)>sb.charAt(right)) sb.setCharAt(left, sb.charAt(right));
			left++;
			right--;
		}
		return sb.toString();
	}
	
	public String makeSmallestPalindrome2(String s)
	{
		char[] strToCharArray=s.toCharArray();
		int left=0,right=strToCharArray.length-1;
		while(left<right)
		{
			if(strToCharArray[left]<strToCharArray[right]) strToCharArray[right]=strToCharArray[left];
			else if(strToCharArray[left]>strToCharArray[right]) strToCharArray[left]=strToCharArray[right];
			left++;
			right--;
		}
		return String.valueOf(strToCharArray);
	}
}
