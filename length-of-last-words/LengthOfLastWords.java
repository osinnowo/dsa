import java.util.*;

public class LengthOfLastWords {
    public int lengthOfLastWord1(String word) { 
        int end = word.length() - 1;
        
        while(end >= 0 && Character.isWhitespace(word.charAt(end))) {
            end -= 1;
        }

        int left = end;
        while(left >= 1 && !Character.isWhitespace(word.charAt(left))) {
            left -= 1;
        }

        return end - left;
    }
}
