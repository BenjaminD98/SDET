package mandatoryHomeWork.week5;

import org.junit.Test;
import org.junit.Assert;

public class MaximumNumberOfWords {
	
	
	/*
	 * 
	 * 1.Understood question. Given an array of strings find the string with maximum number of words separated by white spaces
	 * 2.{"This is a program", "This is a longer string", "The third string is longer than the first and second"}  output 10
	 * 	 {"qwerty"}  output 1
	 *   {"a","b","c","d"} output 1
	 * 3.Solution known
	 * 4.1.Using two for loops and counting the number of white spaces and adding 1 to count number of words in each string and adding by 1.
	 *   2.Using variable max and string trim function which gives an array of words and calculate size of each array to get max
	 * 5.Pseudocode
	 *   1.Initializing variable max.
	 *   2.Initialize for loop from 0 to length-1 of string array with iteration of i+1
	 *     1. Initialize for loop from 0 to length-1 of each strig in the array with iteration of i+1
	 *        a. Count number of white spaces by iterating through the string and add by 1
	 *        b. Check if the max is greater than the previous value and assign to max. 
	 *   3.Return max
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
		String[] s= {"This is a program", "This is a longer string", "The third string is longer than the first and second"};
		Assert.assertEquals(10, mostWordsFound(s));
	}
	
	@Test
	public void test2()
	{
		String[] s= {"qwerty"};
		Assert.assertEquals(1, mostWordsFound(s));
	}
	
	@Test
	public void test3()
	{
		String[] s= {"a","b","c","d"};
		Assert.assertEquals(1, mostWordsFound(s));
	}
	
	@Test
	public void test4()
	{
		String[] s= {"This is a program", "This is a longer string", "The third string is longer than the first and second"};
		Assert.assertEquals(10, mostWordsFound2(s));
	}
	
	@Test
	public void test5()
	{
		String[] s= {"qwerty"};
		Assert.assertEquals(1, mostWordsFound2(s));
	}
	
	@Test
	public void test6()
	{
		String[] s= {"a","b","c","d"};
		Assert.assertEquals(1, mostWordsFound2(s));
	}
	
	public int mostWordsFound(String[] sentences)
	{
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<sentences.length;i++)
		{
			int count=1;
			for(int j=0;j<sentences[i].length();j++)
			{
				if(sentences[i].charAt(j)==' ')
				{
					count++;
				}
			}
			if(count>max)
			{
				max=count;
			}
		}
		
		
		return max;
	}
	
	public int mostWordsFound2(String[] sentences)
	{
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<sentences.length;i++)
		{
			int count=0;
			
			String[] words=sentences[i].split(" ");
			count+=words.length;
			
			if(count>max)
			{
				max=count;
			}
		}
		
		return max;
	}

}
