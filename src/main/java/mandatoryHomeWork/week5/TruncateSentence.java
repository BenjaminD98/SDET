package mandatoryHomeWork.week5;

import org.junit.Assert;
import org.junit.Test;

public class TruncateSentence {
	
	/*
	 * 
	 * 1. Understood question. Given a sentence s​​​​​​ and an integer k​​​​​​, truncate s​​​​​​ such that it contains only the first k​​​​​​ word
	 * 2. This is a string k=4 output: This is a string
	 * 	  This is a longer string k=2 output:This is
	 *    The third string is longer than the first and second k=11 output: The third string is longer than the first and second
	 * 3. Solution known
	 * 4. 1. Using a for loop and counter, count the number of spaces. when counter equals k return the substring of previous characters  
	 *    2. Using split function with space as argument, split the string into array of strings and return the first n number of words in a string
	 * 5. Pseudocode
	 *    1.Initializing for loop and iterate from 0 to string length-1 by iterating value of 1.
	 *   	a. check if character is space
	 *   		1. add to counter
	 *   	b. check if counter equals k
	 *   		1. return substring of 0 to i
	 *    3. Return string
	 * 6. Dry run successful for pseudocode on test data written.
	 * 7. Code written in notepad.
	 * 8. Dry running code successful.
	 * 9. Code written below.
	 * 10.Testing and debugging in IDE to be done.
	 * 11.Code Optimization to be done if needed.
	 */

	@Test
	public void test1()
	{
		Assert.assertEquals("This is a string", truncateSentence("This is a string",4) );
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals("This is", truncateSentence("This is a longer string",2) );
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals("The third string is longer than the first and second", truncateSentence("The third string is longer than the first and second",11) );
	}
	
	
	public String truncateSentence(String s, int k) {
		
		for(int i=0,counter =0;i<s.length();i++)
		{
			if(s.charAt(i)==' ') counter++;
			if(counter==k) return s.substring(0, i);
		}
		
		
		return s;
	}
}
