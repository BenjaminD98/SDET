package mandatoryHomeWork.week6;

import org.junit.Assert;
import org.junit.Test;

public class FaultyKeyboard {

	
	/*
	 * 
	 * 1.Understood question. Key for i in keyboard is faulty. It reverses the entire string before the i.
	 *   Input String
	 *   Ouptut String
	 *   Constraints 1 <= s.length <= 100
	 *      	     s consists of lowercase English letters.
	 *               s[0] != 'i'
	 * 2."benjamin" output ="majnebn"
	 *   "hi" output ="h"
	 *   "england" output="england"
	 *   "testing" output="tsetng"
	 *   "wowi" output="wow"
	 * 3.Solution known
	 * 4.1.Using brute force approach to reverse the string eact time i occurs in the string
	 *   2.Using StringBuilder and substring method to reverse the string each time i occurs
	 * 5.Pseudocode
	 *   1.Using for loop to iterate from 0 to string length
	 *   	a.Check if each character is i.
	 *   		1.If true, initlize charArray of length i and using another for loop from i to 0 decremented by 1
	 *   			a.Assign each character from the string to char array 
	 *   		2.assign string s as char array to string and concat with sustring of i+ to the end. 
	 *   5.Return string.
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
		Assert.assertEquals("majnebn", finalString("benjamin"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals("h", finalString("hi"));
	}

	@Test
	public void test3()
	{
		Assert.assertEquals("england", finalString("england"));		
	}
	
	@Test
	public void test4()
	{
		Assert.assertEquals("tsetng", finalString("testing"));
	}
	
	@Test
	public void test5()
	{
		Assert.assertEquals("wow", finalString("wowi"));
	}
	
	
	
	public String finalString(String s)
	{
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)=='i')
			{
				char[] newArr= new char[i];
				for(int j=i-1,k=0;j>=0;j--,k++)
				{
					newArr[k]=s.charAt(j);
				}
				s=String.valueOf(newArr)+s.substring(i+1, s.length());
				if(i==s.length())return s;
				if(s.charAt(i)=='i')i--;
			}

		}
		
		return s;
	}
}
