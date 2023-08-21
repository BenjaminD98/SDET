package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class PlusOneLargeInt {
	
	@Test
	public void test1()
	{
		int[] s= {5,6,2,0,0,4,6,2,4,9};
		int[] result={5,6,2,0,0,4,6,2,5,0};
		Assert.assertArrayEquals(result, plusOne(s));
	}
	
	@Test
	public void test2()
	{
		int[] s= {9,9,9,9,9,9};
		int[] result={1,0,0,0,0,0,0};
		Assert.assertArrayEquals(result, plusOne(s));
	}
	
    public int[] plusOne(int[] digits) {

		int carryOver=1;
		for(int i=digits.length-1;i>=0;i--)
		{
			carryOver=digits[i]+carryOver;
			digits[i]=carryOver%10;
			carryOver=carryOver/10;
		}
		if(carryOver==0)
		{
			return digits;
		}
		int[] newArr=new int[digits.length+1];
		newArr[0]=carryOver;
		for(int i=newArr.length-1;i>0;i--)
		{
			newArr[i]=digits[i-1];
		}
		return newArr;

    }

}
