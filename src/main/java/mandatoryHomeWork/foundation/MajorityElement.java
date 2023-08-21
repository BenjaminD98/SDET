package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;
public class MajorityElement {
	
	public int MajorElem(int[] input)
	{
		int output=input[0];
		for(int i=0;i<input.length;i++)
		{
			int counter=0;
			for(int j=0;j<input.length;j++)
			{
				if(input[i]==input[j])
				{
					counter++;
				}
				
			}
			if(counter>input.length/2)
			{
				output=input[i];
			}
		}
		return output;
	}
	
	@Test
	public void test1()
	{
		int[] input1= {1,2,3,4,3,3,3};
		Assert.assertEquals(3, MajorElem(input1));
	}
	
	@Test
	public void test2()
	{
		int[] input1= {2,2,2,2,2};
		Assert.assertEquals(2, MajorElem(input1));
	}

}
