package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class MergeStringAlternatively {
	
	public String merging(String a, String b)
	{
		
		String s1="";
		int x=0;
		if(a.length()>b.length())
		{
			x=b.length();
			s1=s1+a.substring(x);
		}
		else {
			x=a.length();
			s1=s1+b.substring(x);
		}
		String s2="";
		for(int i=0;i<x;i++)
		{
			s2=s2+a.charAt(i)+b.charAt(i);
		}
		
		return s2+s1;
		
		
		
	}
	
	@Test
	public void test1()
	{
		String word1 = "abc";
		String word2 = "pqr";
		Assert.assertEquals("apbqcr" , merging(word1,word2));
	}
	
	@Test
	public void test2()
	{
		String word1 = "ab";
		String word2 = "pqrs";
		Assert.assertEquals("apbqrs" , merging(word1,word2));
	}
	
	@Test
	public void test3()
	{
		String word1 = "abcd";
		String word2 = "pq";
		Assert.assertEquals("apbqcd" , merging(word1,word2));
	}
	
	@Test
	public void test4()
	{
		String word1 = "abcd";
		String word2 = "";
		Assert.assertEquals("abcd" , merging(word1,word2));
	}

}
