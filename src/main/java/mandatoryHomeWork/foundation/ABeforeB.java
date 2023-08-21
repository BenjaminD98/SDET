package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class ABeforeB {
	
	@Test
	public void test1()
	{
		String s="aaabbb";
		Assert.assertEquals(true, containsBA(s));
	}
	
	@Test
	public void test2()
	{
		String s="abab";
		Assert.assertEquals(false, containsBA(s));
	}
	
	@Test
	public void test3()
	{
		String s="bbb";
		Assert.assertEquals(true, containsBA(s));
	}
	
	public boolean containsBA(String s)
	{
		return !s.contains("ba");
	}
	
	

}
