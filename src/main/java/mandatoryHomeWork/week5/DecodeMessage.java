package mandatoryHomeWork.week5;

import org.junit.Assert;
import org.junit.Test;

public class DecodeMessage {

	
	/*
	 * 
	 * 1.Understood question. Given the strings key and message, which represent a cipher key and a secret message. Return the decoded message.
	 * 2.key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv" output "this is a secret"
	 *   key = "eljuxhpwnyrdgtqkviszcfmabo", message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb" output "the five boxing wizards jump quickly"
	 * 3.Solution known
	 * 4.1.Using two char arrays and ascii value.
	 *   2.Using hashmap with key and cipher as key and value pair
	 * 5.Pseudocode
	 * 	 1.Intialize array count of type int with length as 26 and arrays keys and messages of type char with lengths of 26 and String message length respectively
	 *   2.Initialize for loop from 0 to key length
	 *   	a. If the character at i in key is white space use continue to skip current loop
	 *   	b. Using count array check if the character has occurred previously if not increase count for the character by 1 and enter the character in the keys array
	 *   3.Initialize for loop from 0 to length-1 of messages array with iteration of i+1
	 *      a. If the character at i in messages is white space use continue to skip current loop
	 *      b. call decoding method with arguments index i of array messages and keys array and store the char value returned in index i of messages 
	 *   4.In decoding method
	 *   	a. Initialize for loop from 0 to end of keys array
	 *   		1.Check if the char value message is equal to the index j value in keys array
	 *   		2.If true, assign the ascii value of character by adding index j and 97 and typecasting to char and return the value
	 *   5.Return the char array messages after converting to string
	 * 6.Dry run successful for pseudocode on test data written.
	 * 7.Code written in notepad.
	 * 8.Dry running code successful.
	 * 9.Code written below.
	 * 10.Testing and debugging in IDE to be done.
	 * 11.Code Optimization to be done if needed.
	 */
	
	@Test()
	public void test1()
	{
		Assert.assertEquals("this is a secret", decodeMessage("the quick brown fox jumps over the lazy dog","vkbs bs t suepuv"));

	}
	
	@Test()
	public void test2()
	{
		Assert.assertEquals("the five boxing wizards jump quickly", decodeMessage("eljuxhpwnyrdgtqkviszcfmabo","zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
	}
	
	public String decodeMessage(String key, String message) {
		
		int[] count= new int[26];
		char[] keys=new char[26];
		char[] messages=message.toCharArray();
		for(int i=0,j=0;i<key.length();i++)
		{
			if(key.charAt(i)==' ') continue;
			if(count[key.charAt(i)-'a']==0)
			{
				keys[j++]=key.charAt(i);
				count[key.charAt(i)-'a']++;
			}
		}
		
		for(int i=0;i<messages.length;i++)
		{
			if(messages[i]==' ') continue;
			messages[i]=decoding(messages[i],keys);
			
		}
		
		return new String(messages);
	}
	
	public char decoding(char messages,char[] key)
	{
		for(int j=0;j<key.length;j++)
		{
			if(messages==key[j])
			{
				messages=(char)(j+97);
				break;
			}
		}
		return messages;
	}
}
