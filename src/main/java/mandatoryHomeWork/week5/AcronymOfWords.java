package mandatoryHomeWork.week5;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;

public class AcronymOfWords {
	
	/*
	 * 
	 * 1.Understood question. An acronym of words can be formed by concatenating the first character of each string in words in order
	 * 2.{"Belgium","England","Netherlands","Japan","Australia","Maldives","India","New Zealand"} s="BENJAMIN" output true
	 *   {"a"} s="a" output=true
	 *   {"abcd"} s="a" output = false
	 * 3.Solution known
	 * 4.1.Using String Builder to concat first letter from each words in the array using for loop and append function
	 *   2.Using strings and concat for adding values to an empty string.
	 * 5.Pseudocode
	 *   1.Initialize String Builder with length as length of string array
	 *   2.Initialize for loop from 0 to length-1 with iteration of i+1
	 *     1.Append values from ith word in the array using charAt function to access the first character
	 *   3.Convert string builder to string using toString function
	 *   4.Check if the true strings are eqal and return boolean value.
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
		String[] list={"belgium","england","netherlands","japan","australia","maldives","india","new zealand"};
		List<String> words= Arrays.asList(list);
		Assert.assertEquals(true, isAcronym(words,"benjamin"));;
	}
	
	@Test
	public void test2()
	{
		String[] list={"abcd"};
		List<String> words= Arrays.asList(list);
		Assert.assertEquals(true, isAcronym(words,"a"));
	}
	
	@Test
	public void test3()
	{
		String[] list={"central processing unit"};
		List<String> words= Arrays.asList(list);
		Assert.assertEquals(false, isAcronym(words,"cdu"));
	}
	
	
	public boolean isAcronym(List<String> words, String s) {
        
		StringBuilder sb= new StringBuilder(words.size());
		for(int i=0;i<words.size();i++)
		{
			sb.append(words.get(i).charAt(0));
		}
		
		
		return sb.toString().equals(s);
    }
	

}
