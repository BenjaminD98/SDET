package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class BuySellStocks {
	
	public int stocks(int[] price)
	{
		int profit=0;
		for(int i=0;i<price.length;i++)
		{
			for(int j=i+1;j<price.length;j++)
			{
				if(price[j]-price[i]>profit)
				{
					profit=price[j]-price[i];
				}
			}
		}
		return profit;
	}
	
	@Test
	public void test1()
	{
		int[] price1= {7,4,1};
		Assert.assertEquals(0,stocks(price1));
	}
	
	@Test
	public void test2()
	{
		int[] price1= {7,2,3,4,5,6};
		Assert.assertEquals(4,stocks(price1));
	}
	
	@Test
	public void test3()
	{
		int[] price1= {2,2,2,2,2,2};
		Assert.assertEquals(0,stocks(price1));
	}

}
