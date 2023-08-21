package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class FindOccurence {

	public int occurs(int[] n,int num)
	{
		int count=0;
		for(int i=0;i<n.length;i++)
		{
			if(n[i]==num)
			{
				count++;
			}
		}
		return count;
	}
	
	@Test
	public void test1()
	{
		int[] n= {1,2,3,4,5,6,1,2,1};
		int num=1;
		Assert.assertEquals(3, occurs(n,num));
	}
	
	@Test
	public void test2()
	{
		int[] n= {};
		int num=5;
		Assert.assertEquals(0, occurs(n,num));
	}
	
	@Test
	public void test3()
	{
		int[] n= {1,1,1,1,1,1,1,8};
		int num=8;
		Assert.assertEquals(1, occurs(n,num));
	}
}
