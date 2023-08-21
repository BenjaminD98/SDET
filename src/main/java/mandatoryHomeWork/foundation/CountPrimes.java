package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class CountPrimes {
	
	@Test
	public void test1()
	{
		int n= 10;
		Assert.assertEquals(4,primeCount(n));
	}
	
	public int primeCount(int n)
	{
		if(n<3)
			return 0 ;
		int count=0;
		boolean[] notPrime = new boolean[n+1] ;
		for(int i=2 ; i*i<=n ; i++){
			if(notPrime[i])continue;
			for(int j = 2*i;j<=n;j+=i){
				notPrime[j] = true;
			}
		}

		for(int i=2;i<n;i++)
		{
			if(!notPrime[i])
				count++;
		}
		return count ;
	}

}
