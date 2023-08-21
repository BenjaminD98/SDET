package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class PowerOfThree {
	
	public boolean powerthree(int n)
	{
		
		while(n%3==0)
		{
			n=n/3;
		}
		return n==1;
	}
	
	@Test
	public void test1()
	{
		int n=27;
		Assert.assertEquals(true, powerthree(n));
	}
	
	@Test
	public void test2()
	{
		int n=1;
		Assert.assertEquals(true, powerthree(n));
	}
	
	@Test
	public void test3()
	{
		int n=-1;
		Assert.assertEquals(false, powerthree(n));
	}
	
	@Test
	public void test4()
	{
		int n=500;
		Assert.assertEquals(false, powerthree(n));
	}

}
