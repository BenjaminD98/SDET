package mandatoryHomeWork.week3;

import org.junit.Assert;
import org.junit.Test;

public class SpyNumbers {
	
	@Test
	public void test1()
	{
		Assert.assertTrue(ifSpyNumber(22));
	}
	
	@Test
	public void test2()
	{
		Assert.assertFalse(ifSpyNumber(1111));
	}
	
	@Test
	public void test3()
	{
		Assert.assertTrue(ifSpyNumber(0));
	}
	
	@Test
	public void test4()
	{
		Assert.assertFalse(ifSpyNumber(-125));
	}
	
	public boolean ifSpyNumber(int n)
	{
		if(n<0) return false;
		if((n>=0)&&(n<10)) return true;
		int sum=0,product=1;
		while(n>0)
		{
			sum+=(n%10);
			product*=(n%10);
			n/=10;
		}
		return sum==product;
	}

	
}
