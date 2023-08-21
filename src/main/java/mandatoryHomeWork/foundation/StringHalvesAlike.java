package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class StringHalvesAlike {

	public boolean vowelsCheck(String s)
	{
		String a=s.substring(0, s.length()/2).replaceAll("[^aeiouAEIOU]", "");
		String b=s.substring(s.length()/2).replaceAll("[^aeiouAEIOU]", "");
		return a.length()==b.length();
	}
	
	@Test
	public void test1()
	{
		String s="book";
		Assert.assertEquals(true, vowelsCheck(s));
	}
	
	@Test
	public void test2()
	{
		String s="test";
		Assert.assertEquals(false, vowelsCheck(s));
	}
	
	@Test
	public void test3()
	{
		String s="aaaa";
		Assert.assertEquals(true, vowelsCheck(s));
	}
	
	@Test
	public void test4()
	{
		String s="bbbb";
		Assert.assertEquals(true, vowelsCheck(s));
	}
}
