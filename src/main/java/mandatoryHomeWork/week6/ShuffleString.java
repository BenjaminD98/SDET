package mandatoryHomeWork.week6;

import org.junit.Assert;
import org.junit.Test;

public class ShuffleString {
	
	/*
	 * 
	 * 1.Understood question. Given a string s and an integer array indices of the same length, shuffle string s such that the character at the ith position moves to indices[i] in the shuffled string
	 *   
	 *   Input int[], String
	 *   Ouptut String
	 *   Constraints
	 *   	s.length == indices.length == n
	 *   	s consists of only lowercase English letters
	 *   	0 <= indices[i] < n
	 *   	1 <= n <= 100
	 *   	All values of indices are unique.
	 *   
	 *   
	 * 2."nimajneb" indices={7,6,5,4,3,2,1,0} output ="benjamin"
	 * 	 "a" indices={0} output="a"
	 *   "abcde" indices={0,1,2,3,4} output="abcde"
	 *   "tweqry" indices={4,1,2,0,3,5} output="qwerty"
	 *   
	 * 3.Solution known
	 * 
	 * 4.1.Using a for loop and char array to find each element from position of 0 to length of s
	 *   2.Using a hashmap to assign index as key and char in string as value and using for loop add value to String
	 * 
	 * 5.Pseudocode
	 *   1.Initialize char array of same length as string
	 *   2.Using for loop to iterate from 0 to string length
	 *   	a.Assign char at index of s to char array using index of indices array 
	 *   3.Return string after converting from char array
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
		int[] indices ={7,6,5,4,3,2,1,0};
		Assert.assertEquals("benjamin", shuffle("nimajneb",indices));
	}
	
	@Test
	public void test2()
	{
		int[] indices ={0};
		Assert.assertEquals("a", shuffle("a",indices));
	}
	
	@Test
	public void test3()
	{
		int[] indices ={0,1,2,3,4};
		Assert.assertEquals("abcde", shuffle("abcde",indices));
	}
	
	@Test
	public void test4()
	{
		int[] indices ={4,1,2,0,3,5};
		Assert.assertEquals("qwerty", shuffle("tweqry",indices));
	}
	
	public String shuffle(String s, int[] indices)
	{
		char[] ch=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			ch[indices[i]]=s.charAt(i);
		}
		return String.valueOf(ch);
	}

}
