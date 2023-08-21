package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class SquaresAndSort {
	
	public int[] squareSort(int[] nums)
	{
		int temp=0;
		for(int i=0;i<nums.length;i++)
		{
			temp=nums[i]*nums[i];
			nums[i]=temp;
		}
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				temp=0;
				if(nums[i]>nums[j])
				{
					temp=nums[j];
					nums[j]=nums[i];
					nums[i]=temp;
				}
			}
		}
		return nums;
	}
	
	@Test
	public void test1()
	{
		int[] nums = {-4,-1,0,3,10};
		int[] output= {0,1,9,16,100};
		Assert.assertArrayEquals(output, squareSort(nums));
	}
	
	@Test
	public void test2()
	{
		int[] nums = {-7,-3,2,3,11};
		int[] output= {4,9,9,49,121};
		Assert.assertArrayEquals(output, squareSort(nums));
	}
	
	@Test
	public void test3()
	{
		int[] nums = {-1,2,-3,4,-5,6};
		int[] output= {1,4,9,16,25,36};
		Assert.assertArrayEquals(output, squareSort(nums));
	}

}
