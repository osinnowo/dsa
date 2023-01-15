using System;

public class LongestPalindromeString 
{
    public static string LongestPalindromeStrings(string str) {
       if(str.Length == 1) { return str; }
        string longestSubstring = "";
        for(var i = 0; i < str.Length; i++) {
            for(var j = i; j < str.Length; j++) {
                string substring = str.Substring(i, j + 1 - i);
                if(substring.Length > longestSubstring.Length && IsPalindrome(substring)) {
                    longestSubstring = substring;
                }
            }
        }
        return longestSubstring;
    }

    public static bool IsPalindrome(string str) {
        for(var i = 0; i < str.Length / 2; i++) {
            if(Char.ToLower(str[i]) != Char.ToLower(str[str.Length - i - 1])) return false;
        }
        return true;
    }
}