package mandatoryHomeWork.week1;

import org.junit.Assert;
import org.junit.Test;

public class MoneyinLeetcodeBank {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(10 ,totalMoney(4) );
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(37 ,totalMoney(10) );
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(96 ,totalMoney(20) );
	}
	
	public int totalMoney(int n)
	{
        int x=0;
		int a=1;
		int b=0;
		for(int i=1;i<=n;i++,a++)
		{
			x+=(b+a);
			if(a%7==0){
				a=0;
				b++;
			}
		}
		return x;
	}

}
