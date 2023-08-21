package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class SeniorCitizens {
	
	@Test
	public void test1()
	{
		String[] s={"7868190130M7522","5303914400F9211","9273338290F4010"};
		Assert.assertEquals(2, sixtyPlus(s));
	}
	
	@Test
	public void test2()
	{
		String[] s={"1313579440F2036","2921522980M5644"};
		Assert.assertEquals(0, sixtyPlus(s));
	}
	
	public int sixtyPlus(String[] s)
	{
		int count=0;
		for(int i=0;i<s.length;i++)
		{
			if((((s[i].charAt(11)-'0')*10)+(s[i].charAt(12))-'0')>60)
			{
				count++;
			}
		}
		return count;
	}

}
