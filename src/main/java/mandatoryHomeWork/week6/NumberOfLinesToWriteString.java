package mandatoryHomeWork.week6;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfLinesToWriteString {

	
	/*
	 * 
	 * 1.Understood question. Number of lines to write a string. Each character in the lower case alphabet is given a width. They are divided into line, each of width 100.
	 *   
	 *   Input int[], String
	 *   Ouptut int[]
	 *   Constraints widths.length == 26
	 *   2 <= widths[i] <= 10
	 *   1 <= s.length <= 1000
	 *   s contains only lowercase English letters.
	 *   
	 *   
	 * 2."benjamin" width={10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10} output= {1,80}
	 *   "qwertyuioplkjhgfdsamnbvcxz" width={10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10} output= {3,60}
	 *   "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz" width={10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10} output= {6,20}
	 *   "hello" width={2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2} output= {1,10}
	 *   
	 * 3.Solution known
	 * 
	 * 4.1.Using brute force approach and for loop to check the line total
	 *   2.Using for loop and an array list to add count to variables
	 * 
	 * 5.Pseudocode
	 * 	 1.Initializing int array of length 2
	 *   2.Using for loop to iterate from 0 to string length
	 *   	a.Using ASCII value check if the width of the line in position 1 of array does not exceed 100 when added
	 *   		1.If true add to the width of the line in position 1 of array
	 *   	b.Else increment the value of line number in index 0 of the int array and reset value to width of the element.
	 *   3.Return the array
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
		int[] widths={10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		int[] result={1,80};
		Assert.assertArrayEquals(result, numberOfLines(widths,"benjamin"));
	}
	
	@Test
	public void test2()
	{
		int[] widths={10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		int[] result={3,60};
		Assert.assertArrayEquals(result, numberOfLines(widths,"qwertyuioplkjhgfdsamnbvcxz"));
	}
	
	@Test
	public void test3()
	{
		int[] widths={10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		int[] result={6,20};
		Assert.assertArrayEquals(result, numberOfLines(widths,"abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"));
	}
	
	@Test
	public void test4()
	{
		int[] widths={2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
		int[] result={1,10};
		Assert.assertArrayEquals(result, numberOfLines(widths,"hello"));
	}
	
	public int[] numberOfLines(int[] widths, String s)
	{
		int[] result= {1,0};
		for(int i=0;i<s.length();i++)
		{
			if(result[1]+widths[s.charAt(i)-'a']<=100)
			{
				result[1]+=widths[s.charAt(i)-'a'];
			}
			else
			{
				result[0]++;
				result[1]=widths[s.charAt(i)-'a'];
			}
		}
		return result;
	}
	
}
