package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class PowerOfTwo {

	public boolean powertwo(int n)
	{
		
		while(n%2==0)
		{
			n=n/2;
		}
		return n==1;
	}
	
	@Test
	public void test1()
	{
		int n=2048;
		Assert.assertEquals(true, powertwo(n));
	}
	
	@Test
	public void test2()
	{
		int n=1;
		Assert.assertEquals(true, powertwo(n));
	}
	
	@Test
	public void test3()
	{
		int n=-1;
		Assert.assertEquals(false, powertwo(n));
	}
	
	@Test
	public void test4()
	{
		int n=500;
		Assert.assertEquals(false, powertwo(n));
	}
}
