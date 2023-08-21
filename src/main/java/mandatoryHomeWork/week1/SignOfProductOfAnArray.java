package mandatoryHomeWork.week1;

import org.junit.Test;
import org.junit.Assert;

public class SignOfProductOfAnArray {
	
	@Test
	public void test1()
	{
		int[] nums= {-1,-2,-3,-4,3,2,1};
		Assert.assertEquals(1,arraySign(nums));
	}
	
	@Test
	public void test2()
	{
		int[] nums= {1,5,0,2,-3};
		Assert.assertEquals(0,arraySign(nums));
	}
	
	@Test
	public void test3()
	{
		int[] nums= {1,-1,-1,-1};
		Assert.assertEquals(-1,arraySign(nums));
	}
	
	public int arraySign(int[] nums)
	{
		int product=1;
		for(int i=0;i<nums.length;i++)
		{
            if(nums[i]<0)
            	product*=-1;
            if(nums[i]==0)
            	product*=0;
		}
		return signFunc(product);
	}
	public int signFunc(int product)
	{
		if(product>0)
		{
			return 1;
		}
		if(product<0)
		{
			return -1;
		}
		return 0;
	}

}
