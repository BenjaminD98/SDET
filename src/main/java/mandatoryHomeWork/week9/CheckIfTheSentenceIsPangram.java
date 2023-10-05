package mandatoryHomeWork.week9;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfTheSentenceIsPangram {
	
	/*
	 * 
	 * Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
	 * 
	 * 1.Input String
	 *   Output boolean
	 *   Constraint 
	 *   	1 <= sentence.length <= 1000
	 *   	sentence consists of lowercase English letters.
	 * 
	 * 2. sentence = "qwertyuiopasdfghjklzxcvbnm", Output = true
	 *    sentence = "a", Output = false
	 *    sentence = "thequickbrownfoxjumpsoverthelazydog", Output = true
	 *    sentence = "Benjamin", Output = false
	 * 
	 * 3.Solution known
	 * 
	 * 4.a.Using HashSet
	 *   b.Using boolean array
	 *   
	 *   
	 * 5. Pseudocode
	 * 	 a.Init int variables pointer and assign the value to 0.
	 * 	 b.Initialize new hashset with type character.
	 *   c.Initialize while loop with condition where pointer is less than length of sentence.
	 *   	a.Add all characters in sentence to hashset.
	 *   	b.Increment pointer
	 *   d.If size of hashset is 26 return true;
	 *   e.Return false.
	 *   
	 *   Time Complexity  - O(N)
	 *   Space Complexity - O(N)
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
		Assert.assertEquals(true, checkIfPangram("qwertyuiopasdfghjklzxcvbnm"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(false, checkIfPangram("a"));
	}
	 
	@Test
	public void test3()
	{
		Assert.assertEquals(true, checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
	}

	@Test
	public void test4()
	{
		Assert.assertEquals(false, checkIfPangram("Benjamin"));
	}

	public boolean checkIfPangram(String sentence)
	{
		int pointer = 0;
		Set<Character> set = new HashSet();
		while(pointer<sentence.length())
		{
			set.add(sentence.charAt(pointer++));
		}
		if(set.size()==26) return true;
		return false;
	}
	
	public boolean checkIfPangram2(String sentence)
	{
		int pointer = 0;
		boolean[] check = new boolean[26];
		while(pointer<sentence.length())
		{
			check[sentence.charAt(pointer++)-'a'] = true;
		}
		for(boolean bool : check)
		{
			if(bool == false) return false;
		}
		return true;
	}
}
