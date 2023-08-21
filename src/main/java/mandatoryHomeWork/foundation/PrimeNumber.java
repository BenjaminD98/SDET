package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumber {
	
	public boolean isPrime(int input)
	{
		int counter=0;
		for(int i=1;i<=input;i++)
		{
			if(input%i==0)
			{
				counter++;
			}
		}
		if(counter==2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true,isPrime(5));
		
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(false,isPrime(6));
		
	}

}
