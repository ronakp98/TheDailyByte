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

    revString(test1);
    revString(test2);
    revString(test3);

  }

  public static void revString(String str){
    for(int i = str.length() - 1; i >= 0; i--)
    {
      System.out.print(str.charAt(i));
    }
    System.out.print("\n");
  }
}
//Comment
