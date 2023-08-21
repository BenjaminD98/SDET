package mandatoryHomeWork.foundation;

import org.junit.Test;
import org.junit.Assert;

public class FirstPalindrome {

	public String palindrome(String[] s)
	{
		for(int i=0; i<s.length;i++)
		{
			String one=s[i];
			String reverse="";
			for(int j=one.length()-1; j>=0;j--)
			{
				reverse=reverse+one.charAt(j);
			}
			if(one.equals(reverse))
			{
				return one;
			}
		}
		return "";
	}
	
	@Test
	public void test1()
	{
		String[] s= {"abc","car","ada","racecar","cool"};
		Assert.assertEquals("ada", palindrome(s));
	}
	
	@Test
	public void test2()
	{
		String[] s= {"racecar"};
		Assert.assertEquals("racecar", palindrome(s));
	}
	
	@Test
	public void test3()
	{
		String[] s= {"abc","def"};
		Assert.assertEquals("", palindrome(s));
	}
	
	@Test
	public void test4()
	{
		String[] s= {};
		Assert.assertEquals("", palindrome(s));
	}
	
}
