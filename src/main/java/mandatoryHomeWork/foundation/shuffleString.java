package mandatoryHomeWork.foundation;

import org.junit.Test;
import org.junit.Assert;

public class shuffleString {

	public String shuffle(String s, int[] indices)
	{
		char[] ch=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			ch[indices[i]]=s.charAt(i);
		}
		return String.valueOf(ch);
	}
	
	@Test
	public void test1()
	{
		String s="codeleet";
		int[] indices ={4,5,6,7,0,2,1,3};
		Assert.assertEquals("leetcode", shuffle(s,indices));
	}
	
	@Test
	public void test2()
	{
		String s="abc";
		int[] indices ={0,1,2};
		Assert.assertEquals("abc", shuffle(s,indices));
	}
	
}
