package mandatoryHomeWork.week7;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfSubstringsContainingAllThreeCharacters {
	
	/*
	 * 
	 * Given a string s consisting only of characters a, b and c,Return the number of substrings containing at least one occurrence of all these characters a, b and c.
	 * 
	 * 1.Input String
	 *   Output int
	 *   Constraint 
	 *   	3 <= s.length <= 5 x 10^4
	 *   	s only consists of a, b or c characters.
	 *   
	 * 2. s="abc" output =1
	 *    s="abbabc" output=4
	 *    s="aaaaaa" output=0
	 *    s="abababababc" output =9
	 *    s="cabcab" output=10
	 *    
	 * 3.Solution known
	 * 
	 * 4.a.Using two loops and ascii array
	 *   b.Using brute force
	 *   c.Using two loops and map
	 *   
	 *   
	 * 5. Pseudocode
	 * 	 a.Initiate a hashmap with character, integer
	 * 	 b.Init variables left, right and count
	 *   c.Initiate while loop with condition right is less than length of nums
	 *   	a.Add the character in right index of string to the map
	 *   	b.Initiate while loop with condition left is less than right and map size is 3
	 *   		1.Add length of string minus the position of right to count
	 *   		2.Remove the character in the left index of string from the map
	 *   		3.Increment value of left
	 *   	c.Increment value of right
	 *   e.Return count
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
		Assert.assertEquals(4, numberOfSubstrings("abbabc"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(1, numberOfSubstrings("abc"));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(0, numberOfSubstrings("aaaaaa"));
	}
	
	@Test
	public void test4()
	{
		Assert.assertEquals(9, numberOfSubstrings("abababababc"));
	}
	
	@Test
	public void test5()
	{
		Assert.assertEquals(10, numberOfSubstrings("cabcab"));
	}
	
	public int numberOfSubstrings(String s)
	{
		int count=0;
		int left =0,right=0;
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		while(right<s.length())
		{
			if(!map.containsKey(s.charAt(right))) map.put(s.charAt(right),1);
			else map.replace(s.charAt(right), map.get(s.charAt(right))+1);
			while(left<right&&map.size()==3)
			{
				count += s.length()-right;
				map.replace(s.charAt(left), map.get(s.charAt(left))-1);
				if(map.get(s.charAt(left))==0) map.remove(s.charAt(left));
				left++;
			}
			right++;
		}
		
		return count;
	}
	
	public int numberOfSubstrings2(String s)
	{
		int count=0;
		int left =0,right=0;
		int[] abcArray= new int[3];
		while(right<s.length())
		{
			abcArray[s.charAt(right)-'a']++;
			while(left<right&&abcArray[0]>0&&abcArray[1]>0&&abcArray[2]>0)
			{
				count += s.length()-right;
				abcArray[s.charAt(left)]--;
				left++;
			}
			right++;
		}
		
		return count;
	}
}
