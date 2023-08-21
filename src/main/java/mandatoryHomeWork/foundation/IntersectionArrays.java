package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class IntersectionArrays {
	
	@Test
	public void test1()
	{
		int[] nums1= {1,2,2,1};
		int[] nums2= {2,2};
		int[] output= {2};
		Assert.assertEquals(output,intersect(nums1,nums2));
	}
	
	public int[] intersect(int[] nums1, int[] nums2)
	{
		int k=0;
		if(nums1.length>nums2.length)
		{
			k=nums1.length;
		}
		else
			k=nums2.length;
		int[] arr=new int[k];
		int x=0;
		for(k=0;k<arr.length;k++)
		{
			arr[k]=Integer.MAX_VALUE;
		}
		for(int i=0;i<nums1.length;i++)
		{
			for(int j=0;j<nums2.length;j++)
			{
				if(nums1[i]==nums2[j])
				{
					int count=0;
					for(k=0;k<arr.length;k++)
					{
						if(arr[k]==nums1[i])
						{
							count++;
						}
					}
					if(count==0)
					{
						arr[x]=nums1[i];
						x++;
					}
					
				}
				
			}
		}
		int[] nums4 = new int[x];
		for(int i=0;i<x;i++)
		{
			nums4[i]=arr[i];
		}
		
		return nums4;
	}

}
