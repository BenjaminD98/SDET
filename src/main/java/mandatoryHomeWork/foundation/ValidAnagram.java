package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class ValidAnagram {
	
	@Test
	public void test1()
	{
		String s= "anagram";
		String t= "nagaram";
		Assert.assertEquals(true,isAnagram(s,t));
	}
	
	@Test
	public void test2()
	{
		String s= "cat";
		String t= "rat";
		Assert.assertEquals(false,isAnagram(s,t));
	}
	
	@Test
	public void test3()
	{
		String s= "";
		String t= "t";
		Assert.assertEquals(false,isAnagram(s,t));
	}
	
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int[] n=new int[26];
        for(int i=0;i<s.length();i++)
        {
            n[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++)
        {
            n[t.charAt(i)-'a']--;
        }
        for(int i=0;i<n.length;i++)
        {
            if(n[i]!=0)return false;
        }
        return true;
    }

}
