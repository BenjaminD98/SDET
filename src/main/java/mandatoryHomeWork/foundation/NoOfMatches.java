package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class NoOfMatches {
	
	/*input teams
	 * output matches initially 0
	 * while teams>1
	 * if teams even teams/=2 matches=matches+(teams/2)
	 * if teams odd teams=((teams-1)/2)+1 matches=matches+((teams-1)/2)
	 * */
	
	public int noOfMatch(int teams)
	{
		int matches=0;
		while(teams>1)
		{
			if(teams%2==0)
			{
				matches=matches+(teams/2);
				teams=teams/2;
				
			}
			else
			{
				matches=matches+((teams-1)/2);
				teams=((teams-1)/2)+1;
				
			}
		}
		return matches;
		
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(6,noOfMatch(7));
	}

	@Test
	public void test2()
	{
		Assert.assertEquals(0,noOfMatch(1));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(1,noOfMatch(2));
	}
	
	@Test
	public void test4()
	{
		Assert.assertEquals(7,noOfMatch(8));
	}
}
