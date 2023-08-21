package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class LastWordLength {
	
	public int lastWord(String s)
	{
		return s.trim().length()-1-s.trim().lastIndexOf(" ");
	}
	
	@Test
	public void test1()
	{
		String s="Hello World";
		Assert.assertEquals(5, lastWord(s));
	}
	
	@Test
	public void test2()
	{
		String s="   fly me   to   the moon  ";
		Assert.assertEquals(4, lastWord(s));
	}
	
	@Test
	public void test3()
	{
		String s="luffy is still joyboy";
		Assert.assertEquals(6, lastWord(s));
	}
	
	@Test
	public void test4()
	{
		String s="  Equals ";
		Assert.assertEquals(6, lastWord(s));
	}

}
