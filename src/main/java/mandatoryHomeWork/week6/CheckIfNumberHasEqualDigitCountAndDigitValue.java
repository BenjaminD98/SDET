package mandatoryHomeWork.week6;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfNumberHasEqualDigitCountAndDigitValue {

	
	/*
	 * 
	 * 1.Understood question. Given a string num consisting of digits return true if the digit i occurs num[i] times in num else return false
	 *   
	 *   Input String
	 *   Ouptut boolean
	 *   Constraints
	 *   	n == num.lengthn == num.length
	 *   	1 <= n <= 10
	 *   	num consists of digits.
	 *   
	 *   
	 * 2."1210" output =true
	 * 	 "030" output=false
	 *   "1111" output=false
	 *   
	 * 3.Solution known
	 * 
	 * 4.1.Using an ascii array to find occurrences and compute if equals
	 *   2.Using two for loops to check values
	 * 
	 * 5.Pseudocode
	 * 	 1.Initialize ascii array of length same as length of nums
	 *   2.Initialize for loop to iterate from 0 to string length
	 *   	a.increment value in ascii array each time value occurs in string 
	 *   3.Initialize for loop from 0 to string length
	 *   	a.Check if each value in nums occurs same number of times in ascii array
	 *   		1.if it returns false return false 
	 *   4.Return true
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
		Assert.assertTrue(digitCount("1210"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertFalse(digitCount("030"));
	}
	
	@Test
	public void test3()
	{
		Assert.assertFalse(digitCount("1111"));
	}
	
	public boolean digitCount(String num)
	{
		int[] count=new int[10];
		for(int i=0;i<num.length();i++)
		{
			count[num.charAt(i)-'0']++;
		}
		for(int i=0;i<num.length();i++)
		{
			if(count[i]!=num.charAt(i)-'0')
			{
				return false;
			}
		}
		return true;
	}
}
