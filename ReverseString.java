/*
Author: Ronak Patel

First challenge in TheDailyByte series. Reverse a string.

*/
public class ReverseString
{
  public static void main(String args[])
  {
    //Intiantiate test strings given on coding prompt
    String test1 = "Cat";
    String test2 = "The Daily Byte";
    String test3 = "civic";

    //Placeholder string to test different cases
    String str = test2;

    //Testing the method with the 3 examples from above
    revString(test1);
    revString(test2);
    revString(test3);

  }

  /*
  Method to reverse the string given using a reverse for loop starting at
  the end of the string and iterating back to the start, printing as it
  iterates
  */
  public static void revString(String str){
    for(int i = str.length() - 1; i >= 0; i--)
    {
      System.out.print(str.charAt(i));
    }
    System.out.print("\n");
  }
}
