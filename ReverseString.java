/*
Author: Ronak Patel

First challenge in TheDailyByte series. Reverse a string.

*/
public class ReverseString
{
	public static void main(String arg[]) 
	{
		//Create test strings
		String str1 = "Cat";
		String str2 = "The Daily Byte";
	  	String str3 = "civic";

		//Print string returned by method calls
		System.out.println(revString(str1));
		System.out.println(revString(str2));
		System.out.println(revString(str3));
	}

	public static String revString(String str)
	{
		//Create an empty string
		String reversedString = "";

		//Iterate backwards through the str passed in
		for(int i = str.length()-1; i > -1; i--)
		{
			//Add character at index i into reversed string 
			reversedString += str.charAt(i);
		}
		return reversedString;
	}
}