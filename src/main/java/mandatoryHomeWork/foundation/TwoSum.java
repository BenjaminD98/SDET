package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class TwoSum {
	
	public int[] sumTwo(int[] nums,int target)
	{
		int[] result=new int[2];
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums.length;j++)
			{
				if(i!=j)
				{
					if(nums[i]+nums[j]==target)
					{
						result[0]=i;
						result[1]=j;
					}
				}
			}
		}
		return result;
	}
	
	@Test
	public void test1()
	{
		int[] input= {3,2,4};
		int[] output= {1,2};
		int target=6;
		Assert.assertArrayEquals(output ,sumTwo(input,target) );
	}
	
	@Test
	public void test2()
	{	
		int[] input= {2,7,11,15};
		int[] output= {0,1};
		int target=9;
		Assert.assertArrayEquals(output ,sumTwo(input,target) );
	}
	
	@Test
	public void test3()
	{
		int[] input= {5,6};
		int[] output= {0,1};
		int target=11;
		Assert.assertArrayEquals(output ,sumTwo(input,target) );
	}

}
