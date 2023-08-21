package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class SingleNumber {
	
	@Test
	public void test1()
	{
		int x[]= {5,6,7,8,5,6,7};
		Assert.assertEquals(8, singNum(x));
	}
	
	@Test
	public void test2()
	{
		int x[]= {1,2,3,2,3};
		Assert.assertEquals(1, singNum(x));
	}
	
	@Test
	public void test3()
	{
		int x[]= {25};
		Assert.assertEquals(25, singNum(x));
	}
	
	public int singNum(int[] x)
	{
		for(int i=0;i<x.length;i++)
		{
			int count=0;
			for(int j=0;j<x.length;j++)
			{
				if(x[i]==x[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				return x[i];
			}
		}
		return 0;
	}
	

}
