package mandatoryHomeWork.foundation;

import org.junit.Test;
import org.junit.Assert;

public class ValidPalindrome {

	public boolean palindrome(String s)
	{
		String one=s.toLowerCase().replaceAll("[^a-z0-9]", "");
		String reverse="";
		for(int i=one.length()-1;i>=0;i--)
		{
			reverse=reverse+one.charAt(i);
		}
		return one.equals(reverse);
	}
	
	@Test
	public void test1()
	{
		String s="A man, a plan, a canal: Panama";
		Assert.assertEquals(true, palindrome(s));
	}
	
	@Test
	public void test2()
	{
		String s="race a car";
		Assert.assertEquals(false, palindrome(s));
	}
	
	@Test
	public void test3()
	{
		String s="";
		Assert.assertEquals(true, palindrome(s));
	}
}
