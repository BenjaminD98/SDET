package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class MovingZeroes {
	
public int[] moveZeroes(int[] nums) {
        
        for(int i=0;i< nums.length-1;i++){
            for(int j=i+1;j< nums.length;j++){
                if(nums[i] == 0){
                    int temp = 0;
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;

                }
            }



        }

        return nums;
    }

	@Test
	public void test1()
	{
		int[] n= {0,1,0,3,12};
		int[] output= {1,3,12,0,0};
		Assert.assertArrayEquals(output, moveZeroes(n));
	}

}
