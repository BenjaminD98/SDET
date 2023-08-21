package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class FindDifferenceStrings {
	
	@Test
	public void test1()
	{
		String s="abcd";
		String t="abcde";
		Assert.assertEquals('e', stringDiff(s,t));
	}
	
	@Test
	public void test2()
	{
		String s="fig";
		String t="gift";
		Assert.assertEquals('t', stringDiff(s,t));
	}
	
	@Test
	public void test3()
	{
		String s="";
		String t="x";
		Assert.assertEquals('x', stringDiff(s,t));
	}
	
	public char stringDiff(String s, String t)
	{
		int sSum=0;
		int tSum=t.charAt(t.length()-1);
		
		for(int i=0;i<s.length();i++)
		{
			sSum=sSum+s.charAt(i);
			tSum=tSum+t.charAt(i);
		}
		
		return (char)(tSum-sSum);
	}

}
