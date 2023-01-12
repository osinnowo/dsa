import java.util.*;

public class FirstNonRepeatingCharacter {
    public int firstNonRepeatingCharacter1(String string) {
        for(int i = 0; i < string.length(); i++) {
            boolean isDuplicated = false;
            for(int j = 0; j < string.length(); j++) {
                if((i != j) && (string.charAt(i) == string.charAt(j))) {
                    isDuplicated = true;
                }
            }
            if(!isDuplicated) { return i; }
        }
        return -1;
    }

    public int firstNonRepeatingCharacter2(String string) { 
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < string.length(); i++) {
            map.put(string.charAt(i), map.get(string.charAt(i)) == null ? 0 : map.get(string.charAt(i)) + 1);
        }
        for(int index = 0; index < string.length(); index++) {
            if(map.get(string.charAt(index)) == 0) { return index; }
        }
        return -1;
    }

    public int firstNonRepeatingCharacter3(String string) {
       char[] characters = string.toCharArray();
       for(int index = 0; index < characters.length; index++) {
         if(string.indexOf(String.valueOf(characters[index])) == string.lastIndexOf(String.valueOf(characters[index]))) {
            return index;
         }
       }
       return -1;
    }
}
