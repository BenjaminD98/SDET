package mandatoryHomeWork.week5;

import org.junit.Assert;
import org.junit.Test;
public class SortingTheSentence {
	
	/*
	 * 
	 * 1.Understood question. Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence using the indices given at the end of each word
	 * 2."first4 This1 string5 the3 is2" output "This is the first string"
	 *   "Hello1" output="Hello"
	 *   "This1 string2 has3 nine4 words5 after6 adding7 extra8 words9" output "This string has nine words after adding extra words"
	 * 3.Solution known
	 * 4.1.Using brute force by iterating from 1 to number of words and finding index of each word and adding to new string
	 *   2.Using split function with white space as argument to split to string array and sorting according to indices at the end of the word 
	 * 5.Pseudocode
	 *   1.Initializing variable count to count the number of words by number of spaces and add 1 
	 *   2.Initialize for loop from 1 to count of spaces plus one
	 *   	a. Use indexOf to find the index of i in the string
	 *   	b. Using while loop to decrement from index of i to white space
	 *   		1. If j-1 is the first character of the string add the substring of j-1 to index of i.
	 *   		2. If j-1 is white space add substring from j to index of i.
	 *   5.Return string
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
		Assert.assertEquals("This is the first string", sortSentence("first4 This1 string5 the3 is2"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals("Hello", sortSentence("Hello1"));		
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals("This string has nine words after adding extra words", sortSentence("This1 string2 has3 nine4 words5 after6 adding7 extra8 words9"));
	}
	
	public String sortSentence(String s)
	{
		int words=1;
		String newString="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				words++;
			}
		}
		for(int i=1;i<=words;i++)
		{
			int index= s.indexOf(i+'0');
			System.out.println(index);
			if(!newString.equals(""))newString+=" ";
			for(int j=index;j>0;j--)
			{
				if(j-1==0)
				{
					newString+=s.substring(j-1, index);
					break;
				}
				else if(s.charAt(j-1)==' ')
				{
					newString+=s.substring(j,index);
					break;
				}
			}
		}
		return newString;
	}

}
