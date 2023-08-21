package mandatoryHomeWork.foundation;

import org.junit.Test;
import org.junit.Assert;

public class ContainsDuplicate {
	
	public boolean duplicate(int[] n)
	{
		for(int i=0;i<n.length;i++)
		{
			int count=1;
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]==n[j])
				{
					count++;
				}
			}
			if(count>1)
			{
				return true;
			}
		}
		return false;
	}
	
	@Test
	public void test1()
	{
		int[] n= {1,1,1,3,3,4,3,2,4,2};
		Assert.assertEquals(true , duplicate(n) );
	}
	
	@Test
	public void test2()
	{
		int[] n= {1,2,3,1};
		Assert.assertEquals(true , duplicate(n) );
	}
	
	@Test
	public void test3()
	{
		int[] n= {1,2,3,4};
		Assert.assertEquals(false , duplicate(n) );
	}

}
