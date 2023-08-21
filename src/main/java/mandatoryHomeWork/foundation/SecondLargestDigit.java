package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class SecondLargestDigit {
	
	@Test
	public void test1()
	{
		String s="dfa12321afd";
		Assert.assertEquals(2, sLargest(s));
	}
	
	@Test
	public void test2()
	{
		String s= "1111";
		Assert.assertEquals(-1, sLargest(s));
	}
	
	@Test
	public void test3()
	{
		String s="abc";
		Assert.assertEquals(-1, sLargest(s));
	}
	
	@Test
	public void test4()
	{
		String s="987654321";
		Assert.assertEquals(8, sLargest(s));
	}
	
	@Test
	public void test5()
	{
		String s="ck077";
		Assert.assertEquals(0, sLargest(s));
	}
	
	public int sLargest(String s)
	{
		s=s.replaceAll("[a-zA-Z]", "");
		int max=Integer.MIN_VALUE;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)-'0'>=max){
				max=s.charAt(i)-'0';
			}
		}
		int sMax=Integer.MIN_VALUE;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)-'0'>sMax)&&(s.charAt(i)-'0'!=max)){
				sMax=s.charAt(i)-'0';
			}
		}
		if(sMax!=Integer.MIN_VALUE)
		{
			return sMax;
		}
		return -1;
	}

}
