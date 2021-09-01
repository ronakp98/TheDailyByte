/*
Author: Ronak Patel

Vacuum Cleaner questions where series of instructions are given in string form.
Determine if the vacuum cleaner returns to its original place

*/

public class VacuumCleaner {
    public static void main(String args[])
    {
        String str1 = "LR"; //should return true
        String str2 = "URURD"; //should return false
        String str3 = "RUULLDRD"; //should return true

        System.out.println(checkPosition(str1));
        System.out.println(checkPosition(str2));
        System.out.println(checkPosition(str3));

    }

    public static boolean checkPosition(String str)
    {
        //In the case that any lowercase characters were present
        str = str.toUpperCase();

        //Initialize two position variables
        int xPos = 0;
        int yPos = 0;

        //For loop to iterate through string instructions
        for(int i = 0; i < str.length(); i++)
        {
            //Switch statements takes each character of str and determines new position
            switch (str.charAt(i)) {
                case 'U':
                    yPos++;
                    break;
                case 'D':
                    yPos--;
                    break;
                case 'R':
                    xPos++;
                    break;
                case 'L':
                    xPos--;
                    break;
                default:
                    break;
            }
        }

        //Return true if x and y position are both 0
        return (xPos == 0 && yPos == 0);
    }
}
