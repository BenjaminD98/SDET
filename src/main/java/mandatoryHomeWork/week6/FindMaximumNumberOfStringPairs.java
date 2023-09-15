package mandatoryHomeWork.week6;

public class FindMaximumNumberOfStringPairs {

	/*
	 * 
	 * 1.Understood question. The string words[i] can be paired with the string words[j] if the string words[i] is equal to the reversed string of words[j].
	 *   
	 *   Input String[]
	 *   Ouptut int
	 *   Constraints
	 *   	1 <= words.length <= 50
	 *   	words[i].length == 2
	 *   	words consists of distinct strings.
	 *   	There is at least one word in s.
	 *   	words[i] contains only lowercase English letters.
	 *   
	 *   
	 * 2.{"ab","bc","ca","ac","cb,"ba"} output =3
	 * 	 {"xy"} output=0
	 *   {"ab,"bc","cd"} output=0
	 *   
	 * 3.Solution known
	 * 
	 * 4.1.Using a for loop and function to reverse the words in a string and check if they match
	 *   2.Using for loop to check and stringbuilder to reverse
	 * 
	 * 5.Pseudocode
	 * 	 1.Initialize variable count of type int and boolean array
	 *   2.Initialize for loop to iterate from 0 to array length
	 *   	a.Initialize for loop from i to array length
	 *   		1.If the string and reversed string are equal
	 * ` 			a.set values to true in boolean array
	 * 				b.increment count 
	 *   5.Return count
	 * 
	 * 6.Dry run successful for pseudocode on test data written.
	 * 7.Code written in notepad.
	 * 8.Dry running code successful.
	 * 9.Code written below in IDE.
	 * 10.Testing and debugging in IDE to be done.
	 * 11.Code Optimization to be done if needed.
	 */
	
	public int maximumNumberOfStringPairs(String[] words)
	{
		int count=0;
		boolean[] check=new boolean[words.length];
		for(int i=0;i<words.length;i++)
		{
			if(check[i]) continue;
			for(int j=i;j<words.length;j++)
			{
				if(check[j]) continue;
				if(words[j].equals(words[i].charAt(1)+words[i].charAt(0)))
				{
					check[i]=true;
					check[j]=true;
					count++;
				}
			}
		}
		return count;
	}
}
