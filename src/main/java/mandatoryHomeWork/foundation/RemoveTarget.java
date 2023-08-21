package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class RemoveTarget {
	
	public int[] remove(int[] input, int target)
	{
		int x=0;
		int count=0;
		for(int i=0;i<input.length;i++)
		{
			if(input[i]==target)
			{
				count++;
			}
		}
		int[] output= new int[input.length-count];
		
		for(int i=0;i<input.length;i++)
		{
			if(input[i]!=target)
			{
				output[x]=input[i];
				x++;
			}
		}
		return output;
	}
	
	@Test
	public void test1()
	{
		int[] input = {1,1,3,3,5,5,7,7};
		int target = 5;
		int[] output= {1,1,3,3,7,7};
		Assert.assertArrayEquals(output,remove(input,target));
	}
	
	@Test
	public void test2()
	{
		int[] input = {3,3,3,3};
		int target = 3;
		int[] output= {};
		Assert.assertArrayEquals(output,remove(input,target));
	}

}
