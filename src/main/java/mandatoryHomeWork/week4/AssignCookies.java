package mandatoryHomeWork.week4;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class AssignCookies {
	
	/*
	 * 
	 * 1.Understood question. Give your children some cookies. But, you should give each child at most one cookie. Maximize the number of your content children and output the maximum number.
	 * 2.g={1,2,3,4,5,6,7} s={1,2,3,4,5} output= 5
	 *   g={1,2,3,4,5} s={1,1,1,1} output= 1 
	 *   g={1} s= {2,2,2,2,2} output=1
	 *   g={5,5,5,5,5} s={1,1} output= 0
	 *   g={1} s={} output=0
	 * 3.Solution known
	 * 4.1.Using brute force approach
	 *   2.Using sort and for loops and break
	 * 5.Pseudocode
	 * 	 1.Initialize count variable with type int as 0
	 *   2.If length of s is 0 return 0
	 * 	 3.Sort arrays s and g
	 *   4.Initialize for loop with i from 0 to length of g with iteration of 1
	 *   	a.Initialize for loop with j from 0 to length of s with increment of 1
	 *   		1.if value in ith element of g is greater than or equal to jth element of s
	 *   			a.Set value of jth element of s to 0
	 *   			b.Increment count by 1
	 *   			c.break out of inner loop
	 *   5.Return count
	 * 6.Dry run successful for pseudocode on test data written.
	 * 7.Code written in notepad.
	 * 8.Dry running code successful.
	 * 9.Code written below.
	 * 10.Testing and debugging in IDE to be done.
	 * 11.Code Optimization to be done if needed.
	 * 
	 */

	@Test
	public void test1()
	{
		int[] g={1,2,3,4,5,6,7};
		int[] s={1,2,3,4,5};
		Assert.assertEquals(5, findContentChildren2(g,s));
		
	}
	
	@Test
	public void test2()
	{
		int[] g={1,2,3,4,5};
		int[] s={1,1,1,1};
		Assert.assertEquals(1, findContentChildren2(g,s));	
	}
	 
	 @Test
	 public void test3()
	 {
		 int[] g={1};
		 int[] s= {2,2,2,2,2};
		 Assert.assertEquals(1, findContentChildren2(g,s));
	 }
	 
	 @Test
	 public void test4()
	 {
		 int[] g={5,5,5,5,5};
		 int[] s={1,1};
		 Assert.assertEquals(0, findContentChildren2(g,s));
	 }
	 
	 @Test
	 public void test5()
	 {
		 int[] g={1};
		 int[] s={};
		 Assert.assertEquals(0, findContentChildren2(g,s));
	 }
	 
	 public int findContentChildren(int[] g, int[] s) {
		int count=0;
		if(s.length==0) return 0;
		Arrays.sort(s);
		Arrays.sort(g);
		
		for(int i=0,k=0;i<g.length;i++)
		{
			if(g[i]>s[s.length-1]) return count;
			for(int j=k;j<s.length;j++)
			{
				if(s[j]>=g[i])
				{
					s[j]=0;
					count++;
					k=j;
					break;
				}
			}
		}
		
		
		return count;
     }
	
	public int findContentChildren2(int[] g, int[] s) {
   		int count = 0;
   		if(s.length == 0) return 0;
   		Arrays.sort(s);
   		Arrays.sort(g);
   		int gPointer = g.length-1, sPointer = s.length-1;
   		while(gPointer >= 0 && sPointer >= 0)
   		{
   			if(g[gPointer] <= s[sPointer])
   			{
   				count++;
   				sPointer--;
   			}
   			gPointer--;
   		}
	
	
   		return count;
	}
	
}
