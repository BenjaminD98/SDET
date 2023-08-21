package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class AddDigits {
	
	@Test
	public void Test1()
	{
		int n=6;
		Assert.assertEquals(6,Digits(n));
	}
	
	@Test
	public void Test2()
	{
		int n=9999;
		Assert.assertEquals(9,Digits(n));
	}
	
	@Test
	public void Test3()
	{
		int n=199;
		Assert.assertEquals(1,Digits(n));
	}
	
	public int Digits(int n)
	{
		while(n>9)
		{
			n=n/10+(n%10);
		}
		return n;
	}

}
