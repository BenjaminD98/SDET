package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class DigitsReplaceCharacters {
	
	@Test
	public void test1()
	{
		String s= "a1c1e1";
		Assert.assertEquals("abcdef", replaceDigits(s));
	}
	
	@Test
	public void test2()
	{
		String s= "a1b2c3d4e";
		Assert.assertEquals("abbdcfdhe", replaceDigits(s));
	}
	
	public String replaceDigits(String s)
	{
		char[] a=new char[s.length()];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.charAt(i);
		}
		for(int i=0;i<a.length;i++)
		{
			int n=0;
			if((a[i]>='0')&&(a[i]<='9'))
			{
				n=a[i-1]+(a[i]-'0');
				a[i]=(char)n;
			}
		}
		s=String.valueOf(a);
		return s;
	}

}
