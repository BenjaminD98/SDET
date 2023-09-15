package mandatoryHomeWork.week6;

import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsInAString {

	
	/*
	 * 
	 * 1.Understood question. Given a string s reverse each word in the string
	 *   
	 *   Input String
	 *   Ouptut String
	 *   Constraints
	 *   	1 <= s.length <= 5 * 104
	 *   	s contains printable ASCII characters.
	 *   	s does not contain any leading or trailing spaces.
	 *   	There is at least one word in s.
	 *   	All the words in s are separated by a single space.
	 *   
	 *   
	 * 2."this is the first string" output ="siht si eht tsrif gnirts"
	 * 	 "a" output="a"
	 *   "1 2 3 4 5 6 7" output="1 2 3 4 5 6 7"
	 *   "My name's Benjamin" output="yM s'eman nimajneB"
	 *   
	 * 3.Solution known
	 * 
	 * 4.1.Using a for loop and function to reverse the words in a string
	 *   2.Using split fnction to split the array and using string builder
	 * 
	 * 5.Pseudocode
	 * 	 1.Add white space to the last position of the string
	 *   2.Initialize for loop to iterate from 0 to string length
	 *   	a.if char at index i of s is white space call function reverse with substring as word
	 *   3.After function returns the reversed word concatenate with the string in the same positions as before.
	 * ` 4.Using for loop to iterate from index before string length to half of string length
	 *   	a.Assign each character from the string to char array in reverse 
	 *   5.Return string after trimming spaces
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
		Assert.assertEquals("siht si eht tsrif gnirts", reverseWords("this is the first string"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals("a", reverseWords("a"));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals("1 2 3 4 5 6 7", reverseWords("1 2 3 4 5 6 7"));
	}
	
	@Test
	public void test4()
	{
		Assert.assertEquals("yM s'eman nimajneB", reverseWords("My name's Benjamin"));
	}
	
	
	public String reverseWords(String s)
	{
		s=s+" ";
		int firstPosition=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				if(firstPosition==0)
				{
					s=reverse(s.substring(0, i))+s.substring(i,s.length());
					firstPosition=i+1;
				}
				else
				{
					s=s.substring(0, firstPosition)+reverse(s.substring(firstPosition, i))+s.substring(i,s.length());
					firstPosition=i+1;
				}
			}
		}
		
		return s.trim();
	}
	
	public String reverse(String s)
	{
		if(s==null) return null;
		char[] chArr=s.toCharArray();
		char ch;
		for(int j=s.length()-1,k=0;j>=s.length()/2;j--,k++)
		{
			ch=chArr[k];
			chArr[k]=chArr[j];
			chArr[j]=ch;
		}
		
		return String.valueOf(chArr);
	}
	
	
}
