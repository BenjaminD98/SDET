package mandatoryHomeWork.week1;

import org.junit.Test;
import org.junit.Assert;

public class AlternatingDigitSum {

	@Test
	public void test1()
	{
		Assert.assertEquals(4,alternateDigitSum(521));
	}
	public int alternateDigitSum(int n) {
		int x=n;
		int i=0;
		while(x>0)
		{
			x/=10;
			i++;
		}
		for(;i>=0;i--)
		{
			if(i%2==0)
			{
				x-=(n%10);
				n/=10;
			}
			else
			{
				x+=(n%10);
				n/=10;
			}
		}
		return x;
	}
}
