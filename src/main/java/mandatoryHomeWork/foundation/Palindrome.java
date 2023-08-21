package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class Palindrome {
	
	@Test
	public void test1()
	{
		int x=14455441;
		Assert.assertEquals(true,palind(x));
	}
	
	@Test
	public void test2()
	{
		int x=123456;
		Assert.assertEquals(false,palind(x));
	}
	
	@Test
	public void test3()
	{
		int x=1;
		Assert.assertEquals(true,palind(x));
	}
	
	@Test
	public void test4()
	{
		int x=-22;
		Assert.assertEquals(false,palind(x));
	}
	
	public boolean palind(int x)
	{
		int n=x;
		int reverse=0;
		while(x>0)
		{
			reverse=(x%10)+(reverse*10);
			x=x/10;
		}
		
		if(n==reverse)
		{
			return true;
		}
		else
			return false;
	}

}
