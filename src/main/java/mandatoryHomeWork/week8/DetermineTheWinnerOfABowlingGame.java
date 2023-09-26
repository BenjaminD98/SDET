package mandatoryHomeWork.week8;

import org.junit.Assert;
import org.junit.Test;

public class DetermineTheWinnerOfABowlingGame {

	/*
	 * 
	 * given two 0-indexed integer arrays player1 and player2, that represent the number of pins that player 1 and player 2 hit in a bowling game, respectively, Return 1 if player 1 wins, 2 if player 2 wins and 0 if it is a draw.
	 *
	 * 1.Input int[] ,int[]
	 *   Output int
	 *   Constraint 
	 *   	n == player1.length == player2.length
	 *   	1 <= n <= 1000
	 *   	0 <= player1[i], player2[i] <= 10
	 * 
	 * 2. player1 = {1,2,3,4,10,8,4} player2={1,2,3,4,5,6,7}, Output=1
	 *    player1 = {10,9,10,8,7} player2={10,8,8,10,7}, Output=1
	 *    player1 = {10,8,9} player2={10,10,10}, Output=2
	 *    player1 = {10,9,9,5} player2={5,10,9,9}, Output=0
	 *    player1 = {7} player2={8}, Output=2
	 * 
	 * 3.Solution known
	 * 
	 * 4.a.Using two pointers.
	 *   b.Using brute force
	 *   
	 *   
	 * 5. Pseudocode
	 * 	 a.Init int variables winner, player1Pointer, player2Pointer,doubler1Count, doubler2Count, player1Total and player2Total and assign their values to 0 and init boolean variables player1Doubler and player2Doubler to false.
	 *   b.Initialize while loop with condition where player1Pointer is less than length of player1 array and player2Pointer is less than player2 array
	 *   	a.If player1Doubler is true and doubler1Count is less than 2
	 *   		a.Double the value in index player1Pointer and add to player1Total
	 *   		b.Increment doubler1Count
	 *   	b.Else, add value in index player1Pointer to player1Total
	 *   	c.If player2Doubler is true and doubler2Count is less than 2
	 *   		a.Double the value in index player2Pointer and add to player2Total
	 *   		b.Increment doubler2Count
	 *   	d.Else, add value in index player2Pointer to player2Total
	 *   	e.If value in index player1Pointer is 10
	 *   		a.Set player1Doubler to true.
	 *   		b.Set doubler1Count to 0.
	 *   	f.If value in index player2Pointer is 10
	 *   		a.Set player2Doubler to true.
	 *   		b.Set doubler2Count to 0.
	 *   	g.Increment player1Pointer and player2Pointer.
	 *   c.If player1Total is greater than player2Total, set value of winner to 1
	 *   d.If player1Total is lesser than player2Total, set value of winner to 2.
	 *   e.Return winner.
	 *   
	 *   Time Complexity  - O(N)
	 *   Space Complexity - O(9) => O(1)
	 *    
	 * 6.Dry run successful for pseudocode on test data written.
	 * 7.Code written in notepad.
	 * 8.Dry running code successful.
	 * 9.Code written below in IDE.
	 * 10.Testing and debugging in IDE to be done.
	 * 11.Code Optimization to be done if needed.
	 */
	
	@Test
	public void test1()
	{
		Assert.assertEquals(1, isWinner(new int[] {1,2,3,4,10,8,4},new int[] {1,2,3,4,5,6,7}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(1, isWinner(new int[] {10,9,10,8,7},new int[] {10,8,8,10,7}));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(2, isWinner(new int[] {10,8,9},new int[] {10,10,10}));
	}

	@Test
	public void test4()
	{
		Assert.assertEquals(0, isWinner(new int[] {10,9,9,5},new int[] {5,10,9,9}));
	}
	
	@Test
	public void test5()
	{
		Assert.assertEquals(2, isWinner(new int[] {7},new int[] {8}));
	}
	
	public int isWinner(int[] player1, int[] player2)
	{
		int winner = 0, player1Pointer = 0, player2Pointer = 0, doubler1Count = 0, doubler2Count = 0, player1Total = 0, player2Total = 0;
		boolean player1Doubler = false, player2Doubler = false;
		while(player1Pointer<player1.length&&player2Pointer<player2.length)
		{
			if(player1Doubler==true&&doubler1Count<2)
			{
				player1Total+= 2*player1[player1Pointer];
				doubler1Count++;
			}
			else player1Total+= player1[player1Pointer];
			if(player2Doubler==true&&doubler2Count<2) 
			{
				player2Total+= 2*player2[player2Pointer];
				doubler2Count++;
			}
			else player2Total+= player2[player2Pointer];
			if(player1[player1Pointer]==10)
			{
				player1Doubler = true;
				doubler1Count = 0;
			}
			if(player2[player2Pointer]==10)
			{
				player2Doubler = true;
				doubler2Count = 0;
			}
			player1Pointer++;
			player2Pointer++;
		}
		if(player1Total>player2Total)
		{
			winner = 1;
		}
		else if(player1Total<player2Total)
		{
			winner = 2;
		}
		return winner;
	}
}
