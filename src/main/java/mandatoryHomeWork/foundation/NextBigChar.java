package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class NextBigChar {
	
	public char nextBig(char[] input,char target)
	{
		int tar=target;
		for(int i=0;i<input.length;i++)
		{
			int char1=input[i];
			if(char1>tar)
			{
				return input[i];
			}
		}
		return '\0';
	}
	
	@Test
	public void test1()
	{
		char[] input1= {'a','e','i','o','u'};
		Assert.assertEquals('o',nextBig(input1,'m'));
	}

	@Test
	public void test2()
	{
		char[] input1= {'b','e','n'};
		Assert.assertEquals('\0',nextBig(input1,'x'));
	}
}
