/*
Author: Ronak Patel


*/
public class LongestCommonPrefix {
    
    public static void main(String[] args) {
        String[] array1 = {"colorado", "color", "cold"};
        String[] array2 = {"a", "b", "c"};
        String[] array3 = {"spot", "spotty", "spotted"};

        System.out.println(commonPrefix(array1));
        System.out.println(commonPrefix(array2));
        System.out.println(commonPrefix(array3));
    }

    public static String commonPrefix(String[] inArray)
    {
        int maxLength = smallest(inArray).length();
        int substring = 0;
        boolean isSameFlag = true;
        char compareChar;

        for(int i = 0; i < maxLength; i++)
        {
            compareChar = inArray[0].charAt(i);
            for (int j = 0; j < inArray.length; j++)
            {
                if(inArray[j].charAt(i) == compareChar)
                {
                    isSameFlag = true;
                }
                else{
                    isSameFlag = false;
                    break;
                }
            }
            if(isSameFlag == true)
            {
                substring++;
            }
            else{
                break;
            }
        }
        return (inArray[0].substring(0, substring));
    }

    
    public static String smallest(String words[]) {
        if (words == null || words.length < 1) {
            return "";
        }
        String smallest = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < smallest.length()) {
                smallest = words[i];
            }
        }
        return smallest;
    }

    
}
