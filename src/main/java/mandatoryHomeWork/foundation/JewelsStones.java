package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class JewelsStones {
	
	@Test
	public void test1()
	{
		String jewels="aA";
		String stones="aAAbbbb";
		Assert.assertEquals(3, noOfStones(jewels,stones));
		
	}
	
	@Test
	public void test2()
	{
		String jewels="z";
		String stones="ZZ";
		Assert.assertEquals(0, noOfStones(jewels,stones));
		
	}
	
	@Test
	public void test3()
	{
		String jewels="";
		String stones="";
		Assert.assertEquals(0, noOfStones(jewels,stones));
		
	}
	
	@Test
	public void test4()
	{
		String jewels="ABc";
		String stones="";
		Assert.assertEquals(0, noOfStones(jewels,stones));
		
	}
	
	@Test
	public void test5()
	{
		String jewels="aAbBc";
		String stones="aaaaaAAAdddddd";
		Assert.assertEquals(8, noOfStones(jewels,stones));
		
	}
	
	public int noOfStones(String jewels, String stones)
	{
		int n=stones.length();
		for(int i=0;i<jewels.length();i++)
		{
			stones=stones.replaceAll(stones.valueOf(jewels.charAt(i)), "");
		}
		return n-stones.length();
	}

}
