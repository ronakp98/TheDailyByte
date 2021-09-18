public class PalindromeRemoval {
    
    public static void main(String[] args) {

        String str1 = "abcba";
        String str2 = "foobof";
        String str3 = "abccab";

        System.out.println(palindromeWithRemoval(str1));
        System.out.println(palindromeWithRemoval(str2));
        System.out.println(palindromeWithRemoval(str3));
    }

    public static boolean palindromeWithRemoval(String str)
    {

        StringBuilder inStr = new StringBuilder(str);
        String removedString = "";
        String reversedString = "";

        for(int i = 0; i < str.length(); i++)
        {
            inStr.setLength(0);
            inStr.append(str);
            removedString = inStr.deleteCharAt(i).toString();
            for(int j = removedString.length() - 1; j >= 0; j--)
            {
                reversedString += removedString.charAt(j);
            }
            if(reversedString.equals(removedString))
            {
                return true;
            }
            reversedString = "";
        }


        return false;
    }
}
