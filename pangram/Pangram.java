import java.util.*;

public class Pangram {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < sentence.length(); i++) {
            char character = sentence.charAt(i);
            if(!set.contains(character) && Character.isLetter(character)){
                set.add(character);
            } 
        }
        return set.size() == 26;
    }
}
