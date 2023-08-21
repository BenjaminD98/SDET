package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class MaximumSixNine {
	@Test
	public void test1()
	{
		int n=96;
		Assert.assertEquals(99, MaxNum(n));
	}
	
	@Test
	public void test2()
	{
		int n=9696;
		Assert.assertEquals(9996, MaxNum(n));
	}
	
	@Test
	public void test3()
	{
		int n=9999;
		Assert.assertEquals(9999, MaxNum(n));
	}
	
	public int MaxNum(int n)
	{
		int count=0;
		int temp=n;
		while(temp>0)
		{
			temp/=10;
			count++;
		}
		temp=n;
		int[] arrOne=new int[count];
		int[] arrTwo=new int[count];
		while(n>0)
		{
			arrOne[--count]=n%10;
			n/=10;
		}
		for(int i=0;i<arrOne.length;i++)
		{
			for(int j=0;j<arrOne.length;j++)
			{
				if(i==j)
				{
					if(arrOne[i]==6)
					{
						arrTwo[i]=(arrTwo[i]*10)+9;
					}
					else
					{
						arrTwo[i]=(arrTwo[i]*10)+9;
					}
				}
				else
				arrTwo[i]=(arrTwo[i]*10)+arrOne[j];
			}
		}
		for(int i=0;i<arrTwo.length;i++)
		{
			if(arrTwo[i]>temp)
			{
				temp=arrTwo[i];
			}
		}
		return temp;
	}

}
