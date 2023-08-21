package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class UniqueOccurence {
	
	@Test
	public void test1()
	{
		int[] arr= {1,2,2,1,1,3};
		Assert.assertEquals(true,occurence(arr));
	}
	
	@Test
	public void test2()
	{
		int[] arr= {1,2};
		Assert.assertEquals(false,occurence(arr));
	}
	
	@Test
	public void test3()
	{
		int[] arr= {-3,0,1,-3,1,1,1,-3,10,0};
		Assert.assertEquals(true,occurence(arr));
	}
	public boolean occurence(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]+=1000;
		}
		int[] n=new int[2001];
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			n[arr[i]]+=1;
			if(arr[i]<min)
			{
				min=arr[i];
			}
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		for(int i=min;i<=max;i++)
		{
			if(n[i]==0)continue;
			for(int j=min;j<=max;j++)
			{
				if(i==j)
					continue;
				if(n[i]==n[j])
					return false;
			}
		}
		return true;
		
	}

}
