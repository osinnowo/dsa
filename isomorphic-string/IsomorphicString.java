import java.util.*;

public class IsomorphicString {
    // foo -> bar
    // add -> egg
    public boolean IsIsomorphic(String first, String second) {
        if(first == null || second == null) { return false; }
        if(first.length() != second.length()) { return false; }
        if(first.length() == 0 && second.length() == 0) { return true; }
        if(first.equals(second)) { return true; }

        Map<Character, Character> map = new HashMap<>();

        for(int i = 0; i < first.length(); i++) {
            Character charOne = first.charAt(i);
            Character charTwo = second.charAt(i);
            Character character = getKey(map, charTwo);

            if(character != null && character != charOne) {
                return false;
            } else if(map.containsKey(charOne)){
                if(charTwo != map.get(charOne)) return false;
            } else {
                map.put(charOne, charTwo);
            }
        }

        return true;
    }
    public Character getKey(Map<Character, Character> map, Character character) {
        for(Map.Entry<Character, Character> entry: map.entrySet()) {
            if(entry.getValue().equals(character)) { return entry.getKey(); }
        }
        return null;
    }
}
