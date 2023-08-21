package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class ClimbingStairs {

	public int climbStairs(int n)
	{
		int a=0;
		int b=0;
		int steps=1;
		for(int i=0;i<n;i++)
		{
			a=steps;
			steps=steps+b;
			b=a;
		}
		return steps;
	}
	
	@Test
	public void test1()
	{
		int n=2;
		Assert.assertEquals(2 ,climbStairs(n) );
	}
	
	@Test
	public void test2()
	{
		int n=3;
		Assert.assertEquals(3 ,climbStairs(n) );
	}
	
	@Test
	public void test3()
	{
		int n=6;
		Assert.assertEquals(13 ,climbStairs(n) );
	}
}
