/*
Author: Ronak Patel

Correct Capitilization challenge questions to determine if any given string
is correctly using capitals(first letter, all letters, or no letters). Otherwise
return false

*/

public class CorrectCapitilization {
    public static void main(String args[])
    {
        //Test Strings
        String str1 = "USA"; //should return true
        String str2 = "Calvin"; //should return true
        String str3 = "compUter"; //should return false
        String str4 = "coding"; //should return true
        String str5 = "ComPuTeR";


        //Printing test results
        System.out.println(checkCapitilization(str1));
        System.out.println(checkCapitilization(str2));
        System.out.println(checkCapitilization(str3));
        System.out.println(checkCapitilization(str4));
        System.out.println(checkCapitilization(str5));

    }

    public static boolean checkCapitilization(String str)
    {
        //Return true if entire string is all Capital
        if(str.equals(str.toUpperCase()))
        {
            return true;
        }
        //Return true if everything after first letter is lowercase since first letter can either be upper or lower case
        if(str.substring(1).equals(str.substring(1).toLowerCase()))
        {
            return true;
        }
        //return false otherwise
        return false;
    }
}
