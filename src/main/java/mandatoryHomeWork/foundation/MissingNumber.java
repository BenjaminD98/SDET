package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class MissingNumber {
	
	@Test
	public void test1()
	{
		int[] num= {3,0,1};
		Assert.assertEquals(2,missingNo(num));
	}
	
	@Test
	public void test2()
	{
		int[] num= {0,1};
		Assert.assertEquals(2,missingNo(num));
	}
	
	@Test
	public void test3()
	{
		int[] num= {9,6,4,2,3,5,7,0,1};
		Assert.assertEquals(8,missingNo(num));
	}
	
	public int missingNo(int[] num)
	{
		int sum=0;
		int totalSum=num.length;
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
			totalSum=totalSum+i;
		}
		
		return totalSum-sum;
	}

}
