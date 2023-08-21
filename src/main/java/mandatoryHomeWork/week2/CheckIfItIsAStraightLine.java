package mandatoryHomeWork.week2;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfItIsAStraightLine {
	
	@Test
	public void test1()
	{
		int[][] coordinates= {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
		Assert.assertEquals(true, checkStraightLine(coordinates));
	}
	
	@Test
	public void test2()
	{
		int[][] coordinates= {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
		Assert.assertEquals(false, checkStraightLine(coordinates));
	}
	
	public boolean checkStraightLine(int[][] coordinates)
	{
		
		int a=0,b=0;
		a=coordinates[1][0]-coordinates[0][0];
		b=coordinates[1][1]-coordinates[0][1];
		
		for(int i=1;i<coordinates.length-1;i++)
		{
			if((coordinates[i+1][0]-coordinates[i][0]!=a)||(coordinates[i+1][1]-coordinates[i][1]!=b))
			{
				return false;
			}
		}
		
		
		return true;
	}

}
