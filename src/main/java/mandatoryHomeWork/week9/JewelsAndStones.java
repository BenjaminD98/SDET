package mandatoryHomeWork.week9;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class JewelsAndStones {
	
	/*
	 * 
	 * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
	 * 
	 * 1.Input String , String
	 *   Output int
	 *   Constraint 
	 *   	1 <= jewels.length, stones.length <= 50
	 *   	jewels and stones consist of only English letters
	 *   	All the characters of jewels are unique.
	 * 
	 * 2. jewels = "Bn", stones = "Benjamin", Output = 3
	 *    jewels = "bN", stones = "Benjamin", Output = 0
	 *    jewels = "xyzXYZ", stones = "Benjamin", Output = 0
	 *    jewels = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyY", stones = "Benjamin", Output = 8
	 *    jewels = "b", stones = "B", Output = 0
	 * 
	 * 3.Solution known
	 * 
	 * 4.a.Using HashSet
	 *   b.Using brute force
	 *   
	 *   
	 * 5. Pseudocode
	 * 	 a.Init int variables count and pointer and assign their values to 0 .
	 * 	 b.Initialize new hashset with type character.
	 *   c.Initialize while loop with condition where pointer is less than length of jewels.
	 *   	a.Add all characters in jewels to hashset.
	 *   	b.Increment pointer
	 *   d.Set pointer to 0
	 *   e.Initialize while loop with condition pointer is less than length of stones
	 *   	a.If the hashset contains character at index pointer in stones, increment count.
	 *   	b.Increment pointer.
	 *   f.Return count.
	 *   
	 *   Time Complexity  - O(N+M)
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
		Assert.assertEquals(3, numJewelsInStones("Bn","Benjamin"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(0, numJewelsInStones("bN","Benjamin"));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(0, numJewelsInStones("xyzXYZ","Benjamin"));
	}

	@Test
	public void test4()
	{
		Assert.assertEquals(8, numJewelsInStones("aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyY","Benjamin"));
	}
	
	@Test
	public void test5()
	{
		Assert.assertEquals(0, numJewelsInStones("b","B"));
	}
	
	public int numJewelsInStones(String jewels, String stones)
	{
		int count = 0, pointer = 0;
		Set<Character> set = new HashSet();
		while(pointer<jewels.length())
		{
			set.add(jewels.charAt(pointer++));
		}
		pointer=0;
		while(pointer<stones.length())
		{
			if(set.contains(stones.charAt(pointer)))
			{
				count++;
			}
			pointer++;
		}
		return count;
	}
}
