package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class ExcelColumns {
	
	@Test
	public void test1()
	{
		String s= "A";
		Assert.assertEquals(1,titleToNumber(s));
	}
	
	@Test
	public void test2()
	{
		String s= "AB";
		Assert.assertEquals(28,titleToNumber(s));
	}
	
	@Test
	public void test3()
	{
		String s= "ZY";
		Assert.assertEquals(701,titleToNumber(s));
	}
	
	public int titleToNumber(String columnTitle) {
        if(columnTitle.length()==1)
        {
            return (1)+columnTitle.charAt(0)-'A';
        }
        int result=0;
        for(int i=0;i<columnTitle.length();i++)
        {
            result=result*26+(columnTitle.charAt(i)-'A'+1);

        }
        return result;
    }

}
