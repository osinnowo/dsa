using System;
using System.Collections.Generic;
public class Palindrome {
    public static bool IsPalindrome1(string str) 
    {
        int left = 0;
        int right = str.Length - 1;
        while (left < right)
        {
            if (Char.ToLower(str[left]) != Char.ToLower(str[right])) { return false; }
            left++; right--;
        }
        return true;
    }

    public static bool IsPalindrome2(string str) 
    {
        int left = 0;
        int right = str.Length - 1;
        while(left < right) {
            while(left < right && !Char.IsLetterOrDigit(str[left])) { left++; }
            while(left < right && !Char.IsLetterOrDigit(str[right])) { right--; }
            if(Char.ToLower(str[left]) != Char.ToLower(str[right])) { return false; }
            left++; right--;
        }
        return true;
    }
}