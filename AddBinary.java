/*
Author: Ronak Patel

Add binary challenge question to return the sum of two binary strings

*/


public class AddBinary {
    
    public static void main(String args[])
    {
        System.out.println(binarySum("100", "1"));
        System.out.println(binarySum("11", "1"));
        System.out.println(binarySum("1", "0"));
    }

    public static String binarySum(String str1, String str2)
    {
        int num1 = Integer.parseInt(str1, 2);
        int num2 = Integer.parseInt(str2, 2);

        int sum = num1 + num2;

        String returnString = Integer.toBinaryString(sum);

        return returnString;
    }

}
