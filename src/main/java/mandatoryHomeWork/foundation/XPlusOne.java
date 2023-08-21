package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class XPlusOne {

	@Test
	public void test1()
	{
		int[] input= {1,2,3};
		Assert.assertEquals(2,xPlus(input));
	}
	
	@Test
	public void test2()
	{
		int[] input= {1,1,3,3,5,5,7,7};
		Assert.assertEquals(0,xPlus(input));
	}
	
	@Test
	public void test3()
	{
		int[] input= {1,1,2};
		Assert.assertEquals(2,xPlus(input));
	}
	
	public int xPlus(int[] input)
	{
		int count=0;
		for(int i=0;i<input.length;i++)
		{
			for(int j=0;j<input.length;j++)
			{
				if(input[i]+1==input[j])
				{
					count++;
				}
			}
		}
		return count;
	}
	
}
