package mandatoryHomeWork.week1;

import org.junit.Assert;
import org.junit.Test;

public class ColorOfChessBoard {
	   
	@Test
	public void test1()
	{
		Assert.assertEquals(false, squareIsWhite("a1"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(false, squareIsWhite("c3"));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(true, squareIsWhite("b5"));
	}
	
	@Test
	public void test4()
	{
		Assert.assertEquals(true, squareIsWhite("d7"));
	}

	public boolean squareIsWhite(String coordinates) {
		if((((coordinates.charAt(1)-'0')%2!=0)&&((coordinates.charAt(0)-'a'+1)%2!=0))||(((coordinates.charAt(1)-'0')%2==0)&&((coordinates.charAt(0)-'a'+1)%2==0)))
		{
			return false;
		}
		return true;
	}
}
