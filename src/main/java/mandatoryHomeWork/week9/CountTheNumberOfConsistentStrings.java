package mandatoryHomeWork.week9;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class CountTheNumberOfConsistentStrings {
	
	/*
	 * 
	 * You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed. Return the number of consistent strings in the array words.
	 *  
	 *  
	 * 1.Input String , String[]
	 *   Output int
	 *   Constraint 
	 *   	1 <= words.length <= 104
	 *   	1 <= allowed.length <= 26
	 *   	1 <= words[i].length <= 10
	 *   	The characters in allowed are distinct.
	 *   	words[i] and allowed contain only lowercase English letters.
	 * 
	 * 2. allowed = "bn", words = {"benjamin","b","x","bbbbbnnnnn"}, Output = 2
	 *    allowed = "qwerty", words = {"q","w","e","r","t","y"}, Output = 6
	 *    allowed = "b", words = {"a","b","c","d"}, Output = 1
	 *    allowed = "a", words = {"a"}, Output = 1
	 *    allowed = "qwertyuiopasdfghjklzxcvbnm", words = {"hello","there","this","is","a","sentence","with","exactly","ten","words"}, Output = 10
	 * 
	 * 3.Solution known
	 * 
	 * 4.a.Using HashSet
	 *   b.Using brute force
	 *   
	 *   
	 * 5. Pseudocode
	 * 	 a.Init int variables count, stringNumber and pointer and assign their values to 0 .
	 * 	 b.Initialize new hashset with type character.
	 *   c.Initialize while loop with condition where pointer is less than length of allowed.
	 *   	a.Add all characters in allowed to hashset.
	 *   	b.Increment pointer
	 *   d.Initialize while loop with condition pointer is less than length of stones
	 *   	a.Set pointer to 0.
	 *   	b.Initiate while loop with condition pointer is less than length of string in index stringNumber of words.
	 *   		a.If the set does not contain the character in index pointer of string in index stringNumber of words, break the while loop
	 *   		b.Increment pointer
	 *   		c.If pointer is equal to the length of the string in index stringNumber of words, increment count
	 *   	c.Increment the value of stringNumber
	 *   f.Return count.
	 *   
	 *   Time Complexity  - O(N)
	 *   Space Complexity - O(1)
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
		Assert.assertEquals(2, countConsistentStrings("bn",new String[] {"benjamin","b","x","bbbbbnnnnn"}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(6, countConsistentStrings("qwerty",new String[] {"q","w","e","r","t","y"}));
	}

	
	@Test
	public void test3()
	{
		 Assert.assertEquals(1, countConsistentStrings("b",new String[] {"a","b","c","d"}));
	}

	@Test
	public void test4()
	{
		Assert.assertEquals(1, countConsistentStrings("a",new String[] {"a"}));
	}
	
	@Test
	public void test5()
	{
		Assert.assertEquals(10, countConsistentStrings("qwertyuiopasdfghjklzxcvbnm",new String[] {"hello","there","this","is","a","sentence","with","exactly","ten","words"}));
	}

	
	public int countConsistentStrings(String allowed, String[] words)
	{
		int count = 0, stringNumber = 0, pointer = 0;
		Set<Character> set = new HashSet();
		while(pointer<allowed.length())
		{
			set.add(allowed.charAt(pointer++));
		}
		while(stringNumber<words.length)
		{
			pointer=0;
			while(pointer<words[stringNumber].length())
			{
				if(!set.contains(words[stringNumber].charAt(pointer))) break;
				pointer++;
				if(pointer==words[stringNumber].length()) count++;
			}
			stringNumber++;
		}
		
		return count;
	}
}
