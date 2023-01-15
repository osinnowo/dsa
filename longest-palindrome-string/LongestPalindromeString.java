import java.util.*;

public class LongestPalindromeString {
    public static String longestPalindromeString(String string) {
        if(string.length() == 1) { return string; }
        String longestPalindrome = "";
        for(int i = 0; i < string.length(); i++) {
            for(int j = i + 1; j < string.length(); j++) {
                String substring = string.substring(i, j + 1);
                if((substring.length() > longestPalindrome.length()) && isPalindrome(substring)) {
                    longestPalindrome = substring;
                }
            }
        }
        return longestPalindrome;
    }

    public static boolean isPalindrome(String str) {
        for(int i = 0; i < str.length() / 2; i++) {
            if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(str.length() - i -1))) {
                return false;
            }
        }
        return true;
    }
}