package mandatoryHomeWork.week2;

import org.junit.Assert;
import org.junit.Test;

public class DayofTheWeek {
	
	@Test
	public void test1()
	{
		Assert.assertEquals("Saturday", dayOfTheWeek(31,8,2019));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals("Sunday", dayOfTheWeek(18,7,1999));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals("Sunday", dayOfTheWeek(15,8,1993));
	}
	
	public String dayOfTheWeek(int day, int month, int year)
	{
		int[] days= {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] result= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		int totalDays=day-1;
		if((year%4==0)&&(month>2))totalDays+=1;
		if((year==2100)&&(month>2))totalDays-=1;
		for(int i=1971;i<year;i++)
		{
			totalDays+=365;
			if(i%4==0)totalDays+=1;
		}
		for(int i=0;i<month-1;i++)
		{
			totalDays+=days[i];
		}
		return result[(totalDays+5)%7];
		
	}

}
