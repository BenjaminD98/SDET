package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class PivotIndex {
	
	@Test
	public void test1()
	{
		int[] n= {1,7,3,6,5,6};
		Assert.assertEquals(3, findPivot(n));
	}
	
	@Test
	public void test2()
	{
		int[] n= {1,2,3};
		Assert.assertEquals(-1, findPivot(n));
	}
	
	@Test
	public void test3()
	{
		int[] n= {2,1,-1};
		Assert.assertEquals(0, findPivot(n));
	}
	
	public int findPivot(int[] n)
	{
		int[] a=new int[n.length];
		int[] b=new int[n.length];
		a[0]=0;
		int x=b.length-1;
		b[x]=0;
		x--;
		for(int i=1;i<n.length;i++,x--)
		{
			a[i]=a[i-1]+n[i-1];
			b[x]=b[x+1]+n[x+1];
		}
		
		for(int i=0;i<n.length;i++)
		{
			if(a[i]==b[i])
			{
				return i;
			}
		}
		return -1;
	}

}
