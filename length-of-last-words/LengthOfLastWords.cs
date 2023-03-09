using System;

public class LengthOfLastWords {
    public int LengthOfLastWord(string word) {
        int end = word.Length - 1;
        
        while(end >= 0 && Char.IsWhiteSpace(word[end])) {
            end--;
        }

        int left = end;
        while(left >= 0 && !Char.IsWhiteSpace(word[left])) {
            left--;
        }

        return end - left;
    }
}