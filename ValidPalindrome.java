/*
Author: Ronak Patel

Second challenge to make a program to check if any String is a valid
palindrome ignoring case and non-alphabetic characters

*/

public class ValidPalindrome 
{
    public static void main(String args[])
    {
        //Create 3 test cases given
        String str1 = "level";
        String str2 = "algorithm";
        String str3 = "A man, a plan, a canal: Panama.";

        //Testing the output of the 3 cases
        System.out.println(palindromeCheck(str1));
        System.out.println(palindromeCheck(str2));
        System.out.println(palindromeCheck(str3));

        assert(true);
    }

    public static boolean palindromeCheck(String str)
	{
        //Change str to all lowercase and remove any non-alphabetic character
        str = str.replaceAll("[^a-zA-z]", "").toLowerCase();

		//Create an empty string
		String reversedString = "";

		//Iterate backwards through the str passed in
		for(int i = str.length()-1; i > -1; i--)
		{
			//Add character at index i into reversed string 
			reversedString += str.charAt(i);
		}

        //Compares normal string to reversed string
        boolean isPalindrome = str.equals(reversedString);
        
		return isPalindrome;
	}
}
