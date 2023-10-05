package mandatoryHomeWork.foundation;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

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
	
    /*public boolean isAnagram(String s, String t) {
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
    }*/
    
    public boolean isAnagram(String s, String t) {
        int pointer=0;
        if(s.length()!=t.length())return false;
        ConcurrentHashMap<Character,Integer> map= new ConcurrentHashMap();
        while(pointer<s.length())
        {
            map.put(s.charAt(pointer),map.getOrDefault(s.charAt(pointer),0)+1);
            map.put(t.charAt(pointer),map.getOrDefault(t.charAt(pointer),0)-1);
            System.out.println(Arrays.asList(map));
            pointer++;
        }
        pointer=0;
        while(pointer<s.length())
        {
            if(map.get(s.charAt(pointer))==null) 
            {
                pointer++;
                continue;
            }
            if(map.get(s.charAt(pointer))<=0) map.remove(s.charAt(pointer));
            pointer++;
        }
        if(map.isEmpty())return true;
        return false;
    }

    public boolean isAnagram2(String s, String t) {
        int[] count= new int[26];
        for(int i=0;i<s.length();i++)
        {
        	count[s.charAt(i)-'a']++;
        }
        for(int i=0;i<count.length;i++)
        {
        	if(count[i]<0)
        	{
        		return false;
        	}
        }
    	return true;
    }
}
