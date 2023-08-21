package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfSteps {
	
	public int arrangingCoins(int coins)
	{
		int steps=0;
		for(steps=0;steps<coins;)
		{
			steps++;
			coins=coins-steps;
		}

		return steps;
	}
	
	@Test
	public void test1()
	{
		int n=5;
		int output=2;
		Assert.assertEquals(output,arrangingCoins(n));
	}
	
	@Test
	public void test2()
	{
		int n=10;
		int output=4;
		Assert.assertEquals(output,arrangingCoins(n));
	}
	
	@Test
	public void test3()
	{
		int n=1;
		int output=1;
		Assert.assertEquals(output,arrangingCoins(n));
	}

}
