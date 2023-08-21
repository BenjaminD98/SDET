package mandatoryHomeWork.week2;

import org.junit.Assert;
import org.junit.Test;

public class DayOfTheYear {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(9, dayOfYear("2019-01-09"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(41, dayOfYear("2019-02-10"));
	}
	
	public int dayOfYear(String date)
	{
		int day=0;
		int[] months= {31,28,31,30,31,30,31,31,30,31,30,31};
		for(int i=0;i<(((date.charAt(5)-'0')*10)+(date.charAt(6)-'0'))-1;i++)
		{
			day+=months[i];
			if(i==1)
			{
				if((((date.charAt(0)-'0')*1000)+((date.charAt(1)-'0')*100)+((date.charAt(2)-'0')*10)+(date.charAt(3)-'0'))%4==0)
				{
					if((((date.charAt(0)-'0')*1000)+((date.charAt(1)-'0')*100)+((date.charAt(2)-'0')*10)+(date.charAt(3)-'0'))!=1900)
					{
						day+=1;
					}
					
				}
			}
		}
		day+=(((date.charAt(8)-'0')*10)+(date.charAt(9)-'0'));
		return day;
	}
}
