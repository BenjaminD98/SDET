package mandatoryHomeWork.week1;

import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class SelfDividingNumbers{

	@Test
	public void test1()
	{
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,15,22);
		List<Integer> selfDivision=selfie(1,22);
		Assert.assertEquals(list, selfDivision);
	}
	
	public List<Integer> selfie(int left,int right)
	{
		List<Integer> list=new ArrayList<Integer>();
		for(int i=left;i<=right;i++)
		{
			int n=i;
			boolean flag=true;
			while(n>0)
			{
				if(n%10==0){
					flag=false;
				n/=10;
				continue;
			}
			if(i%(n%10)!=0)
			{
				flag=false;
				break;
			}
			n/=10;
		}
		if(flag==true)
			list.add(i);
		}
	return list;
	}
}