package mandatoryHomeWork.week2;

import org.junit.Assert;
import org.junit.Test;

public class ThreeDivisors {

	@Test
	public void test1()
	{
		Assert.assertEquals(true, isThree(4));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(true, isThree(9));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(false, isThree(12));
	}
	
	public boolean isThree(int n)
	{
		int counter=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				counter++;
			}
			if(counter>3)
			{
				break;
			}
		}
		return counter==3;
	}
}
