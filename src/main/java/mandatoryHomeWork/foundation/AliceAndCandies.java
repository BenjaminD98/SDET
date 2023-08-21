package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class AliceAndCandies {
	
	public int totalCandies(int[] arr)
	{
		int[] newarr=new int[arr.length];
		int x=0;
		for(int k=0;k<newarr.length;k++)
		{
			newarr[k]=Integer.MAX_VALUE;
		}
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<newarr.length;j++)
			{
				if(arr[i]==newarr[j])
				{
					count++;
				}
			}
			if(count==0)
			{
				newarr[x]=arr[i];
				x++;
			}
			
		}
		if(x>arr.length/2)
		{
			return arr.length/2;
		}
		else
		{
			return x;
		}
	}
	
	@Test
	public void test1()
	{
		int[] arr= {1,1,2,2,3,3};
		Assert.assertEquals(3,totalCandies(arr));
	}
	
	@Test
	public void test2()
	{
		int[] arr= {1,1};
		Assert.assertEquals(1,totalCandies(arr));
	}
	
	@Test
	public void test3()
	{
		int[] arr= {1,2,3,4};
		Assert.assertEquals(2,totalCandies(arr));
	}
	
	
	

}
