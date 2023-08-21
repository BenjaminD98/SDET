package mandatoryHomeWork.week2;

import org.junit.Assert;
import org.junit.Test;

public class EvenNumbersDivisibleBy3 {
	
	@Test
	public void test1()
	{
		int[] nums= {1,3,6,10,12,15};
		Assert.assertEquals(9, averageValue(nums));
	}
	
	public int averageValue(int[] nums)
	{
		int sum=0,x=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]%6==0)
			{
				sum+=nums[i];
				x++;
			}
		}
		if(x==0)return 0;
		return sum/x;
	}
}
