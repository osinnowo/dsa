import java.util.*;

public class ValidAnagram {
    public static boolean isValidAnagram(String s, String t) {
        if(s.length() != t.length()) { return false; }
        char[] sCharacters = s.toCharArray();
        char[] tCharacters = t.toCharArray();

        Arrays.sort(sCharacters);
        Arrays.sort(tCharacters);

        String sWord = new String(sCharacters);
        String tWord = new String(tCharacters);

        return sWord.contentEquals(tWord);
    }
}